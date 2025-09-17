/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import Class.PhanSo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo sp1 = new PhanSo();
        PhanSo sp2 = new PhanSo();
        PhanSo spTong = new PhanSo();
        PhanSo spHieu = new PhanSo();
        PhanSo spNhan = new PhanSo();
        PhanSo spChia = new PhanSo();
        boolean kiemTra;
        Scanner sc = new Scanner(System.in);
        sp1.nhapDL(sc);
        sp2.nhapDL(sc);
        System.out.println("Tong 2 phan so la: ");
        spTong = sp1.congPhanSo(sp2);
        spTong.xuatDL();
        System.out.println("Hieu 2 phan so la: ");
        spHieu = sp1.truPhanSo(sp2);
        spHieu.xuatDL();
        System.out.println("Nhan 2 phan so la: ");
        spNhan = sp1.nhanPhanSo(sp2);
        spNhan.xuatDL();
        System.out.println("Chia 2 phan so la: ");
        spChia = sp1.chiaPhanSo(sp2);
        spChia.xuatDL();
        System.out.println("Chon 1 de kiem tra phan so 1, 2 de kiem tra phan so 2");
        int chon = sc.nextInt();
        switch(chon)
        {
            case 1:
                kiemTra = sp1.phanSoToiGian();
                if (kiemTra)
                    System.out.println("La phan so toi gian!");
                else
                    System.out.println("khong phai la phan so toi gian !");
                int ucln = sp1.UCLN(sp1.getTuSo(), sp1.getMauSo());
                System.out.printf("Uoc chung lon nhat: %d\n", ucln);
                PhanSo phanSoDaChia = new PhanSo();
                phanSoDaChia = sp1.chiaPhanSoToiGian();
                System.out.println("Phan so sau khi da toi gian: ");
                phanSoDaChia.xuatDL();
                break;  
            case 2:
                kiemTra = sp2.phanSoToiGian();
                if (kiemTra == true)
                    System.out.println("La phan so toi gian!");
                else
                    System.out.println("khong phai la phan so toi gian !");

                        ucln = sp2.UCLN(sp2.getTuSo(), sp2.getMauSo());
                System.out.printf("Uoc chung lon nhat: %d\n", ucln);
                phanSoDaChia = new PhanSo();
                phanSoDaChia = sp2.chiaPhanSoToiGian();
                System.out.println("Phan so sau khi da toi gian: ");
                phanSoDaChia.xuatDL();
            break; 
            default:
                System.out.println("Nhap sai!");
                break;
           
        }
    }
    
}
