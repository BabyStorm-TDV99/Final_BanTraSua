/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.HinhAnh;
import duan1_qlbantrasua.Repositories.HinhAnhRepository;
import duan1_qlbantrasua.Repositories.impl.HinhAnhRepositoryImpl;
import duan1_qlbantrasua.Services.HinhAnhService;

/**
 *
 * @author TrungVD
 */
public class HinhAnhServiceImpl implements HinhAnhService{

    private HinhAnhRepository hinhAnhRepository = new HinhAnhRepositoryImpl();
    @Override
    public String themHinhAnh(HinhAnh hinhAnh) {
        boolean them = hinhAnhRepository.themHinhAnh(hinhAnh);
        if(them){
            return "Hình ảnh ok";
        }else{
            return "Lỗi hình ảnh";
        }
    }

    @Override
    public String updateHinhAnh(HinhAnh hinhAnh, String id) {
        boolean sua = hinhAnhRepository.updateHinhAnh(hinhAnh, id);
        if(sua){
            return "Hình ảnh ok";
        }else{
            return "Lỗi hình ảnh";
        }
    }
    
}
