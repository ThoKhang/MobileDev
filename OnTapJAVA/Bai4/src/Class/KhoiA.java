package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1_320;
	private String mon2_320;
	private String mon3_320;

	public KhoiA() {

	}

	public KhoiA(String mon1_320, String mon2_320, String mon3_320) {
		this.mon1_320 = mon1_320;
		this.mon2_320 = mon2_320;
		this.mon3_320 = mon3_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);
		System.out.print("\tNhap mon 1: ");
		mon1_320 = sc_320.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_320 = sc_320.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_320 + " - " + mon2_320 + " - " + mon3_320);
	}
}