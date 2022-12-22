/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.ViewModels.ChiTietHoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface GioHangRepository {
    public ArrayList<ChiTietHoaDonViewModel> getThongTinGioHang();
    public boolean themSP(ChiTietHoaDonViewModel sanPhamGH);
    public boolean xoaSP(ChiTietHoaDonViewModel sanPhamGH);
}
