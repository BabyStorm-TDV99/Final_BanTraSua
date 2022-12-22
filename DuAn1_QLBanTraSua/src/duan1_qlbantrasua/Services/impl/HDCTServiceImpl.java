/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.HoaDonChiTiet;
import duan1_qlbantrasua.Repositories.HoaDonChiTietRepository;
import duan1_qlbantrasua.Repositories.impl.HDCTRepositoryImpl;
import duan1_qlbantrasua.Services.HDCTService;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class HDCTServiceImpl implements HDCTService{

    private HoaDonChiTietRepository hoaDonChiTietRepository = new HDCTRepositoryImpl();
    @Override
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon) {
        return hoaDonChiTietRepository.getListHDCTTheoMaHD(maHoaDon);
    }

    @Override
    public String themHDCT(HoaDonChiTiet hDCT) {
        boolean them = hoaDonChiTietRepository.themHDCT(hDCT);
        if(them){
            return "Thêm hóa đơn chi tiết thành công";
        }else{
            return "Thêm hóa đơn chi tiết thất bại";
        }
    }
    
}
