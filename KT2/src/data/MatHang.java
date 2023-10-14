/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author kimdo
 */
public class MatHang {
  String MaMH,TenMH,MaLoai,MoTa,DVT;
  int Gia;
  boolean VoHieuHoa;
    public  MatHang(){
        
    }

    public MatHang(String MaMH, String TenMH,int Gia,String DVT, String MaLoai, String MoTa, boolean VoHieuHoa) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.MaLoai = MaLoai;
        this.MoTa = MoTa;
        this.Gia = Gia;
        this.VoHieuHoa = VoHieuHoa;
        this.DVT= DVT;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public boolean isVoHieuHoa() {
        return VoHieuHoa;
    }

    public void setVoHieuHoa(boolean VoHieuHoa) {
        this.VoHieuHoa = VoHieuHoa;
    }
    
    
  
}
