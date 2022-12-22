/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

import java.util.Date;

/**
 *
 * @author TrungVD
 */
public class KhachHang {
    private String id;
    private String ma;
    private String hoVaTen;
    private String sDT;
    private Date ngaySinhl;
    private String email;
    private String diaChi;
    private int diem;
    private String ghiChu;
    private int trangThai;

    public KhachHang() {
    }

    public KhachHang(String id) {
        this.id = id;
    }
    
    public KhachHang(String id, String ma, String hoVaTen, int diem) {
        this.id = id;
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.diem = diem;
    }

    
    
    public KhachHang(String id, String ma, String hoVaTen, String sDT, Date ngaySinhl, String email, String diaChi, int diem, String ghiChu, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.sDT = sDT;
        this.ngaySinhl = ngaySinhl;
        this.email = email;
        this.diaChi = diaChi;
        this.diem = diem;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
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

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public Date getNgaySinhl() {
        return ngaySinhl;
    }

    public void setNgaySinhl(Date ngaySinhl) {
        this.ngaySinhl = ngaySinhl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
    
}
