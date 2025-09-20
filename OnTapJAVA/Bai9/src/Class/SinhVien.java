package Class;

import java.util.Scanner;

public class SinhVien {
	protected String hoTen_320;
	protected String maSV_320;
	protected String ngaySinh_320;
	protected String lop_320;

	public SinhVien() {

	}

	public SinhVien(String hoTen_320, String maSV_320, String ngaySinh_320, String lop_320) {
		this.hoTen_320 = hoTen_320;
		this.maSV_320 = maSV_320;
		this.ngaySinh_320 = ngaySinh_320;
		this.lop_320 = lop_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap ho ten: ");
		hoTen_320 = sc_320.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV_320 = sc_320.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_320 = sc_320.nextLine();

		System.out.print("\tNhap lop: ");
		lop_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_320);
		System.out.println("\tNgay sinh: " + ngaySinh_320);
		System.out.println("\tMa sinh vien: " + maSV_320);
		System.out.println("\tLop: " + lop_320);
	}
}