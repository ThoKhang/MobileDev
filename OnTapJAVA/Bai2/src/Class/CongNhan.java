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
public class CongNhan extends CanBo {
    private String bac;

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    public CongNhan()
    {}
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac)
    {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }
    @Override
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap bac: ");
        this.bac = sc.nextLine();
    }
    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.println("Bac: "+bac);
    }
}
