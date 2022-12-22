/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.Ban;
import duan1_qlbantrasua.ViewModels.BanBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface BanRepository {
    public ArrayList<Ban> getListBanDB();
    public Boolean themBan(Ban ban);
    public Boolean updateBan(Ban ban, String id);
    public Boolean xoaBan(String ma);
    public ArrayList<Ban> timKiemSP(String tenBan);
    public ArrayList<BanBHViewModel> getListView();
    public ArrayList<Ban> all();
}
