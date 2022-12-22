/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.SanPham;
import duan1_qlbantrasua.ViewModels.SanPhamFromBanHang;
import duan1_qlbantrasua.ViewModels.SanPhamViewModel;
import duan1_qlbantrasua.ViewModels.ThongKeSanPham;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface SanPhamRepository {
    public ArrayList<SanPham> getListSanPhamDB();
    public Boolean themSanPham(SanPham sanPham);
    public Boolean updateSanPham(SanPham sanPham, String id);
    public Boolean xoaSanPham(String id);
    public ArrayList<SanPham> timKiemSPDBTheoTen(String tenSanPham);
    public ArrayList<SanPham> timKiemSPDBTheoDanhMuc(String tenDanhMuc);
    public ArrayList<SanPhamViewModel> timKiem(String tenSanPham);
    public ArrayList<SanPhamViewModel> getListView();
    public ArrayList<SanPhamFromBanHang> getListSPFormBH();
    public ArrayList<SanPhamFromBanHang> timSPTheoTen(String tenSP);
    public ArrayList<SanPhamFromBanHang> timSPTheoDanhMuc(String tenDanhMuc);
    public ArrayList<ThongKeSanPham> TKSanPham();
    public ArrayList<ThongKeSanPham> TKSanPhamTOPSLBNhieu();
    public ArrayList<ThongKeSanPham> TKSanPhamTOPSLBIt();
    public SanPham timSanPhamTheoMa(String maSP);
    public ArrayList<SanPham> getListAllSanPhamDB();
    public ArrayList<SanPham> timThongTinSanPhamQuanLy(String tenSanPham);
}
