/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.DanhMucSP;
import duan1_qlbantrasua.Repositories.DanhMucRepository;
import duan1_qlbantrasua.Repositories.impl.DanhMucSPRepositoryImpl;
import duan1_qlbantrasua.Services.DanhMucService;
import duan1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class DanhMucServiceImpl implements DanhMucService{

    private DanhMucRepository danhMucRepository = new DanhMucSPRepositoryImpl();
    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPDB() {
        return danhMucRepository.getListDanhMucSPDB();
    }

    @Override
    public String themDanhMucSP(DanhMucSP mucDa) {
        boolean them = danhMucRepository.themDanhMucSP(mucDa);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateDanhMucSP(DanhMucSP danhMuc, String id) {
        boolean them = danhMucRepository.updateDanhMucSP(danhMuc, id);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String xoaDanhMucSP(String ma) {
        boolean xoa = danhMucRepository.xoaDanhMucSP(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP) {
        return danhMucRepository.timKiem(tenDanhMucSP);
    }

    @Override
    public ArrayList<DanhMucSPViewModel> getListView() {
        return danhMucRepository.getListView();
    }
    public static void main(String[] args) {
        ArrayList<DanhMucSP> list = new DanhMucServiceImpl().getListDanhMucSPDB();
        for (DanhMucSP danhMucSP : list) {
            System.out.println(danhMucSP.getTen());
        }
    }

    @Override
    public ArrayList<DanhMucSP> getListAllDanhMucSPDB() {
        return danhMucRepository.getListAllDanhMucSPDB();
    }

    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB() {
        return danhMucRepository.getListDanhMucSPKinhDoanhDB();
    }
}
