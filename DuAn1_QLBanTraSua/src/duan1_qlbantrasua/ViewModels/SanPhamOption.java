/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

import duan1_qlbantrasua.DomainModels.MucDa;
import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.DomainModels.Topping;

/**
 *
 * @author TrungVD
 */
public class SanPhamOption {

    private String tenSP;
    private MucDa mucDa;
    private MucDuong mucDuong;
    private Topping topping;
    private String tongTien;
    private int soLung;

    public SanPhamOption() {
    }

    public SanPhamOption(String tenSP, MucDa mucDa, MucDuong mucDuong, Topping topping, String tongTien, int soLung) {
        this.tenSP = tenSP;
        this.mucDa = mucDa;
        this.mucDuong = mucDuong;
        this.topping = topping;
        this.tongTien = tongTien;
        this.soLung = soLung;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public MucDa getMucDa() {
        return mucDa;
    }

    public void setMucDa(MucDa mucDa) {
        this.mucDa = mucDa;
    }

    public MucDuong getMucDuong() {
        return mucDuong;
    }

    public void setMucDuong(MucDuong mucDuong) {
        this.mucDuong = mucDuong;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLung() {
        return soLung;
    }

    public void setSoLung(int soLung) {
        this.soLung = soLung;
    }

}
