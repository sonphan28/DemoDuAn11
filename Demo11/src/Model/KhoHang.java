/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhoHang {
    private int MaKhoHang;
    private String TenNguyenLieu;
    private float DonGia, KhoiLuong;
    private Date NgaySX, HSD, NgayNhapHang;

    public KhoHang() {
    }

    public KhoHang(int MaKhoHang, String TenNguyenLieu, float DonGia, float KhoiLuong, Date NgaySX, Date HSD, Date NgayNhapHang) {
        this.MaKhoHang = MaKhoHang;
        this.TenNguyenLieu = TenNguyenLieu;
        this.DonGia = DonGia;
        this.KhoiLuong = KhoiLuong;
        this.NgaySX = NgaySX;
        this.HSD = HSD;
        this.NgayNhapHang = NgayNhapHang;
    }

    public int getMaKhoHang() {
        return MaKhoHang;
    }

    public void setMaKhoHang(int MaKhoHang) {
        this.MaKhoHang = MaKhoHang;
    }

    public String getTenNguyenLieu() {
        return TenNguyenLieu;
    }

    public void setTenNguyenLieu(String TenNguyenLieu) {
        this.TenNguyenLieu = TenNguyenLieu;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(float KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public Date getNgayNhapHang() {
        return NgayNhapHang;
    }

    public void setNgayNhapHang(Date NgayNhapHang) {
        this.NgayNhapHang = NgayNhapHang;
    }
    
}
