/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.Topping;
import duan1_qlbantrasua.Repositories.ToppingRepository;
import duan1_qlbantrasua.Repositories.impl.ToppingRepositoryImpl;
import duan1_qlbantrasua.Services.ToppingService;
import duan1_qlbantrasua.ViewModels.ToppingViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public class ToppingServiceImpl implements ToppingService{

    private ToppingRepository toppingRepository = new ToppingRepositoryImpl();
    @Override
    public ArrayList<Topping> getListToppingDB() {
        return toppingRepository.getListToppingDB();
    }

    @Override
    public String themTopping(Topping topping) {
        boolean them = toppingRepository.themTopping(topping);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateTopping(Topping topping, String id) {
        boolean sua = toppingRepository.updateTopping(topping, id);
        if(sua){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaTopping(String ma) {
        boolean xoa = toppingRepository.xoaTopping(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<Topping> timKiem(String tenToppString) {
        return toppingRepository.timKiem(tenToppString);
    }

    @Override
    public ArrayList<ToppingViewModel> getListView() {
        return toppingRepository.getListView();
    }

    @Override
    public ArrayList<Topping> all() {
        return toppingRepository.all();
    }
    
}
