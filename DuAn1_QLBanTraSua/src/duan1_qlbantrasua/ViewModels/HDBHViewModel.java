/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

import java.util.Date;

/**
 *
 * @author TrungVD
 */
public class HDBHViewModel {
    private String maHoaDon;
    private String tenNhanVien;
    private Date ngayTao;
    private int trangThai;
    
    public HDBHViewModel() {
    }

    public HDBHViewModel(String maHoaDon, String tenNhanVien, Date ngayTao, int trangThai) {
        this.maHoaDon = maHoaDon;
        this.tenNhanVien = tenNhanVien;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
