/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class ThucDon {
    private int MaThucDon, MaLoai;
    private String TenMon;
    private float DonGia;

    public ThucDon() {
    }

    public ThucDon(int MaThucDon, int MaLoai, String TenMon, float DonGia) {
        this.MaThucDon = MaThucDon;
        this.MaLoai = MaLoai;
        this.TenMon = TenMon;
        this.DonGia = DonGia;
    }

    public int getMaThucDon() {
        return MaThucDon;
    }

    public void setMaThucDon(int MaThucDon) {
        this.MaThucDon = MaThucDon;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }
    
}
