/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.KhachHang;
import duan1_qlbantrasua.DomainModels.KhuyenMai;
import duan1_qlbantrasua.Repositories.KhachHangRespository;
import duan1_qlbantrasua.Repositories.KhuyenMaiRespository;
import duan1_qlbantrasua.Repositories.impl.KhachHangRespositoryimpl;
import duan1_qlbantrasua.Repositories.impl.KhuyenMaiRespositoryimpl;
import duan1_qlbantrasua.Services.KhachHangService;
import duan1_qlbantrasua.Services.KhuyenMaiService;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public class KhuyenMaiServiceimpl implements KhuyenMaiService{

    private KhuyenMaiRespository prodKM = new KhuyenMaiRespositoryimpl();
    
    @Override
    public ArrayList<KhuyenMai> getListKhuyenMaiDB() {
        return this.prodKM.getListKhuyenMaiDB();
    }

    @Override
    public String themKhuyenMai(KhuyenMai km) {
         boolean them = prodKM.themKhuyenMai(km);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateKhuyenMai(KhuyenMai km, String id) {
         boolean them = prodKM.updateKhuyenMai(km, id);
        if(them){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaKhuyenMai(String ma) {
         boolean them = prodKM.xoaKhuyenMai(ma);
        if(them){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<KhuyenMai> getList() {
        return this.prodKM.all();
    }
    
}
