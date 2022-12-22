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
public class HoaDon {

    private String id;
    private String ma;
    private Date ngayTao;
    private double tongTien;
    private double giaVoucher;
    private double giaKhuyenMai;
    private double giaThanhToan;
    private Date ngayThanhToan;
    private Ban ban;
    private NhanVien nhanVien;
    private DungDiem dungDiem;
    private KhachHang khachHang;
    private String ghiChu;
    private int trangThai;
    private int hinhThucThanhToan;

    public HoaDon() {
    }

    public HoaDon(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public HoaDon(String id, String ma) {
        this.id = id;
        this.ma = ma;
    }

    public HoaDon(String ma, Date ngayTao, NhanVien nhanVien) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.nhanVien = nhanVien;
    }

    
    public HoaDon(double tongTien, double giaKhuyenMai, double giaThanhToan, Date ngayThanhToan, String ghiChu, int trangThai, int hinhThucThanhToan) {
        this.tongTien = tongTien;
        this.giaKhuyenMai = giaKhuyenMai;
        this.giaThanhToan = giaThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public HoaDon(double tongTien, double giaKhuyenMai, double giaThanhToan, Date ngayThanhToan, String ghiChu, int trangThai, int hinhThucThanhToan, KhachHang khachHang) {
        this.tongTien = tongTien;
        this.giaKhuyenMai = giaKhuyenMai;
        this.giaThanhToan = giaThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.khachHang = khachHang;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }



    public HoaDon(String id, String ma, Date ngayTao, double tongTien, double giaVoucher, double giaKhuyenMai, double giaThanhToan, Date ngayThanhToan, Ban ban, NhanVien nhanVien, DungDiem dungDiem, KhachHang khachHang, String ghiChu, int trangThai, int hinhThucThanhToan) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.giaVoucher = giaVoucher;
        this.giaKhuyenMai = giaKhuyenMai;
        this.giaThanhToan = giaThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.ban = ban;
        this.nhanVien = nhanVien;
        this.dungDiem = dungDiem;
        this.khachHang = khachHang;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.hinhThucThanhToan = hinhThucThanhToan;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getGiaVoucher() {
        return giaVoucher;
    }

    public void setGiaVoucher(double giaVoucher) {
        this.giaVoucher = giaVoucher;
    }

    public double getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(double giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public double getGiaThanhToan() {
        return giaThanhToan;
    }

    public void setGiaThanhToan(double giaThanhToan) {
        this.giaThanhToan = giaThanhToan;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public DungDiem getDungDiem() {
        return dungDiem;
    }

    public void setDungDiem(DungDiem dungDiem) {
        this.dungDiem = dungDiem;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
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

    public int getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(int hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
    
    

}
