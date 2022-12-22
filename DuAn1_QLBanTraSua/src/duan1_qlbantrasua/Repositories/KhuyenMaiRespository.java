/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Repositories;


import duan1_qlbantrasua.DomainModels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public interface KhuyenMaiRespository {
    public ArrayList<KhuyenMai> getListKhuyenMaiDB();
    public ArrayList<KhuyenMai> all();
    public Boolean themKhuyenMai(KhuyenMai km);
    public Boolean updateKhuyenMai(KhuyenMai km, String id);
    public Boolean xoaKhuyenMai(String ma);
    
}
