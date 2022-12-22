/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.DanhMucSP;
import duan1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface DanhMucRepository {
    public ArrayList<DanhMucSP> getListDanhMucSPDB();
    public ArrayList<DanhMucSP> getListAllDanhMucSPDB();
    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB();
    public Boolean themDanhMucSP(DanhMucSP danhMucSP);
    public Boolean updateDanhMucSP(DanhMucSP danhMucSP, String id);
    public Boolean xoaDanhMucSP(String ma);
    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP);
    public ArrayList<DanhMucSPViewModel> getListView();
}
