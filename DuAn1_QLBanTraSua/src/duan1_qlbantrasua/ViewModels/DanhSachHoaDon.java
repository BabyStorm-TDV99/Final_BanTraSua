/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.ViewModels;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Giang
 */
public class DanhSachHoaDon {

    private String maHD;
    private String nguoiTao;
    private Date ngayTao;
    private Date ngayThanhToan;
    private String khachHang;
    private double tongTien;
    private int trangThai;
    private String ghiChu;

    public DanhSachHoaDon() {
    }

    public DanhSachHoaDon(String maHD, String nguoiTao, Date ngayTao, Date ngayThanhToan, String khachHang, double tongTien, int trangThai, String ghiChu) {
        this.maHD = maHD;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.khachHang = khachHang;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

   

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public int getTrangThai() {
        return trangThai;
        
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

   
    
    public Object[] toRow() {
        return new Object[]{maHD, nguoiTao, ngayTao, ngayThanhToan, khachHang, tongTien, trangThai, ghiChu};
    }

}
