/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.Topping;
import duan1_qlbantrasua.ViewModels.ToppingViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface ToppingRepository {
    public ArrayList<Topping> getListToppingDB();
    public Boolean themTopping(Topping topping);
    public Boolean updateTopping(Topping topping, String id);
    public Boolean xoaTopping(String ma);
    public ArrayList<Topping> timKiem(String tenToppString);
    public ArrayList<ToppingViewModel> getListView();
    public ArrayList<Topping> all();
}
