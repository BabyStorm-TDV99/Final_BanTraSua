/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.CTGioHang;
import duan1_qlbantrasua.Repositories.ChiTietGioHangRepository;
import duan1_qlbantrasua.Repositories.impl.CTGHRepositoryImpl;
import duan1_qlbantrasua.Services.CTGHServiece;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class CTGHServiceImpl implements CTGHServiece{

    private ChiTietGioHangRepository chiTietGioHangRepository = new CTGHRepositoryImpl();
    @Override
    public ArrayList<CTGioHang> getListCTGioHang(String maHoaDon) {
        return chiTietGioHangRepository.getListCTGioHang(maHoaDon);
    }

    @Override
    public String themCTGH(CTGioHang cTGioHang) {
        boolean them = chiTietGioHangRepository.themCTGH(cTGioHang);
        if(them){
            return "Thêm sản phẩm thành công!";
        }else{
            return "Thêm sản phẩm thất bại!";
        }
    }

    @Override
    public String suaCTGH(CTGioHang cTGioHang, String id) {
        boolean sua = chiTietGioHangRepository.suaCTGH(cTGioHang, id);
        if(sua){
            return "Sửa sản phẩm thành công!";
        }else{
            return "Sửa sản phẩm thất bại!";
        }
    }

    @Override
    public String xoaCTGH(String idCTGH) {
       boolean xoa = chiTietGioHangRepository.xoaCTGH(idCTGH);
        if(xoa){
            return "Xóa sản phẩm thành công!";
        }else{
            return "Xóa sản phẩm thất bại!";
        }
    }

    @Override
    public String xoaCTGHKhiThanhToan(String maHoaDon) {
        boolean xoa = chiTietGioHangRepository.xoaCTGHKhiThanhToan(maHoaDon);
        if(xoa){
            return "Thanh toán thành công";
        }else{
            return "Thanh toán thất bại";
        }
    }

    @Override
    public ArrayList<CTGioHang> hoaDonAo() {
        return chiTietGioHangRepository.hoaDonAo();
    }

    @Override
    public String xoaToanBoGioHang(String maHoaDon) {
        boolean xoa = chiTietGioHangRepository.xoaToanBoGioHang(maHoaDon);
        if(xoa){
            return "Xóa hết giỏ hàng!";
        }else{
            return "Xóa không thành công!";
        }
    }

    @Override
    public ArrayList<CTGioHang> getListCTGHDaThanhToan(String maHoaDon) {
        return chiTietGioHangRepository.getListCTGHDaThanhToan(maHoaDon);
    }
}
