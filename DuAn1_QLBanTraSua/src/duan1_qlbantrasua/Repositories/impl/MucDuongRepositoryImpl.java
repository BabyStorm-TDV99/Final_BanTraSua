/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.Repositories.MucDuongRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.MucDuongViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TrungVD
 */
public class MucDuongRepositoryImpl implements MucDuongRepository {

    private DBConnection connection;

    @Override
    public ArrayList<MucDuong> getListMucDuongDB() {
        ArrayList<MucDuong> listMucDuong = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinDuong";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MucDuong mucDuong = new MucDuong();
                mucDuong.setId(rs.getString(1));
                mucDuong.setMa(rs.getString(2));
                mucDuong.setTen(rs.getString(3));
                mucDuong.setGia(rs.getInt(4));
                mucDuong.setTrangThai(rs.getInt(5));
                listMucDuong.add(mucDuong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMucDuong;
    }

    @Override
    public Boolean themMucDuong(MucDuong mucDuong) {
        int checkThem = 0;
        String query = "INSERT INTO muc_duong(ma,ten,gia,trang_thai)\n"
                + "VALUES (?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, mucDuong.getMa());
            ps.setString(2, mucDuong.getTen());
            ps.setDouble(3, mucDuong.getGia());
            ps.setInt(4, mucDuong.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateMucDuong(MucDuong mucDuong, String id) {
        int checkUpdate = 0;
        String query = "UPDATE muc_duong\n"
                + "SET ma = ?, ten = ?,gia = ?, trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, mucDuong.getMa());
            ps.setString(2, mucDuong.getTen());
            ps.setDouble(3, mucDuong.getGia());
            ps.setInt(4, mucDuong.getTrangThai());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaMucDuong(String ma) {
        int checkXoa = 0;
        String query = "DELETE muc_duong\n"
                + "WHERE ma = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, ma);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<MucDuong> timKiem(String tenMucDuong) {
        ArrayList<MucDuong> listTimKiemDuong = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinDuong\n"
                + "WHERE ten like N'%"+tenMucDuong+"%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MucDuong mucDuong = new MucDuong();
                mucDuong.setId(rs.getString(1));
                mucDuong.setMa(rs.getString(2));
                mucDuong.setTen(rs.getString(3));
                mucDuong.setGia(rs.getInt(4));
                mucDuong.setTrangThai(rs.getInt(5));
                listTimKiemDuong.add(mucDuong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTimKiemDuong;
    }

    @Override
    public ArrayList<MucDuongViewModel> getListView() {
        ArrayList<MucDuongViewModel> listMucDuong = new ArrayList<>();
        String query = "SELECT ma,ten,gia FROM muc_duong";
        try(Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                MucDuongViewModel mucDuong = new MucDuongViewModel();
                mucDuong.setMaDuong(rs.getString(1));
                mucDuong.setTenDuong(rs.getString(2));
                mucDuong.setGia(rs.getDouble(3));
                listMucDuong.add(mucDuong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMucDuong;
    }

    @Override
    public ArrayList<MucDuong> all() {
         ArrayList<MucDuong> listMD = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select id,ma,ten,gia,trang_thai from muc_duong";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trang_thai");

               MucDuong md = new MucDuong(id, ma, ten, gia, trangThai);
               listMD.add(md);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listMD;
    }

}
