package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi_320;
	private int soNha_320;
	private Nguoi[] list_320;

	public HoDan() {
		list_320 = new Nguoi[10];
	}

	public HoDan(String hoTen_320, Date ngaySinh_320, String ngheNghiep_320, int soNguoi_320, int soNha_320) {
		super(hoTen_320, ngaySinh_320, ngheNghiep_320);
		this.soNguoi_320 = soNguoi_320;
		this.soNha_320 = soNha_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i_320 = 0; i_320 < soNguoi_320; i_320++) {
			System.out.println("Nguoi thu " + (i_320 + 1) + " la:");
			list_320[i_320] = new Nguoi();
			list_320[i_320].nhapThongTin(sc_320);
		}
	}

	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi_320);
		System.out.println("\tSo nha: " + soNha_320);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i_320 = 0; i_320 < soNguoi_320; i_320++) {
			System.out.println("Nguoi thu " + (i_320 + 1) + " la:");
			list_320[i_320].hienThiThongTin();
		}
	}

	public Nguoi[] getList() {
		return list_320;
	}

	public int getSoNguoi() {
		return soNguoi_320;
	}
}