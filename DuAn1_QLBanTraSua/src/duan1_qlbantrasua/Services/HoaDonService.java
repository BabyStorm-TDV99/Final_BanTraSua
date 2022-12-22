/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.HoaDon;
import duan1_qlbantrasua.ViewModels.ChiTietHoaDon;
import duan1_qlbantrasua.ViewModels.DanhSachHoaDon;
import duan1_qlbantrasua.ViewModels.HDBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface HoaDonService {
    public ArrayList<HoaDon> getListHoaDonDB();
    public String themHoaDon(HoaDon hoaDon);
    public String updateHoaDon(HoaDon hoaDon, String id);
    public String xoaHoaDon(String ma);
    public ArrayList<HoaDon> timKiemHDDB(String tenHoaDon);
    public ArrayList<HDBHViewModel> timKiemHDView(String tenHoaDon);
    public ArrayList<HDBHViewModel> getListHDBHView();
    public ArrayList<HDBHViewModel> getListHDChuaThanhToan();
    public ArrayList<HDBHViewModel> getListHDDaThanhToan();
    public ArrayList<HDBHViewModel> getListHDHuyThanhToan();
    public ArrayList<HoaDon> getListHDChoDB();
    public String huyHoaDon(String lyDoHuy, String maHoaDon);
    public ArrayList<DanhSachHoaDon> getListDS();
    public ArrayList<ChiTietHoaDon> getListCT();
    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(java.util.Date ngayTao, java.util.Date ngayThanhToan);
    public ArrayList<DanhSachHoaDon> timTheoHinhThucThanhToan(int hinhThuc);
    public ArrayList<DanhSachHoaDon> timTheoMaHD(String maHD);
    public ArrayList<DanhSachHoaDon> getListDSHoaDonDB();
    public ArrayList<ChiTietHoaDon> getListCTTheoMa(String ma);
    public int fillNgay(java.util.Date ngayTao);
    public double fillNgaydt(java.util.Date ngayTao);
    public int fillNgayhd(java.util.Date ngayTao);
    public int fillNgayhdh(java.util.Date ngayTao);
    public double fillTuandt(java.util.Date ngayTao);
    public int fillTuanhd(java.util.Date ngayTao);
    public int fillTuanhdh(java.util.Date ngayTao);
    public double fillThangdt(java.util.Date ngayTao);
    public int fillThanghd(java.util.Date ngayTao);
    public int fillThanghdh(java.util.Date ngayTao);
    public double fillKhoangdt(java.util.Date ngayBD, java.util.Date ngayKT);
    public int fillKhoanghd(java.util.Date ngayBD, java.util.Date ngayKT);
    public int fillKhoanghdh(java.util.Date ngayBD, java.util.Date ngayKT);
    public String updateThanhToanHoaDonCoKhachHang(HoaDon hoaDon, String ma);
}
