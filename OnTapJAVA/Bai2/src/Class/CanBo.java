/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    public CanBo ()
    {
    }
    public CanBo (String hoTen, String ngaySinh, String gioiTinh, String diaChi)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void nhapThongTin(Scanner sc)
    {
        System.out.println("Vui long nhap thong tin!");
        System.out.println("Nhap ho va ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh theo dinh dang dd/MM/yyy: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }
    public void xuatThongTin()
    {
        System.out.println("Ho ten nhan vien: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Gioi tinh:"+gioiTinh);
        System.out.println("Dia chi: "+diaChi);
    }
}
