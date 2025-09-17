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
public class KySu extends CanBo{
    private String nganhDaoTao;
    public KySu()
    {}
    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao)
    {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    
    @Override
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao: ");
        this.nganhDaoTao = sc.nextLine();
    }
    public void xuatThongTin(Scanner sc)
    {
        super.xuatThongTin();
        System.out.println("Nganh dao tao: "+ nganhDaoTao);
    }
    
        
}
