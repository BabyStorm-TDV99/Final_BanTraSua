/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author Giang
 */
public class ChiTietHoaDon {

    private String ma;
    private String ten;
    private int soLuong;
    private double gia;
    private String mucDa;
    private String mucDuong;
    private String topping;
    private double thanhTien;
    private String trangThai;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String ma, String ten, int soLuong, double gia, String mucDa, String mucDuong, String topping, double thanhTien, String trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.mucDa = mucDa;
        this.mucDuong = mucDuong;
        this.topping = topping;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

  

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
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


    public double getThanhTien(int soLuong, double gia) {
        return soLuong * gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
