/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.DanhMucSP;
import duan1_qlbantrasua.DomainModels.SanPham;
import duan1_qlbantrasua.DomainModels.Size;
import duan1_qlbantrasua.Repositories.SanPhamRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import duan1_qlbantrasua.ViewModels.SanPhamFromBanHang;
import duan1_qlbantrasua.ViewModels.SanPhamViewModel;
import duan1_qlbantrasua.ViewModels.ThongKeSanPham;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TrungVD
 */
public class SanPhamRepositoryImpl implements SanPhamRepository {

    private DBConnection connection;

    @Override
    public ArrayList<SanPham> getListSanPhamDB() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSanPham WHERE trang_thai = 1 or trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9));
                DanhMucSP danhMucSP = new DanhMucSP(rs.getString(10), rs.getString(11), rs.getString(12));
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setGia(rs.getInt(4));
                sanPham.setMoTa(rs.getString(5));
                sanPham.setSize(size);
                sanPham.setDanhMucSP(danhMucSP);
                sanPham.setTrangThai(rs.getInt(13));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public Boolean themSanPham(SanPham sanPham) {
        int checkThem = 0;
        String query = "INSERT INTO san_pham\n"
                + "VALUES( ?,?,?,?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, sanPham.getMa());
            ps.setString(2, sanPham.getTen());
            ps.setDouble(3, sanPham.getGia());
            ps.setString(4, sanPham.getMoTa());
            ps.setInt(5, sanPham.getTrangThai());
            ps.setString(6, sanPham.getSize().getId());
            ps.setString(7, sanPham.getDanhMucSP().getId());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateSanPham(SanPham sanPham, String id) {
        int checkUpdate = 0;
        String query = "UPDATE san_pham\n"
                + "SET ma = ?,ten = ?,gia = ?,\n"
                + "    mo_ta = ?,trang_thai = ?,id_size = ?,id_danh_muc=?\n"
                + "WHERE id = " + id;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, sanPham.getMa());
            ps.setString(2, sanPham.getTen());
            ps.setDouble(3, sanPham.getGia());
            ps.setString(4, sanPham.getMoTa());
            ps.setInt(5, sanPham.getTrangThai());
            ps.setString(6, sanPham.getSize().getId());
            ps.setString(7, sanPham.getDanhMucSP().getId());
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean xoaSanPham(String id) {
        int checkXoa = 0;
        String query = "UPDATE san_pham\n"
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
    public ArrayList<SanPhamViewModel> timKiem(String tenSanPham) {
        ArrayList<SanPhamViewModel> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_fillSPTable\n"
                + "WHERE ten_sp LIKE N'%" + tenSanPham + "%' and trang_thai = 0 or trang_thai = 1";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sanPhamView = new SanPhamViewModel();
                sanPhamView.setMaSanPham(rs.getString(1));
                sanPhamView.setTenSanPham(rs.getString(2));
                sanPhamView.setDonGia(rs.getDouble(3));
                sanPhamView.setMoTa(rs.getString(4));
                sanPhamView.setTenDanhMuc(rs.getString(5));
                sanPhamView.setDuongDanAnh(rs.getString(6));
                sanPhamView.setTrangThai(rs.getInt(7));
                listSanPham.add(sanPhamView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPhamViewModel> getListView() {
        ArrayList<SanPhamViewModel> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_fillSPTable WHERE trang_thai = 1 or trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sanPhamView = new SanPhamViewModel();
                sanPhamView.setMaSanPham(rs.getString(1));
                sanPhamView.setTenSanPham(rs.getString(2));
                sanPhamView.setDonGia(rs.getDouble(3));
                sanPhamView.setMoTa(rs.getString(4));
                sanPhamView.setTenDanhMuc(rs.getString(5));
                sanPhamView.setDuongDanAnh(rs.getString(6));
                sanPhamView.setTrangThai(rs.getInt(7));
                listSanPham.add(sanPhamView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoTen(String tenSanPham) {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSanPham\n"
                + "WHERE ten_sp LIKE N'%" + tenSanPham + "%' and trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9));
                DanhMucSP danhMucSP = new DanhMucSP(rs.getString(10), rs.getString(11), rs.getString(12));
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setGia(rs.getInt(4));
                sanPham.setMoTa(rs.getString(5));
                sanPham.setSize(size);
                sanPham.setDanhMucSP(danhMucSP);
                sanPham.setTrangThai(rs.getInt(13));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPhamFromBanHang> getListSPFormBH() {
        ArrayList<SanPhamFromBanHang> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_SanPhamFromBanHang";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamFromBanHang sanPham = new SanPhamFromBanHang();
                sanPham.setId(rs.getString(1));
                sanPham.setTenSanPham(rs.getString(2));
                sanPham.setGiaSanPham(rs.getDouble(3));
                sanPham.setDuongDanAnh(rs.getString(4));
                sanPham.setTenDanhMuc(rs.getString(5));
                sanPham.setMoTa(rs.getString(6));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<ThongKeSanPham> TKSanPham() {
        ArrayList<ThongKeSanPham> listKT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select  san_pham.ma,san_pham.ten,san_pham.gia, \n"
                    + "                    sum(gio_hang.so_luong_sp) as'so_luong_ban',san_pham.trang_thai\n"
                    + "                    from  gio_hang inner join san_pham \n"
                    + "                    on gio_hang.id_san_pham=san_pham.id \n"
                    + "                    group by san_pham.ma,san_pham.ten,san_pham.gia,san_pham.trang_thai";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                Double gia = rs.getDouble("gia");
                int soLuongBan = rs.getInt("so_luong_ban");
                int trangThai = rs.getInt("trang_thai");

                ThongKeSanPham tk = new ThongKeSanPham(ma, ten, gia, soLuongBan, trangThai);
                listKT.add(tk);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listKT;
    }

    @Override
    public ArrayList<ThongKeSanPham> TKSanPhamTOPSLBNhieu() {
        ArrayList<ThongKeSanPham> listKT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select top(5)  san_pham.ma,san_pham.ten,san_pham.gia, \n"
                    + "                    sum(gio_hang.so_luong_sp) as'so_luong_ban',san_pham.trang_thai\n"
                    + "                    from  gio_hang inner join san_pham \n"
                    + "                    on gio_hang.id_san_pham=san_pham.id \n"
                    + "                    group by san_pham.ma,san_pham.ten,san_pham.gia,san_pham.trang_thai "
                    + "order by 'so_luong_ban' desc";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                Double gia = rs.getDouble("gia");
                int soLuongBan = rs.getInt("so_luong_ban");
                int trangThai = rs.getInt("trang_thai");

                ThongKeSanPham tk = new ThongKeSanPham(ma, ten, gia, soLuongBan, trangThai);
                listKT.add(tk);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listKT;
    }

    @Override
    public ArrayList<ThongKeSanPham> TKSanPhamTOPSLBIt() {
        ArrayList<ThongKeSanPham> listKT = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();

            String query = "Select top(5)  san_pham.ma,san_pham.ten,san_pham.gia, \n"
                    + "                    sum(gio_hang.so_luong_sp) as'so_luong_ban',san_pham.trang_thai\n"
                    + "                    from  gio_hang inner join san_pham \n"
                    + "                    on gio_hang.id_san_pham=san_pham.id \n"
                    + "                    group by san_pham.ma,san_pham.ten,san_pham.gia,san_pham.trang_thai "
                    + "order by 'so_luong_ban' asc";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                Double gia = rs.getDouble("gia");
                int soLuongBan = rs.getInt("so_luong_ban");
                int trangThai = rs.getInt("trang_thai");

                ThongKeSanPham tk = new ThongKeSanPham(ma, ten, gia, soLuongBan, trangThai);
                listKT.add(tk);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return listKT;
    }

    @Override
    public SanPham timSanPhamTheoMa(String maSP) {
        SanPham sanPham = null;
        String query = "SELECT * FROM view_xemThongTinSanPham\n"
                + "WHERE ma_sp = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanPham = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanPham;
    }

    @Override
    public ArrayList<SanPham> getListAllSanPhamDB() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSanPham";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9));
                DanhMucSP danhMucSP = new DanhMucSP(rs.getString(10), rs.getString(11), rs.getString(12));
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setGia(rs.getInt(4));
                sanPham.setMoTa(rs.getString(5));
                sanPham.setSize(size);
                sanPham.setDanhMucSP(danhMucSP);
                sanPham.setTrangThai(rs.getInt(13));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoTen(String tenSanPham) {
        ArrayList<SanPhamFromBanHang> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_SanPhamFromBanHang\n"
                + "WHERE ten_sp LIKE N'%" + tenSanPham + "%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamFromBanHang sanPham = new SanPhamFromBanHang();
                sanPham.setId(rs.getString(1));
                sanPham.setTenSanPham(rs.getString(2));
                sanPham.setGiaSanPham(rs.getDouble(3));
                sanPham.setDuongDanAnh(rs.getString(4));
                sanPham.setTenDanhMuc(rs.getString(5));
                sanPham.setMoTa(rs.getString(6));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoDanhMuc(String tenDanhMuc) {
        ArrayList<SanPhamFromBanHang> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_SanPhamFromBanHang\n"
                + "WHERE ten_danh_muc LIKE N'%" + tenDanhMuc + "%'";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamFromBanHang sanPham = new SanPhamFromBanHang();
                sanPham.setId(rs.getString(1));
                sanPham.setTenSanPham(rs.getString(2));
                sanPham.setGiaSanPham(rs.getDouble(3));
                sanPham.setDuongDanAnh(rs.getString(4));
                sanPham.setTenDanhMuc(rs.getString(5));
                sanPham.setMoTa(rs.getString(6));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoDanhMuc(String tenDanhMuc) {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSanPham\n"
                + "WHERE ten_dm LIKE N'%" + tenDanhMuc + "%' and trang_thai = 0";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9));
                DanhMucSP danhMucSP = new DanhMucSP(rs.getString(10), rs.getString(11), rs.getString(12));
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setGia(rs.getInt(4));
                sanPham.setMoTa(rs.getString(5));
                sanPham.setSize(size);
                sanPham.setDanhMucSP(danhMucSP);
                sanPham.setTrangThai(rs.getInt(13));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public ArrayList<SanPham> timThongTinSanPhamQuanLy(String tenSanPham) {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinSanPham\n"
                + "WHERE ten_sp like N'%" + tenSanPham + "%' and trang_thai = 0 or trang_thai = 1";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9));
                DanhMucSP danhMucSP = new DanhMucSP(rs.getString(10), rs.getString(11), rs.getString(12));
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setGia(rs.getInt(4));
                sanPham.setMoTa(rs.getString(5));
                sanPham.setSize(size);
                sanPham.setDanhMucSP(danhMucSP);
                sanPham.setTrangThai(rs.getInt(13));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    public static void main(String[] args) {
        ArrayList list = new SanPhamRepositoryImpl().timThongTinSanPhamQuanLy("Dâu Tây");
        System.out.println(list.size());
    }
}
