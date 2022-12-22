/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.CTGioHang;
import duan1_qlbantrasua.Repositories.ChiTietGioHangRepository;
import duan1_qlbantrasua.Repositories.GioHangRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TrungVD
 */
public class CTGHRepositoryImpl implements ChiTietGioHangRepository {

    private DBConnection connection;

    @Override
    public ArrayList<CTGioHang> getListCTGioHang(String maHoaDon) {
        ArrayList<CTGioHang> listGioHang = new ArrayList<>();
        String query = "SELECT * FROM gio_hang WHERE \n"
                + " ma_hoa_don = ? and trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maHoaDon);
            ResultSet rs = ps.executeQuery();  
            while (rs.next()) {
                CTGioHang cTGH = new CTGioHang();
                cTGH.setId(rs.getString(1));
                cTGH.setMaHoaDon(rs.getString(2));
                cTGH.setIdSanPham(rs.getString(3));
                cTGH.setTenSanPham(rs.getString(4));
                cTGH.setSoLuongSP(rs.getInt(5));
                cTGH.setDongGia(rs.getDouble(6));
                cTGH.setTongTien(rs.getDouble(7));
                cTGH.setIdDuong(rs.getString(8));
                cTGH.setTenDuong(rs.getString(9));
                cTGH.setIdDa(rs.getString(10));
                cTGH.setTenDa(rs.getString(11));
                cTGH.setIdTopping(rs.getString(12));
                cTGH.setTenTopping(rs.getString(13));
                cTGH.setTrangThai(rs.getInt(14));
                listGioHang.add(cTGH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGioHang;
    }

    @Override
    public Boolean themCTGH(CTGioHang cTGH) {
        int checkThem = 0;
        String query = "INSERT INTO gio_hang(ma_hoa_don,id_san_pham,ten_san_pham,so_luong_sp,don_gia,tong_tien,id_duong,ten_duong,id_da,ten_da,id_topping,ten_topping)\n"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, cTGH.getMaHoaDon());
            ps.setString(2, cTGH.getIdSanPham());
            ps.setString(3, cTGH.getTenSanPham());
            ps.setInt(4, cTGH.getSoLuongSP());
            ps.setDouble(5, cTGH.getDongGia());
            ps.setDouble(6, cTGH.getTongTien());
            ps.setString(7, cTGH.getIdDuong());
            ps.setString(8, cTGH.getTenDuong());
            ps.setString(9, cTGH.getIdDa());
            ps.setString(10, cTGH.getTenDa());
            ps.setString(11, cTGH.getIdTopping());
            ps.setString(12, cTGH.getTenTopping());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean suaCTGH(CTGioHang cTGH, String id) {
        int checkThem = 0;
        String query = "UPDATE gio_hang \n"
                + "SET id_hoa_don = ?,id_san_pham = ?,ten_san_pham = ?,so_luong_sp = ?,don_gia = ?,tong_tien = ?,id_duong = ?,\n"
                + "ten_duong = ?,id_da = ?,ten_da = ?,id_topping = ?,ten_topping = ?,trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, cTGH.getMaHoaDon());
            ps.setString(2, cTGH.getIdSanPham());
            ps.setString(3, cTGH.getTenSanPham());
            ps.setInt(4, cTGH.getSoLuongSP());
            ps.setDouble(5, cTGH.getDongGia());
            ps.setDouble(6, cTGH.getTongTien());
            ps.setString(7, cTGH.getIdDuong());
            ps.setString(8, cTGH.getTenDuong());
            ps.setString(9, cTGH.getIdDa());
            ps.setString(10, cTGH.getTenDa());
            ps.setString(11, cTGH.getIdTopping());
            ps.setString(12, cTGH.getTenTopping());
            ps.setString(13, id);
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaCTGH(String idCTGH) {
        int checkXoa = 0;
        String query = "DELETE gio_hang\n"
                + "WHERE id = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, idCTGH);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaCTGHKhiThanhToan(String maHoaDon) {
        int checkXoa = 0;
        String query = "UPDATE gio_hang SET trang_thai = 1\n"
                + "WHERE ma_hoa_don = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maHoaDon);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<CTGioHang> hoaDonAo() {
        ArrayList<CTGioHang> listGioHang = new ArrayList<>();
        String query = "SELECT * FROM gio_hang WHERE ma_hoa_don = ''";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTGioHang cTGH = new CTGioHang();
                cTGH.setId(rs.getString(1));
                cTGH.setMaHoaDon(rs.getString(2));
                cTGH.setIdSanPham(rs.getString(3));
                cTGH.setTenSanPham(rs.getString(4));
                cTGH.setSoLuongSP(rs.getInt(5));
                cTGH.setDongGia(rs.getDouble(6));
                cTGH.setTongTien(rs.getDouble(7));
                cTGH.setIdDuong(rs.getString(8));
                cTGH.setTenDuong(rs.getString(9));
                cTGH.setIdDa(rs.getString(10));
                cTGH.setTenDa(rs.getString(11));
                cTGH.setIdTopping(rs.getString(12));
                cTGH.setTenTopping(rs.getString(13));
                cTGH.setTrangThai(rs.getInt(14));
                listGioHang.add(cTGH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGioHang;
    }

    @Override
    public Boolean xoaToanBoGioHang(String maHoaDon) {
        int checkXoa = 0;
        String query = "DELETE gio_hang\n"
                + "WHERE ma_hoa_don = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maHoaDon);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
     ArrayList<CTGioHang> listGH = new CTGHRepositoryImpl().getListCTGioHang("HD10");
        System.out.println(listGH.size());
    }

    @Override
    public ArrayList<CTGioHang> getListCTGHDaThanhToan(String maHoaDon) {
        ArrayList<CTGioHang> listGioHang = new ArrayList<>();
        String query = "SELECT * FROM gio_hang WHERE \n"
                + " ma_hoa_don = ? and trang_thai = 1";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maHoaDon);
            ResultSet rs = ps.executeQuery();  
            while (rs.next()) {
                CTGioHang cTGH = new CTGioHang();
                cTGH.setId(rs.getString(1));
                cTGH.setMaHoaDon(rs.getString(2));
                cTGH.setIdSanPham(rs.getString(3));
                cTGH.setTenSanPham(rs.getString(4));
                cTGH.setSoLuongSP(rs.getInt(5));
                cTGH.setDongGia(rs.getDouble(6));
                cTGH.setTongTien(rs.getDouble(7));
                cTGH.setIdDuong(rs.getString(8));
                cTGH.setTenDuong(rs.getString(9));
                cTGH.setIdDa(rs.getString(10));
                cTGH.setTenDa(rs.getString(11));
                cTGH.setIdTopping(rs.getString(12));
                cTGH.setTenTopping(rs.getString(13));
                cTGH.setTrangThai(rs.getInt(14));
                listGioHang.add(cTGH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGioHang;
    }
}
