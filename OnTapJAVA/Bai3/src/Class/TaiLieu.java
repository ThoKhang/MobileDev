package Class;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu_320;
	private String tenNXB_320;
	private int soBanPhatHanh_320;

	public TaiLieu() {

	}

	public TaiLieu(String maTaiLieu_320, String tenNXB_320, int soBanPhatHanh_320) {
		this.maTaiLieu_320 = maTaiLieu_320;
		this.tenNXB_320 = tenNXB_320;
		this.soBanPhatHanh_320 = soBanPhatHanh_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_320 = sc_320.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_320 = sc_320.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_320 = sc_320.nextInt();
		sc_320.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_320);
		System.out.println("\tTen nha xuat ban: " + tenNXB_320);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_320);
	}

	public String getMaTaiLieu() {
		return maTaiLieu_320;
	}
}