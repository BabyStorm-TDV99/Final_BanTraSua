/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class MucDuongViewModel {
    private String maDuong;
    private String tenDuong;
    private double gia;

    public MucDuongViewModel() {
    }

    public MucDuongViewModel(String maDuong, String tenDuong, double gia) {
        this.maDuong = maDuong;
        this.tenDuong = tenDuong;
        this.gia = gia;
    }

    public String getMaDuong() {
        return maDuong;
    }

    public void setMaDuong(String maDuong) {
        this.maDuong = maDuong;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    
}