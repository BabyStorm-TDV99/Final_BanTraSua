/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories.impl;

import duan1_qlbantrasua.DomainModels.HoaDon;
import duan1_qlbantrasua.DomainModels.HoaDonChiTiet;
import duan1_qlbantrasua.DomainModels.MucDa;
import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.DomainModels.SanPham;
import duan1_qlbantrasua.DomainModels.Topping;
import duan1_qlbantrasua.Repositories.HoaDonChiTietRepository;
import duan1_qlbantrasua.Utilties.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TrungVD
 */
public class HDCTRepositoryImpl implements HoaDonChiTietRepository {

    private DBConnection connection;

    @Override
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon) {
        ArrayList<HoaDonChiTiet> listHoaDonChiTiet = new ArrayList<>();
        String query = "SELECT * FROM view_xemThongTinHDCT\n"
                + "WHERE ma_hoa_don = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, maHoaDon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham(rs.getString(2), rs.getString(3));
                HoaDon hoaDon = new HoaDon(rs.getString(4), rs.getString(5));
                MucDa da = new MucDa(rs.getString(6), rs.getString(7));
                MucDuong mucDuong = new MucDuong(rs.getString(8), rs.getString(9));
                Topping topping = new Topping(rs.getString(10), rs.getString(11));
                HoaDonChiTiet hDCT = new HoaDonChiTiet();
                hDCT.setId(rs.getString(1));
                hDCT.setSanPham(sanPham);
                hDCT.setHoaDon(hoaDon);
                hDCT.setMucDa(da);
                hDCT.setMucDuong(mucDuong);
                hDCT.setTopping(topping);
                hDCT.setDonGia(rs.getDouble(12));
                hDCT.setSoLuong(rs.getInt(13));
                hDCT.setGiaDuong(rs.getDouble(14));
                hDCT.setGiaDa(rs.getDouble(15));
                hDCT.setGiaTopping(rs.getDouble(16));
                hDCT.setTrangThai(17);
                listHoaDonChiTiet.add(hDCT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    @Override
    public boolean themHDCT(HoaDonChiTiet hDCT) {
        int checkThem = 0;
        String query = "INSERT INTO hoa_don_chi_tiet(id_hoa_don,id_san_pham,id_duong,id_da,id_topping,don_gia,so_luong,gia_duong,gia_da,gia_topping)\n" +
"VALUES(?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, hDCT.getHoaDon().getId());
            ps.setString(2, hDCT.getSanPham().getId());
            ps.setString(3, hDCT.getMucDuong().getId());
            ps.setString(4, hDCT.getMucDa().getId());
            ps.setString(5, hDCT.getTopping().getId());
            ps.setDouble(6, hDCT.getDonGia());
            ps.setInt(7, hDCT.getSoLuong());
            ps.setDouble(8, hDCT.getGiaDuong());
            ps.setDouble(9, hDCT.getGiaDa());
            ps.setDouble(10, hDCT.getGiaTopping());
            checkThem = ps.executeUpdate();
            return checkThem > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
