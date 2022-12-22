/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public interface KhachHangService {
    public ArrayList<KhachHang> getListKhachHangDB();
    public String themKhachHang(KhachHang k);
    public String updateKhachHang(KhachHang k, String id);
    public String xoaKhachHang(String ma);
    public ArrayList<KhachHang> getList();
    public KhachHang timKhachHangBySDT(String sDT);
    public String updateDiemKhachHang(int diem, String sdt);
}
