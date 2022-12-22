/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class DanhMucSP {

    private String id;
    private String ma;
    private String ten;
    private int trangThai;

    public DanhMucSP() {
    }

    public DanhMucSP(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public DanhMucSP(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public DanhMucSP(String id, String ma, String ten, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ten;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DanhMucSP) {
            DanhMucSP dMSP = (DanhMucSP) obj;
            if (this.id.equals(dMSP.id)) {
                return true;
            }
        }
        return false;
    }

}
