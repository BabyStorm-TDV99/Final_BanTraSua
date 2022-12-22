/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.Topping;
import duan1_qlbantrasua.ViewModels.ToppingViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface ToppingService {
    public ArrayList<Topping> getListToppingDB();
    public String themTopping(Topping topping);
    public String updateTopping(Topping topping, String id);
    public String xoaTopping(String ma);
    public ArrayList<Topping> timKiem(String tenToppString);
    public ArrayList<ToppingViewModel> getListView();
    public ArrayList<Topping> all();
}
