/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class HinhAnhViewModel {
    private String tenSanPham;
    private String tenHinhAnh;
    private String duongDanAnh;

    public HinhAnhViewModel() {
    }

    public HinhAnhViewModel(String tenSanPham, String tenHinhAnh, String duongDanAnh) {
        this.tenSanPham = tenSanPham;
        this.tenHinhAnh = tenHinhAnh;
        this.duongDanAnh = duongDanAnh;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHinhAnh() {
        return tenHinhAnh;
    }

    public void setTenHinhAnh(String tenHinhAnh) {
        this.tenHinhAnh = tenHinhAnh;
    }

    public String getDuongDanAnh() {
        return duongDanAnh;
    }

    public void setDuongDanAnh(String duongDanAnh) {
        this.duongDanAnh = duongDanAnh;
    }
    
}
