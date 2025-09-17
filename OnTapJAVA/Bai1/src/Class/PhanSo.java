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
public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo()
    {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }
    
    public PhanSo(int tuSo, int mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public PhanSo congPhanSo (PhanSo ps2)
    {
        int tsm = this.tuSo * ps2.mauSo + this.mauSo * ps2.tuSo;
        int msm = this.mauSo * ps2.mauSo;
        return new PhanSo(tsm, msm);
    }
    /*
    public PhanSo congPS(PhanSo ps2) {
        int tsm = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int msm = mauSo * ps2.mauSo;
        PhanSo phanSo = new PhanSo(tsm, msm);
        return phanSo;
    }
    */

    public PhanSo truPhanSo (PhanSo ps2)
    {
        int tsm = this.tuSo * ps2.mauSo - this.mauSo * ps2.tuSo;
        int msm = this.mauSo * ps2.mauSo;
        return new PhanSo (tsm, msm);
    }
    public PhanSo nhanPhanSo (PhanSo ps2)
    {
        int tsm = this.tuSo * ps2.tuSo;
        int msm = this.mauSo * ps2.mauSo;
        return new PhanSo(tsm, msm);
    }
    public PhanSo chiaPhanSo (PhanSo ps2)
    {
        int tsm = this.tuSo * ps2.mauSo;
        int msm = this.mauSo * ps2.tuSo;
        return new PhanSo(tsm, msm);
    }
    public int UCLN (int so1, int so2)
    {
        int a = so1 % so2;
        while (a != 0)
        {
            so1 = so2;
            so2 = a;
            a = so1 % so2;
        }
        return so2;
    }
    public boolean phanSoToiGian()
    {
        int a = UCLN(this.tuSo, this.mauSo);
        if( a == 1 )
            return true;
        else    
            return false;
    }
    public PhanSo chiaPhanSoToiGian()
    {
        int a = UCLN(tuSo, mauSo);
        return new PhanSo (tuSo/a, mauSo/a);
    }
    public void nhapDL (Scanner sc)
    {
        int mauSo, tuSo;
        do
        {
            System.out.println("Vui long nhap  tu so: ");
            tuSo = sc.nextInt();
            System.out.println("Vui long nhap mau so: ");
            mauSo = sc.nextInt();
            if (mauSo == 0)
                System.out.println("Mau so khong duoc co gia tri 0! vui long nhap lai");
            else
            {
                this.tuSo = tuSo;
                this.mauSo = mauSo;
                System.out.println("Nhap thanh cong!");
            }
        }
        while (mauSo == 0);

    }
    public void xuatDL() {
		if (tuSo * mauSo < 0) {
			System.out.println("\t-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		} else {
			System.out.println("\t" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
	}
}
