/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.HinhAnh;
import duan1_qlbantrasua.Repositories.HinhAnhRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.HinhAnhViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TrungVD
 */
public class HinhAnhRepositoryImpl implements HinhAnhRepository {

    private DBConnection connection;

    @Override
    public ArrayList<HinhAnh> getListHinhAnhDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean themHinhAnh(HinhAnh hinhAnh) {
        int checkThem = 0;
        String query = "INSERT INTO hinh_anh(id_san_pham,ten,duong_dan_anh)\n"
                + "VALUES(?,?,?);";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, hinhAnh.getSanPham().getId());
            ps.setString(2, hinhAnh.getTen());
            ps.setString(3, hinhAnh.getDuongDanAnh());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateHinhAnh(HinhAnh hinhAnh, String id) {
        int checkUpdate = 0;
        String query = "UPDATE hinh_anh \n"
                + "SET ten = ?,duong_dan_anh = ?\n"
                + "WHERE id_san_pham = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, hinhAnh.getTen());
            ps.setString(2, hinhAnh.getDuongDanAnh());
            ps.setString(3, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaHinhAnh(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HinhAnh> timKiem(String tenHinhAnh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HinhAnhViewModel> getListView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
