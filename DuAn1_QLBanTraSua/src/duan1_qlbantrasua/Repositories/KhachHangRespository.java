/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public interface KhachHangRespository {
    public ArrayList<KhachHang> getListKhachHangDB();
    public ArrayList<KhachHang> all();
    public Boolean themKhachHang(KhachHang k);
    public Boolean updateKhachHang(KhachHang k, String id);
    public Boolean xoaKhachHang(String ma);
    public KhachHang timKhachHangBySDT(String sDT);
    public Boolean updateDiemKhachHang(int diem, String sdt);
}
