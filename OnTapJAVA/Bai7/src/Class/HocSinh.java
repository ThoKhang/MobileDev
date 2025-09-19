package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop_320;
	private String khoHoc_320;
	private String kyHoc_320;

	public HocSinh() {

	}

	public HocSinh(String hoTen_320, String lop_320, String khoHoc_320, String kyHoc_320) {
		this.hoTen_320 = hoTen_320;
		this.lop_320 = lop_320;
		this.khoHoc_320 = khoHoc_320;
		this.kyHoc_320 = kyHoc_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);

		System.out.print("\tNhap lop: ");
		lop_320 = sc_320.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc_320 = sc_320.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop_320);
		System.out.println("\tKhoa hoc: " + khoHoc_320);
		System.out.println("\tKy hoc: " + kyHoc_320);
	}

	public String getLop() {
		return lop_320;
	}
}