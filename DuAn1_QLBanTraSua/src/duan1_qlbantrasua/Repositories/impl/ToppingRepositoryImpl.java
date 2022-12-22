/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.Topping;
import duan1_qlbantrasua.Repositories.ToppingRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.ToppingViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TrungVD
 */
public class ToppingRepositoryImpl implements ToppingRepository{

    private DBConnection connection;
    
    @Override
    public ArrayList<Topping> getListToppingDB() {
        ArrayList<Topping> listTopping = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinTopping";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Topping topping = new Topping();
                topping.setId(rs.getString(1));
                topping.setMa(rs.getString(2));
                topping.setTen(rs.getString(3));
                topping.setGia(rs.getInt(4));
                topping.setTrangThai(rs.getInt(5));
                listTopping.add(topping);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTopping;
    }

    @Override
    public Boolean themTopping(Topping topping) {
        int checkThem = 0;
        String query = "INSERT INTO topping(ma,ten,gia,trang_thai)\n"
                + "VALUES (?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, topping.getMa());
            ps.setString(2, topping.getTen());
            ps.setDouble(3, topping.getGia());
            ps.setInt(4, topping.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateTopping(Topping topping, String id) {
        int checkUpdate = 0;
        String query = "UPDATE topping\n"
                + "SET ma = ?, ten = ?,gia = ?, trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, topping.getMa());
            ps.setString(2, topping.getTen());
            ps.setDouble(3, topping.getGia());
            ps.setInt(4, topping.getTrangThai());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaTopping(String ma) {
        int checkXoa = 0;
        String query = "DELETE topping\n"
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
    public ArrayList<Topping> timKiem(String tenTopping) {
        ArrayList<Topping> listTimKiemTopping = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinTopping\n"
                + "WHERE ten like N'%"+tenTopping+"%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Topping topping = new Topping();
                topping.setId(rs.getString(1));
                topping.setMa(rs.getString(2));
                topping.setTen(rs.getString(3));
                topping.setGia(rs.getInt(4));
                topping.setTrangThai(rs.getInt(5));
                listTimKiemTopping.add(topping);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTimKiemTopping;
    }

    @Override
    public ArrayList<ToppingViewModel> getListView() {
        ArrayList<ToppingViewModel> listTopping = new ArrayList<>();
        String query = "SELECT ma,ten,gia FROM topping";
        try(Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                ToppingViewModel topping = new ToppingViewModel();
                topping.setMaTopping(rs.getString(1));
                topping.setTenTopping(rs.getString(2));
                topping.setGiaTopping(rs.getDouble(3));
                listTopping.add(topping);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTopping;
    }

    @Override
    public ArrayList<Topping> all() {
        ArrayList<Topping> listT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select id,ma,ten,gia,trang_thai from topping";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trang_thai");

                Topping t = new Topping(id, ma, ten, gia, trangThai);
               listT.add(t);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listT;
    }
    
}
