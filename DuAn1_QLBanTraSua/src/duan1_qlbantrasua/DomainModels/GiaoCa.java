/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class GiaoCa {
    private String id;
    private String maNVGiaoCa;
    private int tongSoDonHang;
    private float tongTienbanHang;
    private float tienPhatSinh;
    private float tienTrongKet;
    private float tienHienCo;
    private String ghiChu;
    private int trangThai;
    private NhanVien nhanVien;

    public GiaoCa() {
    }

    public GiaoCa(String id, String maNVGiaoCa, int tongSoDonHang, float tongTienbanHang, float tienPhatSinh, float tienTrongKet, float tienHienCo, String ghiChu, int trangThai, NhanVien nhanVien) {
        this.id = id;
        this.maNVGiaoCa = maNVGiaoCa;
        this.tongSoDonHang = tongSoDonHang;
        this.tongTienbanHang = tongTienbanHang;
        this.tienPhatSinh = tienPhatSinh;
        this.tienTrongKet = tienTrongKet;
        this.tienHienCo = tienHienCo;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.nhanVien = nhanVien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNVGiaoCa() {
        return maNVGiaoCa;
    }

    public void setMaNVGiaoCa(String maNVGiaoCa) {
        this.maNVGiaoCa = maNVGiaoCa;
    }

    public int getTongSoDonHang() {
        return tongSoDonHang;
    }

    public void setTongSoDonHang(int tongSoDonHang) {
        this.tongSoDonHang = tongSoDonHang;
    }

    public float getTongTienbanHang() {
        return tongTienbanHang;
    }

    public void setTongTienbanHang(float tongTienbanHang) {
        this.tongTienbanHang = tongTienbanHang;
    }

    public float getTienPhatSinh() {
        return tienPhatSinh;
    }

    public void setTienPhatSinh(float tienPhatSinh) {
        this.tienPhatSinh = tienPhatSinh;
    }

    public float getTienTrongKet() {
        return tienTrongKet;
    }

    public void setTienTrongKet(float tienTrongKet) {
        this.tienTrongKet = tienTrongKet;
    }

    public float getTienHienCo() {
        return tienHienCo;
    }

    public void setTienHienCo(float tienHienCo) {
        this.tienHienCo = tienHienCo;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    
    
    
}
