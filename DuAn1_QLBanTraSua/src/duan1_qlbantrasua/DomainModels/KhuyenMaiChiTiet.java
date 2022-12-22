/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class KhuyenMaiChiTiet {
    private String id;
    private HoaDon hoaDon;
    private KhuyenMai khuyenMai;
    private int trangThai;

    public KhuyenMaiChiTiet() {
    }

    public KhuyenMaiChiTiet(String id, HoaDon hoaDon, KhuyenMai khuyenMai, int trangThai) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.khuyenMai = khuyenMai;
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

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
