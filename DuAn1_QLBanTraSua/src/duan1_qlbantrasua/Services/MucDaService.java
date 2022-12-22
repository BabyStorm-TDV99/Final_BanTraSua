/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.MucDa;
import duan1_qlbantrasua.ViewModels.MucDaViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface MucDaService {
    public ArrayList<MucDa> getListMucDaDB();
    public String themMucDa(MucDa mucDa);
    public String updateMucDa(MucDa mucDa, String id);
    public String xoaMucDa(String ma);
    public ArrayList<MucDa> timKiem(String tenMucDa);
    public ArrayList<MucDaViewModel> getListView();
    public ArrayList<MucDa> all();
}
