/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class HoaDonChiTiet {

    private String id;
    private HoaDon hoaDon;
    private SanPham sanPham;
    private double donGia;
    private int soLuong;
    private MucDuong mucDuong;
    private MucDa mucDa;
    private Topping topping;
    private double giaDuong;
    private double giaDa;
    private double giaTopping;
    private int trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDon hoaDon, SanPham sanPham, double donGia, int soLuong, MucDuong mucDuong, MucDa mucDa, Topping topping, double giaDuong, double giaDa, double giaTopping) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.mucDuong = mucDuong;
        this.mucDa = mucDa;
        this.topping = topping;
        this.giaDuong = giaDuong;
        this.giaDa = giaDa;
        this.giaTopping = giaTopping;
    }

    public HoaDonChiTiet(String id, HoaDon hoaDon, SanPham sanPham, double donGia, int soLuong, MucDuong mucDuong, MucDa mucDa, Topping topping, double giaDuong, double giaDa, double giaTopping, int trangThai) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.mucDuong = mucDuong;
        this.mucDa = mucDa;
        this.topping = topping;
        this.giaDuong = giaDuong;
        this.giaDa = giaDa;
        this.giaTopping = giaTopping;
        this.trangThai = trangThai;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public MucDuong getMucDuong() {
        return mucDuong;
    }

    public void setMucDuong(MucDuong mucDuong) {
        this.mucDuong = mucDuong;
    }

    public MucDa getMucDa() {
        return mucDa;
    }

    public void setMucDa(MucDa mucDa) {
        this.mucDa = mucDa;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public double getGiaDuong() {
        return giaDuong;
    }

    public void setGiaDuong(double giaDuong) {
        this.giaDuong = giaDuong;
    }

    public double getGiaDa() {
        return giaDa;
    }

    public void setGiaDa(double giaDa) {
        this.giaDa = giaDa;
    }

    public double getGiaTopping() {
        return giaTopping;
    }

    public void setGiaTopping(double giaTopping) {
        this.giaTopping = giaTopping;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
