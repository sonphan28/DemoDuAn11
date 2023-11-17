/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class CTKhoHang {
    private int MaCTKH, MaKhoHang, MaMon;

    public CTKhoHang() {
    }

    public CTKhoHang(int MaCTKH, int MaKhoHang, int MaMon) {
        this.MaCTKH = MaCTKH;
        this.MaKhoHang = MaKhoHang;
        this.MaMon = MaMon;
    }

    public int getMaCTKH() {
        return MaCTKH;
    }

    public void setMaCTKH(int MaCTKH) {
        this.MaCTKH = MaCTKH;
    }

    public int getMaKhoHang() {
        return MaKhoHang;
    }

    public void setMaKhoHang(int MaKhoHang) {
        this.MaKhoHang = MaKhoHang;
    }

    public int getMaMon() {
        return MaMon;
    }

    public void setMaMon(int MaMon) {
        this.MaMon = MaMon;
    }
    
}
