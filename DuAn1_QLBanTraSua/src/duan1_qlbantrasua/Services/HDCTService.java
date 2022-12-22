/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author TrungVD
 */
public interface HDCTService {
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon);
    public String themHDCT(HoaDonChiTiet hDCT);
}
