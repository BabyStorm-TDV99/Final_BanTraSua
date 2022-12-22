/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.SanPham;
import duan1_qlbantrasua.Repositories.SanPhamRepository;
import duan1_qlbantrasua.Repositories.impl.SanPhamRepositoryImpl;
import duan1_qlbantrasua.Services.SanPhamService;
import duan1_qlbantrasua.ViewModels.SanPhamFromBanHang;
import duan1_qlbantrasua.ViewModels.SanPhamViewModel;
import duan1_qlbantrasua.ViewModels.ThongKeSanPham;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class SanPhamServiceImpl implements SanPhamService {

    private int validate(SanPham sanPham) {
        String giaSP = String.valueOf(sanPham.getGia());
        if (sanPham.getTen().trim().length() == 0) {
            return 1;

        } else if (giaSP.trim().length() == 0) {
            return 2;
        }
        return 0;
    }
    private SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();

    @Override
    public ArrayList<SanPham> getListSanPhamDB() {
        return sanPhamRepository.getListSanPhamDB();
    }

    @Override
    public String themSanPham(SanPham sanPham) {
        if (validate(sanPham) == 1) {
            return "Không để trống tên sản phẩm!";
        } else if (validate(sanPham) == 2) {
            return "Không để trông giá sản phẩm";
        } else if (validate(sanPham) == 0) {
            boolean them = sanPhamRepository.themSanPham(sanPham);
            if (them) {
                return "Thêm thành công";
            }
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateSanPham(SanPham sanPham, String id) {
        boolean sua = sanPhamRepository.updateSanPham(sanPham, id);
        if (sua) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaSanPham(String ma) {
        boolean xoa = sanPhamRepository.xoaSanPham(ma);
        if (xoa) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<SanPhamViewModel> timKiem(String tenSanPham) {
        return sanPhamRepository.timKiem(tenSanPham);
    }

    @Override
    public ArrayList<SanPhamViewModel> getListView() {
        return sanPhamRepository.getListView();
    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoTen(String tenSanPham) {
        return sanPhamRepository.timKiemSPDBTheoTen(tenSanPham);
    }

    @Override
    public ArrayList<SanPhamFromBanHang> getListSPFormBH() {
        return sanPhamRepository.getListSPFormBH();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPham() {
        return sanPhamRepository.TKSanPham();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBNhieu() {
        return sanPhamRepository.TKSanPhamTOPSLBNhieu();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBIt() {
        return sanPhamRepository.TKSanPhamTOPSLBIt();
    }

    @Override
    public ArrayList<SanPham> getListAllSanPhamDB() {
        return sanPhamRepository.getListAllSanPhamDB();
    }

    @Override
    public SanPham timSanPhamTheoMa(String maSP) {
        return sanPhamRepository.timSanPhamTheoMa(maSP);
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoDanhMuc(String tenDanhMuc) {
        return sanPhamRepository.timSPTheoDanhMuc(tenDanhMuc);
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoTen(String tenSP) {
        return sanPhamRepository.timSPTheoTen(tenSP);
    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoDanhMuc(String tenDanhMuc) {
        return sanPhamRepository.timKiemSPDBTheoDanhMuc(tenDanhMuc);
    }

    @Override
    public ArrayList<SanPham> timThongTinSanPhamQuanLy(String tenSanPham) {
        return sanPhamRepository.timThongTinSanPhamQuanLy(tenSanPham);
    }

}
