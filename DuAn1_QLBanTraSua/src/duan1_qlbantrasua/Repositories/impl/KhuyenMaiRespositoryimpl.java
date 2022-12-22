/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.KhuyenMai;

import duan1_qlbantrasua.Repositories.KhuyenMaiRespository;
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
public class KhuyenMaiRespositoryimpl implements KhuyenMaiRespository {

    private DBConnection connection;

    @Override
    public ArrayList<KhuyenMai> getListKhuyenMaiDB() {
        ArrayList<KhuyenMai> listKhuyenMai = new ArrayList<>();
        String query = "SELECT * FROM khuyen_mai";
        try (Connection con = connection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setId(rs.getString(1));
                km.setMa(rs.getString(2));
                km.setTen(rs.getString(3));
                km.setNgayTao(rs.getDate(4));
                km.setKieuKhuyenMai(rs.getInt(5));
                km.setTienKhuyenMai(rs.getFloat(6));
                km.setPhamTramKhuyenMai(rs.getInt(7));
                km.setGhiChu(rs.getString(8));
                km.setTrangThai(rs.getInt(9));

                listKhuyenMai.add(km);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKhuyenMai;
    }

    @Override
    public Boolean themKhuyenMai(KhuyenMai km) {
        int checkThem = 0;
        Timestamp date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String query = "Insert into khuyen_mai(ma,ten,ngay_tao,kieu_khuyen_mai,"
                + "tien_khuyen_mao,phan_tram_khuyen_mai,ghi_chu,trang_thai) "
                + "values(?,?,?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            java.sql.Date sqlDate1 = new java.sql.Date(km.getNgayTao().getTime());
            ps.setString(1, km.getMa());
            ps.setString(2, km.getTen());
            ps.setDate(3, sqlDate1);
            ps.setInt(4, km.getKieuKhuyenMai());
            ps.setFloat(5, km.getTienKhuyenMai());
            ps.setInt(6, km.getPhamTramKhuyenMai());
            ps.setString(7, km.getGhiChu());
            ps.setInt(8, km.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateKhuyenMai(KhuyenMai km, String id) {
        int checkUpdate = 0;
        String query = "Update khuyen_mai set ma=?,ten=?,ngay_tao=?,"
                + "kieu_khuyen_mai=?,tien_khuyen_mao=?,phan_tram_khuyen_mai=?,"
                + "ghi_chu=?,trang_thai=? where id=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            java.sql.Date sqlDate1 = new java.sql.Date(km.getNgayTao().getTime());
            ps.setString(1, km.getMa());
            ps.setString(2, km.getTen());
            ps.setDate(3, sqlDate1);
            ps.setInt(4, km.getKieuKhuyenMai());
            ps.setFloat(5, km.getTienKhuyenMai());
            ps.setInt(6, km.getPhamTramKhuyenMai());
            ps.setString(7, km.getGhiChu());
            ps.setInt(8, km.getTrangThai());
            ps.setString(9, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaKhuyenMai(String ma) {
        int checkXoa = 0;
        String query = "Delete khuyen_mai where ma=?";
        try (Connection con = connection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, ma);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<KhuyenMai> all() {
        ArrayList<KhuyenMai> listKM = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select id,ma,ten,ngay_tao,kieu_khuyen_mai,"
                    + "tien_khuyen_mao,phan_tram_khuyen_mai,ghi_chu,trang_thai from khuyen_mai";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                Date ngayTao = rs.getDate("ngay_tao");
                int kieuKhuyenMai = rs.getInt("kieu_khuyen_mai");
                float tienKhuyenMai = rs.getInt("tien_khuyen_mao");
                int phamTramKhuyenMai = rs.getInt("phan_tram_khuyen_mai");
                String ghiChu = rs.getString("ghi_chu");
                int trangThai = rs.getInt("trang_thai");

                KhuyenMai km = new KhuyenMai(id, ma, ten, ngayTao, kieuKhuyenMai, tienKhuyenMai, phamTramKhuyenMai, ghiChu, trangThai);
                listKM.add(km);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listKM;
    }
}
