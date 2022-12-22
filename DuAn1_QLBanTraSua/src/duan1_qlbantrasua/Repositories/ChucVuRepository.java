/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.ChucVu;
import duan1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChucVuRepository {
    public ArrayList<ChucVu> getListChucVuDB();
    public Boolean themChucVu(ChucVu chucVu);
    public Boolean suaChucVu(ChucVu chucVu, String maCV);
    public Boolean xoaChucVU(String maCV);
    
    public ArrayList<ChucVuViewModel> listCVViewModel();
    
}
