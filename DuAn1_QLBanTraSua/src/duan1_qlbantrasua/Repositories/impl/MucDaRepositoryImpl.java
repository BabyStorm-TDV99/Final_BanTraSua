/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.MucDa;
import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.Repositories.MucDaRepository;
import duan1_qlbantrasua.Repositories.MucDuongRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.MucDaViewModel;
import duan1_qlbantrasua.ViewModels.MucDuongViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class MucDaRepositoryImpl implements MucDaRepository{

    private DBConnection connection;
    @Override
    public ArrayList<MucDa> getListMucDaDB() {
        ArrayList<MucDa> listMucDa = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinDa";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MucDa mucDa = new MucDa();
                mucDa.setId(rs.getString(1));
                mucDa.setMa(rs.getString(2));
                mucDa.setTen(rs.getString(3));
                mucDa.setGia(rs.getInt(4));
                mucDa.setTrangThai(rs.getInt(5));
                listMucDa.add(mucDa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMucDa;
    }

    @Override
    public Boolean themMucDa(MucDa mucDa) {
        int checkThem = 0;
        String query = "INSERT INTO muc_da(ma,ten,gia,trang_thai)\n"
                + "VALUES (?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, mucDa.getMa());
            ps.setString(2, mucDa.getTen());
            ps.setDouble(3, mucDa.getGia());
            ps.setInt(4, mucDa.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateMucDa(MucDa mucDa, String id) {
        int checkUpdate = 0;
        String query = "UPDATE muc_da\n"
                + "SET ma = ?, ten = ?,gia = ?, trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, mucDa.getMa());
            ps.setString(2, mucDa.getTen());
            ps.setDouble(3, mucDa.getGia());
            ps.setInt(4, mucDa.getTrangThai());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaMucDa(String ma) {
        int checkXoa = 0;
        String query = "DELETE muc_da\n"
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
    public ArrayList<MucDa> timKiem(String tenMucDa) {
        ArrayList<MucDa> listTimKiemDa = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinDa\n"
                + "WHERE ten like N'%"+tenMucDa+"%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MucDa mucDa = new MucDa();
                mucDa.setId(rs.getString(1));
                mucDa.setMa(rs.getString(2));
                mucDa.setTen(rs.getString(3));
                mucDa.setGia(rs.getInt(4));
                mucDa.setTrangThai(rs.getInt(5));
                listTimKiemDa.add(mucDa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTimKiemDa;

    }

    @Override
    public ArrayList<MucDaViewModel> getListView() {
         ArrayList<MucDaViewModel> listMucDa = new ArrayList<>();
        String query = "SELECT ma,ten,gia FROM muc_da";
        try(Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                MucDaViewModel mucDa = new MucDaViewModel();
                mucDa.setMaDa(rs.getString(1));
                mucDa.setTenDa(rs.getString(2));
                mucDa.setGia(rs.getDouble(3));
                listMucDa.add(mucDa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMucDa;
    }

    @Override
    public ArrayList<MucDa> all() {
         ArrayList<MucDa> listMD = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select id,ma,ten,gia,trang_thai from muc_da";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trang_thai");

               MucDa md =  new MucDa(id, ma, ten, gia, trangThai);
               listMD.add(md);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listMD;
    }
    
}
