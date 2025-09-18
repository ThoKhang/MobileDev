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
public class PhanSo 
    {
    private int tuSo320;
    private int mauSo320;

    public PhanSo() 
    {
        this.tuSo320 = 0;
        this.mauSo320 = 1;
    }

    public int getMauSo() 
    {
        return mauSo320;
    }

    public int getTuSo() 
    {
        return tuSo320;
    }
    
    public PhanSo(int tuSo320, int mauSo320) 
    {
        this.tuSo320 = tuSo320;
        this.mauSo320 = mauSo320;
    }

    public PhanSo congPhanSo(PhanSo ps320) 
    {
        int tsm = this.tuSo320 * ps320.mauSo320 + this.mauSo320 * ps320.tuSo320;
        int msm = this.mauSo320 * ps320.mauSo320;
        return new PhanSo(tsm, msm);
    }

    public PhanSo truPhanSo(PhanSo ps320) 
    {
        int tsm = this.tuSo320 * ps320.mauSo320 - this.mauSo320 * ps320.tuSo320;
        int msm = this.mauSo320 * ps320.mauSo320;
        return new PhanSo(tsm, msm);
    }

    public PhanSo nhanPhanSo(PhanSo ps320) 
    {
        int tsm = this.tuSo320 * ps320.tuSo320;
        int msm = this.mauSo320 * ps320.mauSo320;
        return new PhanSo(tsm, msm);
    }

    public PhanSo chiaPhanSo(PhanSo ps320) 
    {
        int tsm = this.tuSo320 * ps320.mauSo320;
        int msm = this.mauSo320 * ps320.tuSo320;
        return new PhanSo(tsm, msm);
    }

    public int UCLN(int so1, int so2) 
    {
        int a = so1 % so2;
        while (a != 0) {
            so1 = so2;
            so2 = a;
            a = so1 % so2;
        }
        return so2;
    }

    public boolean phanSoToiGian() 
    {
        int a = UCLN(this.tuSo320, this.mauSo320);
        if (a == 1)
            return true;
        else
            return false;
    }

    public PhanSo chiaPhanSoToiGian() 
    {
        int a = UCLN(tuSo320, mauSo320);
        return new PhanSo(tuSo320 / a, mauSo320 / a);
    }

    public void nhapDL(Scanner sc320) 
    {
        int tuSo320, mauSo320;
        do {
            System.out.println("Vui long nhap tu so: ");
            tuSo320 = sc320.nextInt();
            System.out.println("Vui long nhap mau so: ");
            mauSo320 = sc320.nextInt();
            if (mauSo320 == 0)
                System.out.println("Mau so khong duoc co gia tri 0! vui long nhap lai");
            else {
                this.tuSo320 = tuSo320;
                this.mauSo320 = mauSo320;
                System.out.println("Nhap thanh cong!");
            }
        } while (mauSo320 == 0);
    }

    public void xuatDL() 
    {
        if (tuSo320 * mauSo320 < 0) {
            System.out.println("\t-" + Math.abs(tuSo320) + "/" + Math.abs(mauSo320));
        } else {
            System.out.println("\t" + Math.abs(tuSo320) + "/" + Math.abs(mauSo320));
        }
    }
}
