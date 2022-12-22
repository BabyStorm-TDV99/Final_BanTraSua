/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.KhachHang;
import duan1_qlbantrasua.Repositories.KhachHangRespository;
import duan1_qlbantrasua.Repositories.impl.KhachHangRespositoryimpl;
import duan1_qlbantrasua.Services.KhachHangService;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public class KhachHangServiceimpl implements KhachHangService{

    private KhachHangRespository prodKH = new KhachHangRespositoryimpl();
    
    @Override
    public ArrayList<KhachHang> getListKhachHangDB() {
        return this.prodKH.getListKhachHangDB();
    }

    @Override
    public String themKhachHang(KhachHang k) {
        boolean them = prodKH.themKhachHang(k);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateKhachHang(KhachHang k, String id) {
         boolean update = prodKH.updateKhachHang(k, id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaKhachHang(String ma) {
         boolean xoa = prodKH.xoaKhachHang(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<KhachHang> getList() {
        return this.prodKH.all();
    }

    @Override
    public KhachHang timKhachHangBySDT(String sDT) {
        return prodKH.timKhachHangBySDT(sDT);
    }

    @Override
    public String updateDiemKhachHang(int diem, String sdt) {
         boolean update = prodKH.updateDiemKhachHang(diem, sdt);
        if(update){
            return "Quy đổi điểm thành công";
        }else{
            return "Quy đổi điểm thất bại";
        }
    }
    
}
