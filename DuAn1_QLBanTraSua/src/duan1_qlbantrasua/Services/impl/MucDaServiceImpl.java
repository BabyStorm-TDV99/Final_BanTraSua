/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.MucDa;
import duan1_qlbantrasua.Repositories.MucDaRepository;
import duan1_qlbantrasua.Repositories.impl.MucDaRepositoryImpl;
import duan1_qlbantrasua.Services.MucDaService;
import duan1_qlbantrasua.ViewModels.MucDaViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class MucDaServiceImpl implements MucDaService{
    
    private MucDaRepository mucDaRepository = new MucDaRepositoryImpl();
    
    @Override
    public ArrayList<MucDa> getListMucDaDB() {
        return mucDaRepository.getListMucDaDB();
    }

    @Override
    public String themMucDa(MucDa mucDa) {
        boolean them = mucDaRepository.themMucDa(mucDa);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateMucDa(MucDa mucDa, String id) {
        boolean sua = mucDaRepository.updateMucDa(mucDa,id);
        if(sua){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaMucDa(String ma) {
        boolean xoa = mucDaRepository.xoaMucDa(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<MucDa> timKiem(String tenMucDa) {
        return mucDaRepository.timKiem(tenMucDa);
    }

    @Override
    public ArrayList<MucDaViewModel> getListView() {
        return mucDaRepository.getListView();
    }

    @Override
    public ArrayList<MucDa> all() {
        return mucDaRepository.all();
    }
    
}
