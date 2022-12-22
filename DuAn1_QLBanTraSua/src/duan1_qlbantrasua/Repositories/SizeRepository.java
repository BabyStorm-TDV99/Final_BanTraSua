/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Repositories;

import duan1_qlbantrasua.DomainModels.Size;
import duan1_qlbantrasua.ViewModels.SizeViewModel;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface SizeRepository {
    public ArrayList<Size> getListSizeKinhDoanh();
    public ArrayList<Size> getListSizeDB();
    public ArrayList<Size> getListAllSizeDB();
    public Boolean themSize(Size size);
    public Boolean updateSize(Size size, String id);
    public Boolean xoaSize(String ma);
    public ArrayList<Size> timKiem(String tenSize);
    public ArrayList<SizeViewModel> getListView();
}
