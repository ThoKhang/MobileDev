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
        PhanSo sp320_1 = new PhanSo();
        PhanSo sp320_2 = new PhanSo();
        PhanSo sp320_Tong = new PhanSo();
        PhanSo sp320_Hieu = new PhanSo();
        PhanSo sp320_Nhan = new PhanSo();
        PhanSo sp320_Chia = new PhanSo();
        boolean kiemTra320;
        Scanner sc320 = new Scanner(System.in);

        sp320_1.nhapDL(sc320);
        sp320_2.nhapDL(sc320);

        System.out.println("Tong 2 phan so la: ");
        sp320_Tong = sp320_1.congPhanSo(sp320_2);
        sp320_Tong.xuatDL();

        System.out.println("Hieu 2 phan so la: ");
        sp320_Hieu = sp320_1.truPhanSo(sp320_2);
        sp320_Hieu.xuatDL();

        System.out.println("Nhan 2 phan so la: ");
        sp320_Nhan = sp320_1.nhanPhanSo(sp320_2);
        sp320_Nhan.xuatDL();

        System.out.println("Chia 2 phan so la: ");
        sp320_Chia = sp320_1.chiaPhanSo(sp320_2);
        sp320_Chia.xuatDL();

        System.out.println("Chon 1 de kiem tra phan so 1, 2 de kiem tra phan so 2");
        int chon320 = sc320.nextInt();

        switch (chon320) {
            case 1:
                kiemTra320 = sp320_1.phanSoToiGian();
                if (kiemTra320)
                    System.out.println("La phan so toi gian!");
                else
                    System.out.println("Khong phai la phan so toi gian!");

                int ucln320 = sp320_1.UCLN(sp320_1.getTuSo(), sp320_1.getMauSo());
                System.out.printf("Uoc chung lon nhat: %d\n", ucln320);

                PhanSo ps320_DaChia = new PhanSo();
                ps320_DaChia = sp320_1.chiaPhanSoToiGian();
                System.out.println("Phan so sau khi da toi gian: ");
                ps320_DaChia.xuatDL();
                break;

            case 2:
                kiemTra320 = sp320_2.phanSoToiGian();
                if (kiemTra320)
                    System.out.println("La phan so toi gian!");
                else
                    System.out.println("Khong phai la phan so toi gian!");

                ucln320 = sp320_2.UCLN(sp320_2.getTuSo(), sp320_2.getMauSo());
                System.out.printf("Uoc chung lon nhat: %d\n", ucln320);

                ps320_DaChia = new PhanSo();
                ps320_DaChia = sp320_2.chiaPhanSoToiGian();
                System.out.println("Phan so sau khi da toi gian: ");
                ps320_DaChia.xuatDL();
                break;

            default:
                System.out.println("Nhap sai!");
                break;
        }
    }
}
