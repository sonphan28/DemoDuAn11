/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class CTHoaDon {
    private int MaHDCT,MaHD,MaMon,MaBan,SoLuong;
    private String MaNV;

    public CTHoaDon() {
    }

    public CTHoaDon(int MaHDCT, int MaHD, int MaMon, int MaBan, int SoLuong, String MaNV) {
        this.MaHDCT = MaHDCT;
        this.MaHD = MaHD;
        this.MaMon = MaMon;
        this.MaBan = MaBan;
        this.SoLuong = SoLuong;
        this.MaNV = MaNV;
    }
    
    public int getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(int MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaMon() {
        return MaMon;
    }

    public void setMaMon(int MaMon) {
        this.MaMon = MaMon;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    
}
