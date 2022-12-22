/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1_qlbantrasua.Services;

import duan1_qlbantrasua.DomainModels.HinhAnh;

/**
 *
 * @author TrungVD
 */
public interface HinhAnhService {
    public String themHinhAnh(HinhAnh hinhAnh);
    public String updateHinhAnh(HinhAnh hinhAnh, String id);
}
