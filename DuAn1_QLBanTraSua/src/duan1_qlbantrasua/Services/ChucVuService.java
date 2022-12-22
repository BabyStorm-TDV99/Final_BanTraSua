/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.ChucVu;
import duan1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChucVuService {
    public ArrayList<ChucVuViewModel> getListCVDB();
    
    public String themChucVu(ChucVu cv);
    
    public String suaChucVu(ChucVu cv, String maCv);
    
    public String xoaChucVu(String maCv);
    
    public ArrayList<ChucVu> getListChucVuDB();
    
}
