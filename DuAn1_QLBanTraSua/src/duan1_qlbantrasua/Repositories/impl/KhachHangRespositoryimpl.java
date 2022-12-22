/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.KhachHang;
import duan1_qlbantrasua.Repositories.KhachHangRespository;
import duan1_qlbantrasua.Utilties.DBConnection;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Giang
 */
public class KhachHangRespositoryimpl implements KhachHangRespository {

    private DBConnection connection;

    @Override
    public ArrayList<KhachHang> getListKhachHangDB() {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        String query = "SELECT * FROM khach_hang";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang k = new KhachHang();
                k.setId(rs.getString(1));
                k.setMa(rs.getString(2));
                k.setHoVaTen(rs.getString(3));
                k.setsDT(rs.getString(4));
                k.setNgaySinhl(rs.getDate(5));
                k.setEmail(rs.getString(6));
                k.setDiaChi(rs.getString(7));
                k.setDiem(rs.getInt(8));
                k.setGhiChu(rs.getString(9));
                k.setTrangThai(rs.getInt(10));

                listKhachHang.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKhachHang;
    }

    @Override
    public Boolean themKhachHang(KhachHang k) {
        int checkThem = 0;
        Timestamp date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String query = "Insert into khach_hang(ma,ho_va_ten,sdt,ngay_sinh,email,dia_chi,diem,ghi_chu,trang_thai)"
                + " values (?,?,?,?,?,?,?,?,?)\n";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            java.sql.Date sqlDate1 = new java.sql.Date(k.getNgaySinhl().getTime());
            ps.setString(1, k.getMa());
            ps.setString(2, k.getHoVaTen());
            ps.setString(3, k.getsDT());
            ps.setDate(4, sqlDate1);
            ps.setString(5, k.getEmail());
            ps.setString(6, k.getDiaChi());
            ps.setInt(7, k.getDiem());
            ps.setString(8, k.getGhiChu());
            ps.setInt(9, k.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateKhachHang(KhachHang k, String id) {
        int checkUpdate = 0;
        String query = "Update khach_hang set ma=?,ho_va_ten=?,sdt=?,ngay_sinh=?"
                + ",email=?,dia_chi=?,ghi_chu=?,trang_thai=?\n"
                + "where id=?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            java.sql.Date sqlDate1 = new java.sql.Date(k.getNgaySinhl().getTime());
            ps.setString(1, k.getMa());
            ps.setString(2, k.getHoVaTen());
            ps.setString(3, k.getsDT());
            ps.setDate(4, sqlDate1);
            ps.setString(5, k.getEmail());
            ps.setString(6, k.getDiaChi());
            ps.setString(7, k.getGhiChu());
            ps.setInt(8, k.getTrangThai());
            ps.setString(9, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaKhachHang(String ma) {
        int checkXoa = 0;
        String query = "Delete khach_hang where ma=?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, ma);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<KhachHang> all() {
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select id,ma,ho_va_ten,sdt,ngay_sinh,email,dia_chi"
                    + ",diem,ghi_chu,trang_thai from khach_hang";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String hoVaTen = rs.getString("ho_va_ten");
                String sDT = rs.getString("sdt");
                Date ngaySinh = rs.getDate("ngay_sinh");
                String email = rs.getString("email");
                String diaChi = rs.getString("dia_chi");
                int diem = rs.getInt("diem");
                String ghiChu = rs.getString("ghi_chu");
                int trangThai = rs.getInt("trang_thai");

                KhachHang k = new KhachHang(id, ma, hoVaTen, sDT, ngaySinh, email, diaChi, diem, ghiChu, trangThai);
                listKH.add(k);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listKH;
    }

    @Override
    public KhachHang timKhachHangBySDT(String sDT) {
        KhachHang khachHang = null;
        String query = "SELECT * FROM khach_hang \n"
                + "WHERE sdt = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, sDT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                khachHang = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    @Override
    public Boolean updateDiemKhachHang(int diem, String sdt) {
        int checkUpdate = 0;
        String query = "UPDATE khach_hang set diem = ?\n"
                + "WHERE sdt = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, diem);
            ps.setString(2, sdt);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
