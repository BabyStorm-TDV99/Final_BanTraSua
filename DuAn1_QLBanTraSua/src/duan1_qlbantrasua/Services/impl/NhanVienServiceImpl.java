/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.Services.impl;

import duan1_qlbantrasua.DomainModels.NhanVien;
import duan1_qlbantrasua.Repositories.NhanVienRepository;
import duan1_qlbantrasua.Repositories.impl.NhanVienRepositoryImpl;
import duan1_qlbantrasua.Services.NhanVienService;
import duan1_qlbantrasua.ViewModels.NhanVienViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author TrungVD
 */
public class NhanVienServiceImpl implements NhanVienService{
    NhanVienRepository nhanVienRepository = new NhanVienRepositoryImpl();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private int valiDate(NhanVien nhanVien){
        if(nhanVien.getMa().trim().length() == 0 ||
                nhanVien.getHoVaTen().trim().length() == 0 ||
                nhanVien.getMatKhau().trim().length() == 0 ||
                nhanVien.getNgaySinh().equals("")  ||
                nhanVien.getDiaChi().trim().length() == 0 ||
                nhanVien.getEmail().trim().length() == 0 ||
                nhanVien.getDiaChi().trim().length() == 0 ||
                nhanVien.getsDT().trim().length() == 0 ||
                nhanVien.getcCCD().trim().length() == 0||
                nhanVien.getGhiChu().trim().length() == 0){
            return 1;
        }
      
        Pattern sDT = Pattern.compile("^0[0-9]{9}$");
        if(!sDT.matcher(nhanVien.getsDT()).find()){
            return 3;
        }
        
        Pattern email = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$");
        if (!email.matcher(nhanVien.getEmail()).find()) {
            return 5;
        }
        return 0;
    }
    @Override
    public NhanVien getListNhanVienDB(String maNV) {
        return nhanVienRepository.getListNhanVienDB(maNV);
    }

    @Override
    public ArrayList<NhanVien> getListNSXDB() {
        return  nhanVienRepository.getListNhanVienDB();
    }

    @Override
    public String themNhanVien(NhanVien nhanVien) {
       if(valiDate(nhanVien) == 1){
            return "Kh??ng ????? tr???ng th??ng tin nh??n vi??n";
        }
       
        if(valiDate(nhanVien)==3){
            return "S??? ??i???n tho???i ph???i c?? 10 s??? v?? b???t ?????u t??? 0";
        }
        if(valiDate(nhanVien)== 4){
            return "M???t kh???u ph???i t??? 8 k?? t??? v?? c?? ch??? in hoa";
        }if(valiDate(nhanVien)== 5){
            return "Email kh??ng ????ng ?????nh d???ng";
        }
        
        boolean themNV = nhanVienRepository.themNhanVien(nhanVien);
        if(themNV){
            return "Th??m th???t b???i";
        }else{
            return "Th??m th??nh c??ng!";
        }
    }

    @Override
    public String suaNhanVien(NhanVien nhanVien, String maNVSua) {
        if(valiDate(nhanVien) == 1){
            return "Kh??ng ????? tr???ng th??ng tin nh??n vi??n";
        }
        if(valiDate(nhanVien)==2){
            return "Nh???p sai ?????nh d???ng yyyy-MM-dd";
        }
        if(valiDate(nhanVien)==3){
            return "S??? ??i???n tho???i ph???i c?? 10 s??? v?? b???t ?????u t??? 0";
        }
        if(valiDate(nhanVien)== 4){
            return "M???t kh???u ph???i t??? 8 k?? t??? v?? c?? ch??? in hoa";
        }if(valiDate(nhanVien)== 5){
            return "Email kh??ng ????ng ?????nh d???ng";
        }
        boolean suaNV = nhanVienRepository.suaNhanVien(nhanVien, maNVSua);
        if(suaNV){
            return "S???a Th???t B???i!";
        }else{
            return "S???a th??nh c??ng!";
        }
    }

    @Override
    public String xoaNhanVien(String maNVXoa) {
        boolean xoaNV = nhanVienRepository.xoaNhanVien(maNVXoa);
        if(xoaNV){
            return "X??a Th???t b???i";
        }else{
            return "X??a th??nh c??ng";
        }
    }

    @Override
    public ArrayList<NhanVien> timKiemNV(String tenNV) {
        return  nhanVienRepository.timNhanVien(tenNV);
    }

    @Override
    public ArrayList<NhanVien> findByMaNv(String maNV) {
        return nhanVienRepository.findbyMaNv(maNV);
    }

    @Override
    public ArrayList<NhanVienViewModel> listNVViewModel() {
        return nhanVienRepository.listNVViewModel();
    }

    
    
}
