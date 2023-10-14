/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author kimdo
 */
public class NhanVien {
    int sdt;
    String TenNV,diaChi,Tendangnhap,matkhau,Manv;
    boolean laquanly;
    public NhanVien(){
        
    }
    public NhanVien(String Manv,String TenNV,int sdt,String diaChi,String Tendangnhap,String matkhau,Boolean laquanly){
        this.Manv= Manv;
        this.TenNV = TenNV;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.Tendangnhap = Tendangnhap;
        this.matkhau = matkhau;
        this.laquanly = laquanly;
    }

    public void setTendangnhap(String Tendangnhap) {
        this.Tendangnhap = Tendangnhap;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setLaquanly(boolean laquanly) {
        this.laquanly = laquanly;
    }

    public String getTendangnhap() {
        return Tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public boolean isLaquanly() {
        return laquanly;
    }

    public String getManv() {
        return Manv;
    }

    public int getSdt() {
        return sdt;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
            
  
}
