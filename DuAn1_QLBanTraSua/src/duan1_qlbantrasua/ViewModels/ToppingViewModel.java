/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class ToppingViewModel {
    private String maTopping;
    private String tenTopping;
    private double giaTopping;

    public ToppingViewModel() {
    }

    public ToppingViewModel(String maTopping, String tenTopping, double giaTopping) {
        this.maTopping = maTopping;
        this.tenTopping = tenTopping;
        this.giaTopping = giaTopping;
    }

    public String getMaTopping() {
        return maTopping;
    }

    public void setMaTopping(String maTopping) {
        this.maTopping = maTopping;
    }

    public String getTenTopping() {
        return tenTopping;
    }

    public void setTenTopping(String tenTopping) {
        this.tenTopping = tenTopping;
    }

    public double getGiaTopping() {
        return giaTopping;
    }

    public void setGiaTopping(double giaTopping) {
        this.giaTopping = giaTopping;
    }

    
}
