/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public interface KhuyenMaiService {
    public ArrayList<KhuyenMai> getListKhuyenMaiDB();
    public String themKhuyenMai(KhuyenMai km);
    public String updateKhuyenMai(KhuyenMai km, String id);
    public String xoaKhuyenMai(String ma);
    public ArrayList<KhuyenMai> getList();
}
