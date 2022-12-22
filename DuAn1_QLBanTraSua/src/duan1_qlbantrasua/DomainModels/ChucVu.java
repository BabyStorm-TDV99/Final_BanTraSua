/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class ChucVu {
    private String id;
    private String ma;
    private String ten;

    public ChucVu() {
    }

    public ChucVu(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public ChucVu(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
         @Override
    public String toString() {
        return ten;
    }
//     @Override
//     public boolean equals(Object obj) {
//         if(obj instanceof ChucVu ){
//             ChucVu cv = obj;
//         }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ChucVu){
            ChucVu cv = (ChucVu) obj;
            if(this.id.equals(cv.id)){
                return true;
            }
        }
        return false;
    }
}
