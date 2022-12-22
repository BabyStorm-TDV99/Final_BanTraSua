/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.HoaDon;
import duan1_qlbantrasua.Repositories.HoaDonRepository;
import duan1_qlbantrasua.Repositories.impl.HoaDonRepositoryImpl;
import duan1_qlbantrasua.Services.HoaDonService;
import duan1_qlbantrasua.ViewModels.ChiTietHoaDon;
import duan1_qlbantrasua.ViewModels.DanhSachHoaDon;
import duan1_qlbantrasua.ViewModels.HDBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonRepository hoaDonRepository = new HoaDonRepositoryImpl();

    @Override
    public ArrayList<HoaDon> getListHoaDonDB() {
        return hoaDonRepository.getListHoaDonDB();
    }

    @Override
    public String themHoaDon(HoaDon hoaDon) {
        boolean them = hoaDonRepository.themHoaDon(hoaDon);
        if (them) {
            return "Tạo mới hóa đơn thành công!";
        } else {
            return "Tạo hóa đơn thất bại!";
        }
    }

    @Override
    public String updateHoaDon(HoaDon hoaDon, String maHoaDon) {
        boolean update = hoaDonRepository.updateHoaDon(hoaDon, maHoaDon);
        if (update) {
            return "Update hóa đơn thành công!";
        } else {
            return "Update hóa đơn thất bại!";
        }
    }

    @Override
    public String xoaHoaDon(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon> timKiemHDDB(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> timKiemHDView(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDBHView() {
        return hoaDonRepository.getListHDBHView();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDChuaThanhToan() {
        return hoaDonRepository.getListHDChuaThanhToan();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDDaThanhToan() {
        return hoaDonRepository.getListHDDaThanhToan();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDHuyThanhToan() {
        return hoaDonRepository.getListHDHuyThanhToan();
    }

    @Override
    public ArrayList<HoaDon> getListHDChoDB() {
        return hoaDonRepository.getListHDChoDB();
    }

    @Override
    public String huyHoaDon(String lyDoHuy, String maHoaDon) {
        boolean huy = hoaDonRepository.huyHoaDon(lyDoHuy, maHoaDon);
        if (huy) {
            return "Hóa đơn đã bị hủy!";
        } else {
            return "Hủy không thành công!";
        }
    }

    @Override
    public ArrayList<DanhSachHoaDon> getListDS() {
        return this.hoaDonRepository.allDS();
    }

    @Override
    public ArrayList<ChiTietHoaDon> getListCT() {
        return this.hoaDonRepository.allCT();
    }


    @Override
    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(java.util.Date ngayTao, java.util.Date ngayThanhToan) {
        return hoaDonRepository.searchTheoKhoangTime(ngayTao, ngayThanhToan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DanhSachHoaDon> getListDSHoaDonDB() {
        return hoaDonRepository.getListDSHoaDonDB();
    }

    @Override
    public ArrayList<ChiTietHoaDon> getListCTTheoMa(String ma) {
        return hoaDonRepository.allCT(ma);
    }

//    @Override
//    public int fillNgay(java.util.Date ngayTao) {
//       return hoaDonRepository.fillNgayD(ngayTao);
//    }
    @Override
    public double fillNgaydt(java.util.Date ngayTao) {
        return hoaDonRepository.fillNgaydt(ngayTao);
    }

    @Override
    public int fillNgay(java.util.Date ngayTao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int fillNgayhd(java.util.Date ngayTao) {
        return hoaDonRepository.fillNgayhd(ngayTao);
    }

    @Override
    public int fillNgayhdh(java.util.Date ngayTao) {
        return hoaDonRepository.fillNgayhdh(ngayTao);
    }

    @Override
    public double fillTuandt(java.util.Date ngayTao) {
        return hoaDonRepository.fillTuandt(ngayTao);
    }

    @Override
    public int fillTuanhd(java.util.Date ngayTao) {
        return hoaDonRepository.fillTuanhd(ngayTao);
    }

    @Override
    public int fillTuanhdh(java.util.Date ngayTao) {
        return hoaDonRepository.fillTuanhdh(ngayTao);
    }

    @Override
    public double fillThangdt(java.util.Date ngayTao) {
        return hoaDonRepository.fillThangdt(ngayTao);
    }

    @Override
    public int fillThanghd(java.util.Date ngayTao) {
        return hoaDonRepository.fillThanghd(ngayTao);
    }

    @Override
    public int fillThanghdh(java.util.Date ngayTao) {
        return hoaDonRepository.fillThanghdh(ngayTao);
    }

    @Override
    public double fillKhoangdt(java.util.Date ngayBD, java.util.Date ngayKT) {
        return hoaDonRepository.fillKhoangdt(ngayBD, ngayKT);
    }

    @Override
    public int fillKhoanghd(java.util.Date ngayBD, java.util.Date ngayKT) {
        return hoaDonRepository.fillKhoanghd(ngayBD, ngayKT);
    }

    @Override
    public int fillKhoanghdh(java.util.Date ngayBD, java.util.Date ngayKT) {
        return hoaDonRepository.fillKhoanghdh(ngayBD, ngayKT);
    }

    @Override
    public String updateThanhToanHoaDonCoKhachHang(HoaDon hoaDon, String ma) {
        boolean update = hoaDonRepository.updateThanhToanHoaDonCoKhachHang(hoaDon, ma);
        if (update) {
            return "Update hóa đơn thành công!";
        } else {
            return "Update hóa đơn thất bại!";
        }
    }

    @Override
    public ArrayList<DanhSachHoaDon> timTheoHinhThucThanhToan(int hinhThuc) {
        return hoaDonRepository.timTheoHinhThucThanhToan(hinhThuc);
    }

    @Override
    public ArrayList<DanhSachHoaDon> timTheoMaHD(String maHD) {
        return hoaDonRepository.timTheoMaHD(maHD);
    }

}
