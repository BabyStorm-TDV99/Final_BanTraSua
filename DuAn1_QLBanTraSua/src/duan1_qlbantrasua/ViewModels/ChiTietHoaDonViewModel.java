/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class ChiTietHoaDonViewModel {
    private String tenMon;
    private int soLuong;
    private String mucDa;
    private String mucDuong;
    private String topping;
    private String tongTien;

    public ChiTietHoaDonViewModel() {
    }

    public ChiTietHoaDonViewModel(String tenMon, int soLuong, String mucDa, String mucDuong, String topping, String tongTien) {
        this.tenMon = tenMon;
        this.soLuong = soLuong;
        this.mucDa = mucDa;
        this.mucDuong = mucDuong;
        this.topping = topping;
        this.tongTien = tongTien;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }


    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMucDa() {
        return mucDa;
    }

    public void setMucDa(String mucDa) {
        this.mucDa = mucDa;
    }

    public String getMucDuong() {
        return mucDuong;
    }

    public void setMucDuong(String mucDuong) {
        this.mucDuong = mucDuong;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    
}
