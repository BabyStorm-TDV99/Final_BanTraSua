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
public class NhanVien {

    private String id;
    private String ma;
    private String hoVaTen;
    private String matKhau;
    private String sDT;
    private String cCCD;
    private Date ngaySinh;
    private int gioiTinh;
    private String diaChi;
    private String email;
    private String ghiChu;
    private ChucVu chucVu;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String id, String ma, String hoVaTen) {
        this.id = id;
        this.ma = ma;
        this.hoVaTen = hoVaTen;
    }

    public NhanVien(String ma, String hoVaTen, String matKhau, String sDT, String cCCD, Date ngaySinh, int gioiTinh, String diaChi, String email, String ghiChu, ChucVu chucVu, int trangThai) {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.matKhau = matKhau;
        this.sDT = sDT;
        this.cCCD = cCCD;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.ghiChu = ghiChu;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    
    public NhanVien(String id, String ma, String hoVaTen, String matKhau, String sDT, String cCCD, Date ngaySinh, int gioiTinh, String diaChi, String email, String ghiChu, ChucVu chucVu, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.matKhau = matKhau;
        this.sDT = sDT;
        this.cCCD = cCCD;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.ghiChu = ghiChu;
        this.chucVu = chucVu;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getcCCD() {
        return cCCD;
    }

    public void setcCCD(String cCCD) {
        this.cCCD = cCCD;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
}
