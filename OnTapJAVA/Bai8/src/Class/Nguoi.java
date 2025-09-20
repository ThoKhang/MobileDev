package Class;

import java.util.Scanner;

public class Nguoi {
	protected String hoTen_320;
	protected String ngaySinh_320;
	protected String queQuan_320;

	public Nguoi() {

	}

	public Nguoi(String hoTen_320, String ngaySinh_320, String queQuan_320) {
		this.hoTen_320 = hoTen_320;
		this.ngaySinh_320 = ngaySinh_320;
		this.queQuan_320 = queQuan_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap ho ten: ");
		hoTen_320 = sc_320.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_320 = sc_320.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_320);
		System.out.println("\tNgay sinh: " + ngaySinh_320);
		System.out.println("\tQue quan: " + queQuan_320);
	}
}