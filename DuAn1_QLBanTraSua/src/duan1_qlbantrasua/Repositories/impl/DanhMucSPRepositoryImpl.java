/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.DanhMucSP;
import duan1_qlbantrasua.Repositories.DanhMucRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TrungVD
 */
public class DanhMucSPRepositoryImpl implements DanhMucRepository {

    private DBConnection connection;

    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPDB() {
        ArrayList<DanhMucSP> listDanhMucSP = new ArrayList<>();
        String query = "SELECT * FROM danh_muc_sp WHERE trang_thai = 1 or trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP danhMucSP = new DanhMucSP();
                danhMucSP.setId(rs.getString(1));
                danhMucSP.setMa(rs.getString(2));
                danhMucSP.setTen(rs.getString(3));
                danhMucSP.setTrangThai(rs.getInt(4));
                listDanhMucSP.add(danhMucSP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDanhMucSP;
    }

    @Override
    public Boolean themDanhMucSP(DanhMucSP danhMucSP) {
        int checkThem = 0;
        String query = "INSERT INTO danh_muc_sp(ma,ten,trang_thai)\n"
                + "VALUES (?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, danhMucSP.getMa());
            ps.setString(2, danhMucSP.getTen());
            ps.setInt(3, danhMucSP.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateDanhMucSP(DanhMucSP danhMucSP, String id) {
        int checkUpdate = 0;
        String query = "UPDATE danh_muc_sp\n"
                + "SET ma = ?, ten = ?, trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, danhMucSP.getMa());
            ps.setString(2, danhMucSP.getTen());
            ps.setInt(3, danhMucSP.getTrangThai());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaDanhMucSP(String id) {
        int checkXoa = 0;
        String query = "UPDATE danh_muc_sp\n"
                + "	Set trang_thai = 2\n"
                + "	WHERE id = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, id);
            checkXoa = ps.executeUpdate();
            return checkXoa > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP) {
        ArrayList<DanhMucSP> listTimKiemDa = new ArrayList<>();
        String query = "SELECT * FROM danh_muc_sp\n"
                + "WHERE ten like N'%" + tenDanhMucSP + "%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP danhMucSP = new DanhMucSP();
                danhMucSP.setId(rs.getString(1));
                danhMucSP.setMa(rs.getString(2));
                danhMucSP.setTen(rs.getString(3));
                danhMucSP.setTrangThai(rs.getInt(4));
                listTimKiemDa.add(danhMucSP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTimKiemDa;
    }

    @Override
    public ArrayList<DanhMucSPViewModel> getListView() {
        ArrayList<DanhMucSPViewModel> listDanhMucSP = new ArrayList<>();
        String query = "SELECT ma,ten,trang_thai FROM danh_muc_sp";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSPViewModel danhMucSP = new DanhMucSPViewModel();
                danhMucSP.setMaDM(rs.getString(1));
                danhMucSP.setTenDM(rs.getString(2));
                danhMucSP.setTrangThai(rs.getInt(3));
                listDanhMucSP.add(danhMucSP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDanhMucSP;
    }

    public static void main(String[] args) {
        ArrayList<DanhMucSP> list = new DanhMucSPRepositoryImpl().getListDanhMucSPDB();
        for (DanhMucSP danhMucSP : list) {
            System.out.println(danhMucSP.getMa());
        }
    }

    @Override
    public ArrayList<DanhMucSP> getListAllDanhMucSPDB() {
        ArrayList<DanhMucSP> listDanhMucSP = new ArrayList<>();
        String query = "SELECT * FROM danh_muc_sp";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP danhMucSP = new DanhMucSP();
                danhMucSP.setId(rs.getString(1));
                danhMucSP.setMa(rs.getString(2));
                danhMucSP.setTen(rs.getString(3));
                danhMucSP.setTrangThai(rs.getInt(4));
                listDanhMucSP.add(danhMucSP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDanhMucSP;
    }

    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB() {
        ArrayList<DanhMucSP> listDanhMucSP = new ArrayList<>();
        String query = "SELECT * FROM danh_muc_sp  WHERE trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP danhMucSP = new DanhMucSP();
                danhMucSP.setId(rs.getString(1));
                danhMucSP.setMa(rs.getString(2));
                danhMucSP.setTen(rs.getString(3));
                danhMucSP.setTrangThai(rs.getInt(4));
                listDanhMucSP.add(danhMucSP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDanhMucSP;
    }
}
