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
public class KhuyenMai {

    private String id;
    private String ma;
    private String ten;
    private Date ngayTao;
    private int kieuKhuyenMai;
    private float tienKhuyenMai;
    private int phamTramKhuyenMai;
    private String ghiChu;
    private int trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(String id, String ma, String ten, Date ngayTao, int kieuKhuyenMai, float tienKhuyenMai, int phamTramKhuyenMai, String ghiChu, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.kieuKhuyenMai = kieuKhuyenMai;
        this.tienKhuyenMai = tienKhuyenMai;
        this.phamTramKhuyenMai = phamTramKhuyenMai;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getKieuKhuyenMai() {
        return kieuKhuyenMai;
    }

    public void setKieuKhuyenMai(int kieuKhuyenMai) {
        this.kieuKhuyenMai = kieuKhuyenMai;
    }

    public float getTienKhuyenMai() {
        return tienKhuyenMai;
    }

    public void setTienKhuyenMai(float tienKhuyenMai) {
        this.tienKhuyenMai = tienKhuyenMai;
    }

    public int getPhamTramKhuyenMai() {
        return phamTramKhuyenMai;
    }

    public void setPhamTramKhuyenMai(int phamTramKhuyenMai) {
        this.phamTramKhuyenMai = phamTramKhuyenMai;
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
