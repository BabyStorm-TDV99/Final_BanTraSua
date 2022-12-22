/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class MucDaViewModel {
    private String maDa;
    private String tenDa;
    private double gia;

    public MucDaViewModel() {
    }

    public MucDaViewModel(String maDa, String tenDa, double gia) {
        this.maDa = maDa;
        this.tenDa = tenDa;
        this.gia = gia;
    }

    public String getMaDa() {
        return maDa;
    }

    public void setMaDa(String maDa) {
        this.maDa = maDa;
    }

    public String getTenDa() {
        return tenDa;
    }

    public void setTenDa(String tenDa) {
        this.tenDa = tenDa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
