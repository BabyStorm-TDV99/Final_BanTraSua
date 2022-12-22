/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class SanPham {
    private String id;
    private String ma;
    private String ten;
    private double gia;
    private String moTa;
    private int trangThai;
    private Size size;
    private DanhMucSP danhMucSP;

    public SanPham() {
    }

    public SanPham(String ma, String ten, double gia, String moTa, int trangThai, Size size, DanhMucSP danhMucSP) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.size = size;
        this.danhMucSP = danhMucSP;
    }

    public SanPham(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public SanPham(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }
    
    

    
    public SanPham(String id, String ma, String ten, double gia, String moTa, int trangThai, Size size, DanhMucSP danhMucSP) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.size = size;
        this.danhMucSP = danhMucSP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public DanhMucSP getDanhMucSP() {
        return danhMucSP;
    }

    public void setDanhMucSP(DanhMucSP danhMucSP) {
        this.danhMucSP = danhMucSP;
    }
    
    
}
