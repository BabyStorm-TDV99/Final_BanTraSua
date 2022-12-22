/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class HinhAnh {

    private String id;
    private SanPham sanPham;
    private String ten;
    private String duongDanAnh;
    private int trangThai;

    public HinhAnh() {
    }

    public HinhAnh(SanPham sanPham, String ten, String duongDanAnh) {
        this.sanPham = sanPham;
        this.ten = ten;
        this.duongDanAnh = duongDanAnh;
    }

    public HinhAnh(String id, SanPham sanPham, String ten, String duongDanAnh, int trangThai) {
        this.id = id;
        this.sanPham = sanPham;
        this.ten = ten;
        this.duongDanAnh = duongDanAnh;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDuongDanAnh() {
        return duongDanAnh;
    }

    public void setDuongDanAnh(String duongDanAnh) {
        this.duongDanAnh = duongDanAnh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
