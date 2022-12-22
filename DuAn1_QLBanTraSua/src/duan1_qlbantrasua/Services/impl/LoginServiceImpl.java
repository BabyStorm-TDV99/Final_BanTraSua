/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.Repositories.NhanVienRepository;
import duan1_qlbantrasua.Repositories.impl.NhanVienRepositoryImpl;
import duan1_qlbantrasua.Services.LoginService;

/**
 *
 * @author TrungVD
 */
public class LoginServiceImpl implements LoginService{

    private NhanVienRepository nhanVienRepository = new NhanVienRepositoryImpl();
    @Override
    public String checkLogin(String maNV, String matKhau) {
        int checkLogin = nhanVienRepository.checkLogin(maNV, matKhau);
        if(checkLogin == 1 || checkLogin == 2){
            return "Đăng nhập thành công!";
        }else{
            return "Đăng nhập thất bại!";
        }
    }
    
}
