/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.ViewModels.MucDuongViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface MucDuongRepository {
    public ArrayList<MucDuong> getListMucDuongDB();
    public Boolean themMucDuong(MucDuong mucDuong);
    public Boolean updateMucDuong(MucDuong mucDuong, String id);
    public Boolean xoaMucDuong(String ma);
    public ArrayList<MucDuong> timKiem(String tenMucDuong);
    public ArrayList<MucDuongViewModel> getListView();
    public ArrayList<MucDuong> all();
}
