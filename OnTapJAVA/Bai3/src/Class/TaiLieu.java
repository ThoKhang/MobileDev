/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    private int maTaiLieu_320;
    private String tenNhaSanXuat_320;
    private int soBanPhatHanh_320;
    public TaiLieu()
    {}
    public TaiLieu(int maTaiLieu_320, String tenNhaSanXuat_320, int soBanPhatHanh_320)
    {
        this.maTaiLieu_320 = maTaiLieu_320;
        this.tenNhaSanXuat_320 = tenNhaSanXuat_320;
        this.soBanPhatHanh_320 = soBanPhatHanh_320;
    }
    public void nhapThongTin(Scanner sc)
    {
        System.out.println("Nhap thong tin !");
        System.out.println("Nhap ma tai lieu: ");
        this.maTaiLieu_320 = sc.nextInt();
        System.out.println("Nhap ten nha san xuat: ");
        this.tenNhaSanXuat_320 = sc.nextLine();
        System.out.println("Nhap ten so ban phat hanh: ");
        this.soBanPhatHanh_320 = sc.nextInt();
    }
    public void xuatThongTin ()
    {
        System.out.println("Ma tai lieu: "+maTaiLieu_320);
        System.out.println("Ten nha san xuat: "+tenNhaSanXuat_320);
        System.out.println("So ban phat hanh: "+soBanPhatHanh_320);
    }

    public int getMaTaiLieu_320() {
        return maTaiLieu_320;
    }

    public int getSoBanPhatHanh_320() {
        return soBanPhatHanh_320;
    }

    public String getTenNhaSanXuat_320() {
        return tenNhaSanXuat_320;
    }

    public void setMaTaiLieu_320(int maTaiLieu_320) {
        this.maTaiLieu_320 = maTaiLieu_320;
    }

    public void setSoBanPhatHanh_320(int soBanPhatHanh_320) {
        this.soBanPhatHanh_320 = soBanPhatHanh_320;
    }

    public void setTenNhaSanXuat_320(String tenNhaSanXuat_320) {
        this.tenNhaSanXuat_320 = tenNhaSanXuat_320;
    }
    
}
