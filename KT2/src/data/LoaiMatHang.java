/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author kimdo
 */
public class LoaiMatHang {
    String Maloai,TenLoai;
    boolean VoHieuHoa;
    public LoaiMatHang (){
        
    }

    public LoaiMatHang(String Maloai, String TenLoai, boolean VoHieuHoa) {
        this.Maloai = Maloai;
        this.TenLoai = TenLoai;
        this.VoHieuHoa = VoHieuHoa;
    }

    public String getMaloai() {
        return Maloai;
    }

    public void setMaloai(String Maloai) {
        this.Maloai = Maloai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public boolean isVoHieuHoa() {
        return VoHieuHoa;
    }

    public void setVoHieuHoa(boolean VoHieuHoa) {
        this.VoHieuHoa = VoHieuHoa;
    }
    
    
}
