/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.Ban;
import duan1_qlbantrasua.ViewModels.BanBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface BanService {
    public ArrayList<Ban> getListBanDB();
    public String themBan(Ban ban);
    public String updateBan(Ban ban, String id);
    public String xoaBan(String ma);
    public ArrayList<Ban> timKiemSP(String tenBan);
    public ArrayList<BanBHViewModel> getListView();
    public ArrayList<Ban> all();
}
