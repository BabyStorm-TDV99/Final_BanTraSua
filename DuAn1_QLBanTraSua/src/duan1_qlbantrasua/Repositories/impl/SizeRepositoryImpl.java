/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.Size;
import duan1_qlbantrasua.Repositories.SizeRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.SizeViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author TrungVD
 */
public class SizeRepositoryImpl implements SizeRepository{

    private DBConnection connection;

    @Override
    public ArrayList<Size> getListSizeDB() {
        ArrayList<Size> listDSSize = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSize WHERE trang_thai = 1 or trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size();
                size.setId(rs.getString(1));
                size.setMa(rs.getString(2));
                size.setTen(rs.getString(3));
                size.setGia(rs.getInt(4));
                size.setTrangThai(rs.getInt(5));
                listDSSize.add(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDSSize;
    }

    @Override
    public Boolean themSize(Size size) {
        int checkThem = 0;
        String query = "INSERT INTO size(ma,ten,gia,trang_thai)\n"
                + "VALUES (?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, size.getMa());
            ps.setString(2, size.getTen());
            ps.setDouble(3, size.getGia());
            ps.setInt(4, size.getTrangThai());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateSize(Size size, String id) {
        int checkUpdate = 0;
        String query = "UPDATE size\n"
                + "SET ma = ?, ten = ?,gia = ?, trang_thai = ?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, size.getMa());
            ps.setString(2, size.getTen());
            ps.setDouble(3, size.getGia());
            ps.setInt(4, size.getTrangThai());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaSize(String id) {
        int checkXoa = 0;
        String query = "UPDATE size\n"
                + "Set trang_thai = 2\n"
                + "WHERE id = ?";
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
    public ArrayList<Size> timKiem(String tenSize) {
        ArrayList<Size> listTimKiemDuong = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSize\n"
                + "WHERE ten like N'%" + tenSize + "%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size();
                size.setId(rs.getString(1));
                size.setMa(rs.getString(2));
                size.setTen(rs.getString(3));
                size.setGia(rs.getInt(4));
                size.setTrangThai(rs.getInt(5));
                listTimKiemDuong.add(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTimKiemDuong;
    }

    @Override
    public ArrayList<SizeViewModel> getListView() {
        ArrayList<SizeViewModel> listSize = new ArrayList<>();
        String query = "SELECT ma,ten,gia FROM size";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SizeViewModel size = new SizeViewModel();
                size.setMaSize(rs.getString(1));
                size.setTenSize(rs.getString(2));
                size.setGiaSize(rs.getDouble(3));
                listSize.add(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSize;
    }

    @Override
    public ArrayList<Size> getListAllSizeDB() {
        ArrayList<Size> listDSSize = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSize";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size();
                size.setId(rs.getString(1));
                size.setMa(rs.getString(2));
                size.setTen(rs.getString(3));
                size.setGia(rs.getInt(4));
                size.setTrangThai(rs.getInt(5));
                listDSSize.add(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDSSize;
    }

    @Override
    public ArrayList<Size> getListSizeKinhDoanh() {
        ArrayList<Size> listDSSize = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSize WHERE trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size();
                size.setId(rs.getString(1));
                size.setMa(rs.getString(2));
                size.setTen(rs.getString(3));
                size.setGia(rs.getInt(4));
                size.setTrangThai(rs.getInt(5));
                listDSSize.add(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDSSize;
    }
}
