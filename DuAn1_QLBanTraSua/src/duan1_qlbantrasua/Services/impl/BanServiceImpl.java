/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.Ban;
import duan1_qlbantrasua.Repositories.BanRepository;
import duan1_qlbantrasua.Repositories.impl.BanRepositoryImpl;
import duan1_qlbantrasua.Services.BanService;
import duan1_qlbantrasua.ViewModels.BanBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class BanServiceImpl implements BanService{

    private BanRepository banRepository = new BanRepositoryImpl();
    @Override
    public ArrayList<Ban> getListBanDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String themBan(Ban ban) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateBan(Ban ban, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String xoaBan(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Ban> timKiemSP(String tenBan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BanBHViewModel> getListView() {
        return banRepository.getListView();
    }

    @Override
    public ArrayList<Ban> all() {
        return  banRepository.all();
    }
    
}
