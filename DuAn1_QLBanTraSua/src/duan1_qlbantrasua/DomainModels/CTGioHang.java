/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class CTGioHang {
    private String id;
    private String maHoaDon;
    private String idSanPham;
    private String tenSanPham;
    private int soLuongSP;
    private double dongGia;
    private double tongTien;
    private String idDuong;
    private String tenDuong;
    private String idDa;
    private String tenDa;
    private String idTopping;
    private String tenTopping;
    private int trangThai;

    public CTGioHang() {
    }

    public CTGioHang(String maHoaDon, String idSanPham, String tenSanPham, int soLuongSP, double dongGia, double tongTien, String idDuong, String tenDuong, String idDa, String tenDa, String idTopping, String tenTopping) {
        this.maHoaDon = maHoaDon;
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuongSP = soLuongSP;
        this.dongGia = dongGia;
        this.tongTien = tongTien;
        this.idDuong = idDuong;
        this.tenDuong = tenDuong;
        this.idDa = idDa;
        this.tenDa = tenDa;
        this.idTopping = idTopping;
        this.tenTopping = tenTopping;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public double getDongGia() {
        return dongGia;
    }

    public void setDongGia(double dongGia) {
        this.dongGia = dongGia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getIdDuong() {
        return idDuong;
    }

    public void setIdDuong(String idDuong) {
        this.idDuong = idDuong;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public String getIdDa() {
        return idDa;
    }

    public void setIdDa(String idDa) {
        this.idDa = idDa;
    }

    public String getTenDa() {
        return tenDa;
    }

    public void setTenDa(String tenDa) {
        this.tenDa = tenDa;
    }

    public String getIdTopping() {
        return idTopping;
    }

    public void setIdTopping(String idTopping) {
        this.idTopping = idTopping;
    }

    public String getTenTopping() {
        return tenTopping;
    }

    public void setTenTopping(String tenTopping) {
        this.tenTopping = tenTopping;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
