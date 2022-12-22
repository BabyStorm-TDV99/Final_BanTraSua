/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.Ban;
import duan1_qlbantrasua.DomainModels.DungDiem;
import duan1_qlbantrasua.DomainModels.HoaDon;
import duan1_qlbantrasua.DomainModels.KhachHang;
import duan1_qlbantrasua.DomainModels.NhanVien;
import duan1_qlbantrasua.Repositories.HoaDonRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.ChiTietHoaDon;
import duan1_qlbantrasua.ViewModels.DanhSachHoaDon;
import duan1_qlbantrasua.ViewModels.HDBHViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author TrungVD
 */
public class HoaDonRepositoryImpl implements HoaDonRepository {

    private DBConnection connection;

    @Override
    public ArrayList<HoaDon> getListHoaDonDB() {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinHoaDon";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(rs.getString(9));
                nhanVien.setMa(rs.getString(10));
                nhanVien.setHoVaTen(rs.getString(11));
                KhachHang khachHang = new KhachHang();
                khachHang.setId(rs.getString(12));
                khachHang.setHoVaTen(rs.getString(13));
//              khachHang.setDiem(rs.getShort(14));
                DungDiem diem = new DungDiem(rs.getInt(14));
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(rs.getString(1));
                hoaDon.setMa(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTongTien(rs.getFloat(4));
                hoaDon.setGiaKhuyenMai(rs.getFloat(5));
                hoaDon.setGiaThanhToan(rs.getFloat(6));
                hoaDon.setGhiChu(rs.getString(7));
                hoaDon.setNhanVien(nhanVien);
                hoaDon.setKhachHang(khachHang);
                hoaDon.setDungDiem(diem);
                hoaDon.setTrangThai(rs.getInt(15));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public Boolean themHoaDon(HoaDon hoaDon) {
        int checkThem = 0;
        String query = "INSERT INTO hoa_don(ma,ngay_tao,"
                + "id_nhan_vien)\n"
                + "VALUES(?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, hoaDon.getMa());
            ps.setObject(2, hoaDon.getNgayTao());
            ps.setString(3, hoaDon.getNhanVien().getId());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateHoaDon(HoaDon hoaDon, String ma) {
        int checkUpdate = 0;
        String query = "UPDATE hoa_don\n"
                + "SET tong_tien = ?,\n"
                + "gia_khuyen_mai = ?,\n"
                + "gia_thanh_toan = ?,\n"
                + "ngay_thanh_toan = ?,\n"
                //                + "id_dung_diem = ?,\n"
                //                + "id_khach_hang = ?,\n"
                + "ghi_chu = ?,\n"
                + "trang_thai = ?, hinh_thuc_thanh_toan = ?\n"
                + " WHERE ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, hoaDon.getTongTien());
            ps.setDouble(2, hoaDon.getGiaKhuyenMai());
            ps.setDouble(3, hoaDon.getGiaThanhToan());
            ps.setObject(4, new Date());
//            ps.setString(4, hoaDon.getDungDiem().getId());
//            ps.setString(5, hoaDon.getKhachHang().getId());
            ps.setString(5, hoaDon.getGhiChu());
            ps.setInt(6, hoaDon.getTrangThai());
            ps.setInt(7, hoaDon.getHinhThucThanhToan());
            ps.setString(8, ma);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaHoaDon(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon> timKiemHDDB(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDBHView() {
        ArrayList<HDBHViewModel> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_HoaDonFormBanHang";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDBHViewModel hoaDon = new HDBHViewModel();
                hoaDon.setMaHoaDon(rs.getString(1));
                hoaDon.setTenNhanVien(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTrangThai(rs.getInt(4));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public ArrayList<HDBHViewModel> timKiemHDView(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDChuaThanhToan() {
        ArrayList<HDBHViewModel> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_HoaDonFormBanHang\n"
                + "WHERE trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDBHViewModel hoaDon = new HDBHViewModel();
                hoaDon.setMaHoaDon(rs.getString(1));
                hoaDon.setTenNhanVien(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTrangThai(rs.getInt(4));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDDaThanhToan() {
        ArrayList<HDBHViewModel> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_HoaDonFormBanHang\n"
                + "WHERE trang_thai = 1";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDBHViewModel hoaDon = new HDBHViewModel();
                hoaDon.setMaHoaDon(rs.getString(1));
                hoaDon.setTenNhanVien(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTrangThai(rs.getInt(4));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDHuyThanhToan() {
        ArrayList<HDBHViewModel> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_HoaDonFormBanHang\n"
                + "WHERE trang_thai = 2";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDBHViewModel hoaDon = new HDBHViewModel();
                hoaDon.setMaHoaDon(rs.getString(1));
                hoaDon.setTenNhanVien(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTrangThai(rs.getInt(4));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public static void main(String[] args) {
        ArrayList<HDBHViewModel> list = new HoaDonRepositoryImpl().getListHDChuaThanhToan();
        for (HDBHViewModel hDBHViewModel : list) {
            System.out.println(hDBHViewModel.getMaHoaDon());
        }
    }

    @Override
    public ArrayList<HoaDon> getListHDChoDB() {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinHoaDon WHERE trang_thai_hd = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(rs.getString(9));
                nhanVien.setMa(rs.getString(10));
                nhanVien.setHoVaTen(rs.getString(11));
                KhachHang khachHang = new KhachHang();
                khachHang.setId(rs.getString(12));
                khachHang.setHoVaTen(rs.getString(13));
//              khachHang.setDiem(rs.getShort(14));
                DungDiem diem = new DungDiem(rs.getInt(14));
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(rs.getString(1));
                hoaDon.setMa(rs.getString(2));
                hoaDon.setNgayTao(rs.getDate(3));
                hoaDon.setTongTien(rs.getFloat(4));
                hoaDon.setGiaKhuyenMai(rs.getFloat(5));
                hoaDon.setGiaThanhToan(rs.getFloat(6));
                hoaDon.setGhiChu(rs.getString(7));
                hoaDon.setNhanVien(nhanVien);
                hoaDon.setKhachHang(khachHang);
                hoaDon.setDungDiem(diem);
                hoaDon.setTrangThai(rs.getInt(15));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public Boolean huyHoaDon(String lyDoHuy, String maHoaDon) {
        int checkHuyHoaDon = 0;
        String query = "UPDATE hoa_don\n"
                + "SET ghi_chu = ?, trang_thai = 2 \n"
                + " WHERE ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, lyDoHuy);
            ps.setString(2, maHoaDon);
            checkHuyHoaDon = ps.executeUpdate();
            return checkHuyHoaDon > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<DanhSachHoaDon> allDS() {
        ArrayList<DanhSachHoaDon> listDS = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select hoa_don.ma,nhan_vien.ho_va_ten as 'nguoi_tao',"
                    + "khach_hang.ho_va_ten as 'khach_hang',hoa_don.ngay_tao,"
                    + "hoa_don.ngay_thanh_toan,tong_tien,hoa_don.ghi_chu,hoa_don.trang_thai\n"
                    + "from hoa_don left join nhan_vien on hoa_don.id_nhan_vien=nhan_vien.id\n"
                    + "left join khach_hang on hoa_don.id_khach_hang=khach_hang.id";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String maHD = rs.getString("ma");
                String nguoiTao = rs.getString("nguoi_tao");
                String khachHang = rs.getString("khach_hang");
                java.sql.Date ngayTao = rs.getDate("ngay_tao");
                java.sql.Date ngayThanhToan = rs.getDate("ngay_thanh_toan");
                double tongTien = rs.getDouble("tong_tien");
                String ghiChu = rs.getString("ghi_chu");
                int trangThai = rs.getInt("trang_thai");

                DanhSachHoaDon ds = new DanhSachHoaDon(maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu);
                listDS.add(ds);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listDS;
    }

    public ArrayList<ChiTietHoaDon> allCT() {
        ArrayList<ChiTietHoaDon> listCT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select  san_pham.ma,san_pham.ten,san_pham.gia, hoa_don_chi_tiet.so_luong,\n"
                    + "size.ten as'size',muc_da.ten as 'muc_da',"
                    + "muc_duong.ten as 'muc_duong',hoa_don_chi_tiet.tong_tien, hoa_don_chi_tiet.trang_thai\n"
                    + "from  hoa_don_chi_tiet left join san_pham on hoa_don_chi_tiet.id_san_pham=san_pham.id\n"
                    + "left join size on hoa_don_chi_tiet.id_size=size.id\n"
                    + "left join muc_da on hoa_don_chi_tiet.id_da=muc_da.id\n"
                    + "left join muc_duong on hoa_don_chi_tiet.id_duong=muc_duong.id\n"
                    + "left join hoa_don on hoa_don_chi_tiet.id_hoa_don=hoa_don.id\n"
                    + "where hoa_don_chi_tiet.id_hoa_don=?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                double gia = rs.getDouble("gia");
                int soLuong = rs.getInt("so_luong");
                String mucDa = rs.getString("muc_da");
                String mucDuong = rs.getString("muc_duong");
                String topping = rs.getString("topping");
                double thanhTien = rs.getDouble("tong_tien");
                String trangThai = rs.getString("trang_thai");

                ChiTietHoaDon ct = new ChiTietHoaDon(ma, ten, soLuong, gia, mucDa, mucDuong, topping, thanhTien, trangThai);
                listCT.add(ct);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listCT;
    }

//    @Override
//    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(java.util.Date ngayTao, java.util.Date ngayThanhToan) {
//        ArrayList<DanhSachHoaDon> listDS = new ArrayList<>();
//        try {
//            Connection conn = DBConnection.getConnection();
//
//            String query = "Select hoa_don.ma,nhan_vien.ho_va_ten as 'nguoi_tao',"
//                    + "khach_hang.ho_va_ten as 'khach_hang',\n"
//                    + "hoa_don.ngay_tao,hoa_don.ngay_thanh_toan,tong_tien,"
//                    + "hoa_don.ghi_chu,hoa_don.trang_thai\n"
//                    + "from hoa_don left join nhan_vien on hoa_don.id_nhan_vien=nhan_vien.id\n"
//                    + "left join khach_hang on hoa_don.id_khach_hang=khach_hang.id\n"
//                    + "where ngay_tao>=? and ngay_thanh_toan<=?";
//            PreparedStatement ps = conn.prepareStatement(query);
//           
//            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
//            java.sql.Date sqlDate2 = new java.sql.Date(ngayTao.getTime());
//            ps.setDate(1, sqlDate1);
//            ps.setDate(2, sqlDate2);
//
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next() == true) {
//                String maHD = rs.getString("ma");
//                String nguoiTao = rs.getString("nguoi_tao");
//                String khachHang = rs.getString("khach_hang");
//                ngayTao = rs.getDate("ngay_tao");
//                ngayThanhToan = rs.getDate("ngay_thanh_toan");
//                double tongTien = rs.getDouble("tong_tien");
//                String ghiChu = rs.getString("ghi_chu");
//                String trangThai = rs.getString("trang_thai");
//
//                DanhSachHoaDon ds = new DanhSachHoaDon(maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu);
//                listDS.add(ds);
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//        }
//        return listDS;
//    }
    

    @Override
    public ArrayList<DanhSachHoaDon> getListDSHoaDonDB() {
        ArrayList<DanhSachHoaDon> listDanhSachHoaDon = new ArrayList<>();
        String query = "Select hoa_don.ma,nhan_vien.ho_va_ten as 'nguoi_tao',khach_hang.ho_va_ten as 'khach_hang',\n"
                + "hoa_don.ngay_tao,hoa_don.ngay_thanh_toan,tong_tien,hoa_don.ghi_chu,hoa_don.trang_thai\n"
                + "from hoa_don left join nhan_vien on hoa_don.id_nhan_vien=nhan_vien.id\n"
                + "             left join khach_hang on hoa_don.id_khach_hang=khach_hang.id";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhSachHoaDon ds = new DanhSachHoaDon();
                ds.setMaHD(rs.getString(1));
                listDanhSachHoaDon.add(ds);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDanhSachHoaDon;
    }

    @Override
    public ArrayList<ChiTietHoaDon> allCT(String ma) {
        ArrayList<ChiTietHoaDon> listCT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select  san_pham.ma,san_pham.ten,san_pham.gia, hoa_don_chi_tiet.so_luong,muc_da.ten as 'muc_da',\n"
                    + "muc_duong.ten as 'muc_duong',topping.ten as 'topping',hoa_don_chi_tiet.tong_tien, hoa_don_chi_tiet.trang_thai\n"
                    + "from  hoa_don_chi_tiet left join san_pham on hoa_don_chi_tiet.id_san_pham=san_pham.id\n"
                    + "left join muc_da on hoa_don_chi_tiet.id_da=muc_da.id\n"
                    + "left join muc_duong on hoa_don_chi_tiet.id_duong=muc_duong.id\n"
                    + "left join topping on hoa_don_chi_tiet.id_topping=topping.id\n"
                    + "left join hoa_don on hoa_don_chi_tiet.id_hoa_don=hoa_don.id\n"
                    + "where hoa_don.ma=?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, ma);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ma = rs.getString("ma");
                String ten = rs.getString("ten");
                double gia = rs.getDouble("gia");
                int soLuong = rs.getInt("so_luong");
                String mucDa = rs.getString("muc_da");
                String mucDuong = rs.getString("muc_duong");
                String topping = rs.getString("topping");
                double thanhTien = rs.getDouble("tong_tien");
                String trangThai = rs.getString("trang_thai");

                ChiTietHoaDon ct = new ChiTietHoaDon(ma, ten, soLuong, gia, mucDa, mucDuong, topping, thanhTien, trangThai);
                listCT.add(ct);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listCT;
    }

    @Override
    public double fillNgaydt(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select  sum(tong_tien) as 'doanh_thu' from hoa_don where ngay_tao=?";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("doanh_thu");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillNgayhd(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select  count(ma) as 'so_hoa_don' from hoa_don where ngay_tao=?";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillNgayhdh(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don_huy' from hoa_don  where ngay_tao=? and trang_thai=2";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don_huy");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public double fillTuandt(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select  sum(tong_tien) as 'doanh_thu' from hoa_don  "
                    + "where ngay_tao=? group by DATEPART(week,ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("doanh_thu");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillTuanhd(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don' from hoa_don  "
                    + "where ngay_tao=?  group by DATEPART(week,ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillTuanhdh(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don_huy' from hoa_don  "
                    + "where ngay_tao=? and trang_thai=2 "
                    + "group by DATEPART(week,ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don_huy");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public double fillThangdt(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select  sum(tong_tien) as 'doanh_thu' from hoa_don  "
                    + "where ngay_tao=? group by MONTH(ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("doanh_thu");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillThanghd(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don' from hoa_don  "
                    + "where ngay_tao=?  group by MONTH(ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillThanghdh(java.util.Date ngayTao) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don_huy' from hoa_don  "
                    + "where ngay_tao=? and trang_thai=2  "
                    + "group by MONTH(ngay_tao)";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don_huy");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public double fillKhoangdt(java.util.Date ngayBD, java.util.Date ngayKT) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select  sum(tong_tien) as 'doanh_thu' from hoa_don "
                    + " where ngay_tao between ? and ?";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayBD.getTime());
            java.sql.Date sqlDate2 = new java.sql.Date(ngayKT.getTime());
            ps.setDate(1, sqlDate1);
            ps.setDate(2, sqlDate2);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("doanh_thu");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillKhoanghd(java.util.Date ngayBD, java.util.Date ngayKT) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don' from hoa_don  "
                    + "where ngay_tao between ? and ?";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayBD.getTime());
            java.sql.Date sqlDate2 = new java.sql.Date(ngayKT.getTime());
            ps.setDate(1, sqlDate1);
            ps.setDate(2, sqlDate2);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public int fillKhoanghdh(java.util.Date ngayBD, java.util.Date ngayKT) {
        int t = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "Select count(ma) as 'so_hoa_don_huy' from hoa_don  "
                    + "where trang_thai=2 and ngay_tao between ? and ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayBD.getTime());
            java.sql.Date sqlDate2 = new java.sql.Date(ngayKT.getTime());
            ps.setDate(1, sqlDate1);
            ps.setDate(2, sqlDate2);

            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                t = rs.getInt("so_hoa_don_huy");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public Boolean updateThanhToanHoaDonCoKhachHang(HoaDon hoaDon, String ma) {
        int checkUpdate = 0;
        String query = "UPDATE hoa_don\n"
                + "SET tong_tien = ?,\n"
                + "gia_khuyen_mai = ?,\n"
                + "gia_thanh_toan = ?,\n"
                + "ngay_thanh_toan = ?,\n"
                //                + "id_dung_diem = ?,\n"
                + "id_khach_hang = ?,\n"
                + "ghi_chu = ?,\n"
                + "trang_thai = ?, hinh_thuc_thanh_toan = ?\n"
                + " WHERE ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, hoaDon.getTongTien());
            ps.setDouble(2, hoaDon.getGiaKhuyenMai());
            ps.setDouble(3, hoaDon.getGiaThanhToan());
            ps.setObject(4, new Date());
//            ps.setString(4, hoaDon.getDungDiem().getId());
            ps.setString(5, hoaDon.getKhachHang().getId());
            ps.setString(6, hoaDon.getGhiChu());
            ps.setInt(7, hoaDon.getTrangThai());
            ps.setInt(8, hoaDon.getHinhThucThanhToan());
            ps.setString(9, ma);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(java.util.Date ngayTao, java.util.Date ngayThanhToan) {
        ArrayList<DanhSachHoaDon> listDS = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "SELECT * FROM view_xemThongTinHoaDon \n"
                    + "WHERE ngay_tao BETWEEN ? AND ?";
            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Date sqlDate1 = new java.sql.Date(ngayTao.getTime());
            java.sql.Date sqlDate2 = new java.sql.Date(ngayTao.getTime());
            ps.setDate(1, sqlDate1);
            ps.setDate(2, sqlDate2);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String maHD = rs.getString("ma_hd");
                String nguoiTao = rs.getString("ho_ten_nhan_vien");
                String khachHang = rs.getString("ho_ten_khach_hang");
                ngayTao = rs.getDate("ngay_tao");
                ngayThanhToan = rs.getDate("ngay_thanh_toan");
                double tongTien = rs.getDouble("gia_thanh_toan");
                String ghiChu = rs.getString("ghi_chu_hd");
                int trangThai = rs.getInt("trang_thai_hd");
                DanhSachHoaDon ds = new DanhSachHoaDon(maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu);
                listDS.add(ds);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listDS;
    }
    
    @Override
    public ArrayList<DanhSachHoaDon> timTheoHinhThucThanhToan(int hinhThuc) {
        ArrayList<DanhSachHoaDon> listDS = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM view_xemThongTinHoaDon \n"
                    + "WHERE hinh_thuc_thanh_toan = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, hinhThuc);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String maHD = rs.getString("ma_hd");
                String nguoiTao = rs.getString("ho_ten_nhan_vien");
                String khachHang = rs.getString("ho_ten_khach_hang");
                java.util.Date ngayTao = rs.getDate("ngay_tao");
                java.util.Date ngayThanhToan = rs.getDate("ngay_thanh_toan");
                double tongTien = rs.getDouble("gia_thanh_toan");
                String ghiChu = rs.getString("ghi_chu_hd");
                int trangThai = rs.getInt("trang_thai_hd");
                DanhSachHoaDon ds = new DanhSachHoaDon(maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu);
                listDS.add(ds);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listDS;
    }

    @Override
    public ArrayList<DanhSachHoaDon> timTheoMaHD(String maHDT) {
        ArrayList<DanhSachHoaDon> listDS = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM view_xemThongTinHoaDon \n"
                    + "WHERE ma_hd LIKE '%"+maHDT+"%'";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String maHD = rs.getString("ma_hd");
                String nguoiTao = rs.getString("ho_ten_nhan_vien");
                String khachHang = rs.getString("ho_ten_khach_hang");
                java.util.Date ngayTao = rs.getDate("ngay_tao");
                java.util.Date ngayThanhToan = rs.getDate("ngay_thanh_toan");
                double tongTien = rs.getDouble("gia_thanh_toan");
                String ghiChu = rs.getString("ghi_chu_hd");
                int trangThai = rs.getInt("trang_thai_hd");
                DanhSachHoaDon ds = new DanhSachHoaDon(maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu);
                listDS.add(ds);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listDS;
    }
}
