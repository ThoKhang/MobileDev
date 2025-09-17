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
public class NhanVienPhucVu extends  CanBo{
    private String congViec;
    public NhanVienPhucVu ()
    {}
    public NhanVienPhucVu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec)
    {
       super(hoTen, ngaySinh, gioiTinh, diaChi);
       this.congViec = congViec;
    }
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap cong viec hien tai: ");
        this.congViec = sc.nextLine();
    }
    public void xuatThongTin(Scanner sc)
    {
        super.xuatThongTin();
        System.out.println("cong viec hien tai: "+congViec);
    }
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
}
