/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.ViewModels;

/**
 *
 * @author TrungVD
 */
public class SizeViewModel {
    private String maSize;
    private String tenSize;
    private double giaSize;

    public SizeViewModel() {
    }

    public SizeViewModel(String maSize, String tenSize, double giaSize) {
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.giaSize = giaSize;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    public double getGiaSize() {
        return giaSize;
    }

    public void setGiaSize(double giaSize) {
        this.giaSize = giaSize;
    }

    
    
}
