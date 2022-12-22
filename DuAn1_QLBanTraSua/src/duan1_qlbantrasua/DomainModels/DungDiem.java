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
public class DungDiem {
    private String id;
    private int soDiemSuDung;
    private Date ngaySuDung;
    private String ghiChu;
    private int trangThai;
    private QuyDoi quyDoi;
    private KhachHang khachHang;

    public DungDiem() {
    }

    public DungDiem(int soDiemSuDung) {
        this.soDiemSuDung = soDiemSuDung;
    }

    
    public DungDiem(String id, int soDiemSuDung, Date ngaySuDung, String ghiChu, int trangThai, QuyDoi quyDoi, KhachHang khachHang) {
        this.id = id;
        this.soDiemSuDung = soDiemSuDung;
        this.ngaySuDung = ngaySuDung;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.quyDoi = quyDoi;
        this.khachHang = khachHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoDiemSuDung() {
        return soDiemSuDung;
    }

    public void setSoDiemSuDung(int soDiemSuDung) {
        this.soDiemSuDung = soDiemSuDung;
    }

    public Date getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(Date ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
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

    public QuyDoi getQuyDoi() {
        return quyDoi;
    }

    public void setQuyDoi(QuyDoi quyDoi) {
        this.quyDoi = quyDoi;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    
    
}
