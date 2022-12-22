/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.ChucVu;
import duan1_qlbantrasua.DomainModels.NhanVien;
import duan1_qlbantrasua.Repositories.NhanVienRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.NhanVienViewModel;
import duan1_qlbantrasua.ViewModels.TaiKhoanViewModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TrungVD
 */
public class NhanVienRepositoryImpl implements NhanVienRepository {

    private DBConnection connection;

    @Override
    public ArrayList<NhanVien> getListNhanVienDB() {
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        String query = "SELECT * FROM view_thongTinNhanVien";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu chucVu = new ChucVu(rs.getString(12), rs.getString(13));
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(rs.getString(1));
                nhanVien.setMa(rs.getString(2));
                nhanVien.setHoVaTen(rs.getString(3));
                nhanVien.setMatKhau(rs.getString(4));
                nhanVien.setsDT(rs.getString(5));
                nhanVien.setcCCD(rs.getString(6));
                nhanVien.setNgaySinh(rs.getDate(7));
                nhanVien.setGioiTinh(rs.getInt(8));
                nhanVien.setDiaChi(rs.getString(9));
                nhanVien.setEmail(rs.getString(10));
                nhanVien.setGhiChu(rs.getString(11));
                nhanVien.setChucVu(chucVu);
                nhanVien.setTrangThai(rs.getInt(14));
                listNhanVien.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }

