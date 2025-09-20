package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	private double luongCung_320;
	private double thuong_320;
	private double phat_320;
	private double luongThucLinh_320;

	public CBGV() {

	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);

		System.out.print("\tNhap luong cung: ");
		luongCung_320 = sc_320.nextDouble();
		sc_320.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong_320 = sc_320.nextDouble();
		sc_320.nextLine();

		System.out.print("\tNhap phat: ");
		phat_320 = sc_320.nextDouble();
		sc_320.nextLine();

		luongThucLinh_320 = luongCung_320 + thuong_320 - phat_320;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung_320);
		System.out.println("\tThuong: " + thuong_320);
		System.out.println("\tPhat: " + phat_320);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_320);
	}

	public double getLuongThucLinh() {
		return luongThucLinh_320;
	}
}