/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLCB {
    private ArrayList<CanBo> dsCanBo;
    public QLCB()
    {
        dsCanBo = new ArrayList<CanBo>();
    }
    public void themCanBo (CanBo canBoThem)
    {
        dsCanBo.add(canBoThem);
    }
    public void themDanhSachCanBo (Scanner sc)
    {
        int check;
        do
        {
            System.out.println("Hay can bo vao danh sach !");
            System.out.println("Nhap 1 de them Cong nhan, 2 de them ky su, 3 de them nhan vien phuc vu, 4 de ket thuc");
            check = sc.nextInt();
            sc.nextLine();
            CanBo cbThem;
            switch(check)
            {
                case 1:
                    cbThem = new CongNhan();
                    cbThem.nhapThongTin(sc);
                    themCanBo(cbThem);
                    System.out.println("Da them can bo !");
                    break;
                case 2:
                    cbThem = new KySu();
                    cbThem.nhapThongTin(sc);
                    themCanBo(cbThem);
                    System.out.println("Da them can bo !");
                    break;
                case 3:
                    cbThem = new NhanVienPhucVu();
                    cbThem.nhapThongTin(sc);
                    themCanBo(cbThem);
                    System.out.println("Da them can bo !");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nhap sai cu phap !");
                    break;

            }
        }
        while (check != 4);
    }
    public void timKiem (String hoTen)
    {
        for(CanBo cb: dsCanBo)
        {
            if(hoTen.equals(cb.getHoTen()))
                cb.xuatThongTin();
            else
                System.out.println("deo co trong danh sach !");
        }
    }
}
