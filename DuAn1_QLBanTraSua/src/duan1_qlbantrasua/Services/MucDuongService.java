/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.MucDuong;
import duan1_qlbantrasua.ViewModels.MucDuongViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface MucDuongService {
    public ArrayList<MucDuong> getListMucDuongDB();
    public String themMucDuong(MucDuong mucDuong);
    public String updateMucDuong(MucDuong mucDuong, String id);
    public String xoaMucDuong(String ma);
    public ArrayList<MucDuong> timKiem(String tenMucDuong);
    public ArrayList<MucDuongViewModel> getListView();
    public ArrayList<MucDuong> all();
}
