/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import Class.QLCB;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLCB danhSachCanBo320 = new QLCB ();
        Scanner sc = new Scanner(System.in);
        int check;
        do
        {
            
            System.out.println("Chon chuc nang: 1. them can bo, 2. tim kiem can bo, 3 de ket thuc");
            check = sc.nextInt();
            sc.nextLine();
            switch(check)
            {
                case 1:
                    danhSachCanBo320.themDanhSachCanBo(sc);
                    break;
                case 2:
                    System.out.println("Nhap ho ten can bo can tim: ");
                    String hoTen = sc.nextLine();
                    danhSachCanBo320.timKiem(hoTen);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai");
                    break;
           }
        }
        while (check != 3);
    }
}
