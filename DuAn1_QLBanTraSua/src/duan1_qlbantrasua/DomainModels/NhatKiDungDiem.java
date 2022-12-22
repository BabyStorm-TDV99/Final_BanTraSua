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
public class NhatKiDungDiem {

    private String id;
    private HoaDon hoaDon;
    private DungDiem dungDiem;
    private KhachHang khachHang;
    private int diemDaDung;
    private int diemCongThem;
    private int diemConLai;
    private Date ngayTao;
    private int trangThai;

    public NhatKiDungDiem() {
    }

    public NhatKiDungDiem(String id, HoaDon hoaDon, DungDiem dungDiem, KhachHang khachHang, int diemDaDung, int diemCongThem, int diemConLai, Date ngayTao, int trangThai) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.dungDiem = dungDiem;
        this.khachHang = khachHang;
        this.diemDaDung = diemDaDung;
        this.diemCongThem = diemCongThem;
        this.diemConLai = diemConLai;
        this.ngayTao = ngayTao;
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

    public int getDiemDaDung() {
        return diemDaDung;
    }

    public void setDiemDaDung(int diemDaDung) {
        this.diemDaDung = diemDaDung;
    }

    public int getDiemCongThem() {
        return diemCongThem;
    }

    public void setDiemCongThem(int diemCongThem) {
        this.diemCongThem = diemCongThem;
    }

    public int getDiemConLai() {
        return diemConLai;
    }

    public void setDiemConLai(int diemConLai) {
        this.diemConLai = diemConLai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
