/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.ChucVu;
import duan1_qlbantrasua.Repositories.ChucVuRepository;
import duan1_qlbantrasua.Repositories.impl.ChucVuRepositoryImpl;
import duan1_qlbantrasua.Services.ChucVuService;
import duan1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChucVuServiceImpl implements ChucVuService{
    private ChucVuRepository cv  = new ChucVuRepositoryImpl();
    private int validate(ChucVu cv){
        if(cv.getTen().trim().length() == 0 ) {
            return 1;
        }
        return 0;
        
    }

    @Override
    public ArrayList<ChucVuViewModel> getListCVDB() {
        return cv.listCVViewModel();
    }

    @Override
    public String themChucVu(ChucVu cv) {
        if(validate(cv) ==1 ){
            return "Không được để trống";
        }
        boolean themCv = this.cv.themChucVu(cv);
         if(themCv){
            return "Thêm thành công!";
        }else{
            return "Thêm thất bại!";
        }
    }

    @Override
    public String suaChucVu(ChucVu cv1, String maCv) {
       boolean sua = cv.suaChucVu(cv1, maCv);
        if (sua) {
            return "Sửa thất bại";
        } else {
            return "Sửa thành công";
        }
    }

    @Override
    public String xoaChucVu(String maCv) {
        boolean themCv = cv.xoaChucVU(maCv);
        if(themCv){
            return "Xóa Thất Bại!";
        }else{
            return "Xóa thành công!";
        }
    }

    @Override
    public ArrayList<ChucVu> getListChucVuDB() {
        return cv.getListChucVuDB();
    }

    
    
}
