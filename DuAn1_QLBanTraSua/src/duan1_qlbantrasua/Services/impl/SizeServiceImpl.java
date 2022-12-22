/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.Size;
import duan1_qlbantrasua.Repositories.SizeRepository;
import duan1_qlbantrasua.Repositories.impl.SizeRepositoryImpl;
import duan1_qlbantrasua.Services.SizeService;
import duan1_qlbantrasua.ViewModels.SizeViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class SizeServiceImpl implements SizeService {

    private SizeRepository sizeRepository = new SizeRepositoryImpl();

    @Override
    public ArrayList<Size> getListSizeDB() {
        return sizeRepository.getListSizeDB();
    }

    @Override
    public String themSize(Size size) {
        boolean them = sizeRepository.themSize(size);
        if (them) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateSize(Size size, String id) {
        boolean sua = sizeRepository.updateSize(size, id);
        if (sua) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaSize(String ma) {
        boolean xoa = sizeRepository.xoaSize(ma);
        if (xoa) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<Size> timKiem(String tenSize) {
        return sizeRepository.timKiem(tenSize);
    }

    @Override
    public ArrayList<SizeViewModel> getListView() {
        return sizeRepository.getListView();
    }

    @Override
    public ArrayList<Size> getListAllSizeDB() {
        return sizeRepository.getListAllSizeDB();
    }

    @Override
    public ArrayList<Size> getListSizeKinhDoanh() {
        return sizeRepository.getListSizeKinhDoanh();
    }

}