    @Override
    public ArrayList<TaiKhoanViewModel> getListTaiKhoan() {
        ArrayList<TaiKhoanViewModel> listTaiKhoan = new ArrayList<>();
        String query = "SELECT * FROM view_thongTinNhanVien";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoanViewModel taiKhoan = new TaiKhoanViewModel();
                taiKhoan.setMaNV(rs.getString(2));
                taiKhoan.setMatKhau(rs.getString(4));
                taiKhoan.setChucVu(rs.getString(12));
                listTaiKhoan.add(taiKhoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTaiKhoan;
    }

    @Override
    public int checkLogin(String maNV, String matKhau) {
        ArrayList<TaiKhoanViewModel> listTK = new NhanVienRepositoryImpl().getListTaiKhoan();
        for (TaiKhoanViewModel taiKhoan : listTK) {
            if (taiKhoan.getMaNV().equalsIgnoreCase(maNV) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau)) {
                return 1;
            } else if(taiKhoan.getMaNV().equalsIgnoreCase(maNV) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau)){
                return 2;
            }
        }
        return 0;
    }

    @Override
    public Boolean themNhanVien(NhanVien nhanVien) {
        String query = "insert into nhan_vien(ma,ho_va_ten,mat_khau,sdt,cccd,ngay_sinh,gioi_tinh,dia_chi,email,ghi_chu,trang_thai,id_chuc_vu)" + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, nhanVien.getMa());
             ps.setString(2, nhanVien.getHoVaTen());
              ps.setString(3, nhanVien.getMatKhau());
               ps.setString(4, nhanVien.getsDT());
                ps.setString(5, nhanVien.getcCCD());
                 ps.setDate(6, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
                 ps.setInt(7,  nhanVien.getGioiTinh());
                 ps.setString(8, nhanVien.getDiaChi());
                 ps.setString(9, nhanVien.getEmail());
                 ps.setString(10, nhanVien.getGhiChu());
                 ps.setInt(11, nhanVien.getTrangThai());
                 ps.setString(12, nhanVien.getChucVu().getId());
                 ps.executeUpdate();
                 
        } catch (Exception e) {
            e.printStackTrace();
        }
          return  false;
    }

    @Override
    public Boolean suaNhanVien(NhanVien nhanVien, String maNV) {
       String sql ="update nhan_vien set ma = ? ,ho_va_ten = ? ,mat_khau = ? ,sdt = ?,cccd = ?,ngay_sinh = ?,gioi_tinh = ?,dia_chi = ?,email =? ,ghi_chu = ?,trang_thai = ?,id_chuc_vu= ? where ma = ?";
        try( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nhanVien.getMa());
            ps.setString(2, nhanVien.getHoVaTen());
            ps.setString(3, nhanVien.getMatKhau());
            ps.setString(4, nhanVien.getsDT());
            ps.setString(5, nhanVien.getcCCD());
            ps.setDate(6, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
            ps.setInt(7, nhanVien.getGioiTinh());
            ps.setString(8, nhanVien.getDiaChi());
            ps.setString(9, nhanVien.getEmail());
            ps.setString(10, nhanVien.getGhiChu());
            ps.setInt(11, nhanVien.getTrangThai());
            ps.setString(12, nhanVien.getChucVu().getId());
            ps.setString(13, maNV);
            ps.executeUpdate();
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaNhanVien(String maNV) {
        String query = "DELETE nhan_vien WHERE ma = ?";
        int checkXoaNV = 0;
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maNV);
             ps.executeUpdate();
            return checkXoaNV > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public NhanVien getListNhanVienDB(String maNV) {
        NhanVien nhanVien = new NhanVien();
        String query = "SELECT * FROM view_thongTinNhanVien WHERE ma_nv = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu chucVu = new ChucVu(rs.getString(12), rs.getString(13));
                nhanVien.setId(rs.getString(1));
                nhanVien.setMa(rs.getString(2));
                nhanVien.setHoVaTen(rs.getString(3));
                nhanVien.setMatKhau(rs.getString(4));
                nhanVien.setsDT(rs.getString(5));
                nhanVien.setcCCD(rs.getString(6));
                nhanVien.setNgaySinh(rs.getDate(7));
                nhanVien.setGioiTinh(rs.getInt(8));
                nhanVien.setDiaChi(rs.getString(9));
                nhanVien.setEmail(rs.getString(10));
                nhanVien.setGhiChu(rs.getString(11));
                nhanVien.setChucVu(chucVu);
                nhanVien.setTrangThai(rs.getInt(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nhanVien;
    }

    @Override
    public ArrayList<NhanVien> timNhanVien(String tenCVTim) {
       ArrayList<NhanVien> listNVTim = new ArrayList<>();
       String query = "SELECT * FROM nhan_vien\n"
                + "WHERE ho_va_ten like N'%" + tenCVTim + "%'";
       try(Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {   
                ChucVu chucVu = new ChucVu(rs.getString(12), rs.getString(13));
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(rs.getString(1));
                nhanVien.setMa(rs.getString(2));
                nhanVien.setHoVaTen(rs.getString(3));
                nhanVien.setMatKhau(rs.getString(4));
                nhanVien.setsDT(rs.getString(5));
                nhanVien.setcCCD(rs.getString(6));
                nhanVien.setNgaySinh(rs.getDate(7));
                nhanVien.setGioiTinh(rs.getInt(8));
                nhanVien.setDiaChi(rs.getString(9));
                nhanVien.setEmail(rs.getString(10));
                nhanVien.setGhiChu(rs.getString(11));
                nhanVien.setChucVu(chucVu);
                listNVTim.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNVTim;
    }

    @Override
    public ArrayList<NhanVien> findbyMaNv(String manv) {
        ArrayList<NhanVien> listNVTim = new ArrayList<>();
       String query = "SELECT * FROM nhan_vien\n"
                + "WHERE ma like N'%" + manv + "%'";
       try(Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {   
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(rs.getString(1));
                nhanVien.setMa(rs.getString(2));
                listNVTim.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNVTim;
    }

    @Override
    public ArrayList<NhanVienViewModel> listNVViewModel() {
        ArrayList<NhanVienViewModel> listNVViewModel = new ArrayList<>();
        String sql = "select * from nhan_vien";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                NhanVienViewModel x = new NhanVienViewModel();
                    
                x.setMa(rs.getString(2));
                x.setHoVaTen(rs.getString(3));
                x.setMatKhau(rs.getString(4));
                x.setsDT(rs.getString(5));
                x.setcCCD(rs.getString(6));
                x.setNgaySinh(rs.getDate(7));
                x.setGioiTinh(rs.getInt(8));
                x.setDiaChi(rs.getString(9));
                x.setEmail(rs.getString(10));
                x.setGhiChu(rs.getString(11));
                x.setTrangThai(rs.getInt(12));
                x.setTenChucVu(rs.getString(13));
                listNVViewModel.add(x);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return listNVViewModel;
    }
}
