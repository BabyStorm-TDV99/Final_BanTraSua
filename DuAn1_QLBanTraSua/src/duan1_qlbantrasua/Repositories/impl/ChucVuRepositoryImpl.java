    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.ChucVu;
import duan1_qlbantrasua.DomainModels.NhanVien;
import duan1_qlbantrasua.Repositories.ChucVuRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChucVuRepositoryImpl implements  ChucVuRepository{

    private DBConnection connection;
    public static void main(String[] args) {
        ArrayList<ChucVu> list = new ChucVuRepositoryImpl().getListChucVuDB();
        for (ChucVu x : list) {
            System.out.println(x.getId());
            System.out.println(x.getTen());
            
        }
    }
    @Override
    public ArrayList<ChucVu> getListChucVuDB() {
        ArrayList<ChucVu> listChucVuDB = new ArrayList<>();
        String sql = "select * from chuc_vu";
        try( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {            
                 ChucVu cv = new ChucVu();
                 cv.setId(rs.getString(1));
                 cv.setMa(rs.getString(2));
                 cv.setTen(rs.getString(3));
                 listChucVuDB.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listChucVuDB;
    }

    @Override
    public Boolean themChucVu(ChucVu chucVu) {
        String sql = "insert into chuc_vu(ma ,ten) values(?,?)";
        try( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, chucVu.getMa());
            ps.setString(2, chucVu.getTen());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }

    @Override
    public Boolean suaChucVu(ChucVu chucVu, String maCV) {
        String sql = "update chuc_vu set ma =? , ten = ? where ma = ? ";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, chucVu.getMa());
            ps.setString(2, chucVu.getTen());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaChucVU(String maCV) {
        String sql = "DELETE chuc_vu WHERE id = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maCV);
             ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<ChucVuViewModel> listCVViewModel() {
        ArrayList<ChucVuViewModel> listNVViewModel = new ArrayList<>();
        String sql = "select * from chuc_vu";
        try( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {            
                 ChucVuViewModel cv = new ChucVuViewModel();
                 cv.setId(rs.getString(1));
                 cv.setMa(rs.getString(2));
                 cv.setTen(rs.getString(3));
                listNVViewModel.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNVViewModel;
        
    }
    
}
