package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh_320;
	private int thangPhatHanh_320;

	public TapChi() {

	}

	public TapChi(String maTaiLieu_320, String tenNXB_320, int soBanPhatHanh_320, int soPhatHanh_320, int thangPhatHanh_320) {
		super(maTaiLieu_320, tenNXB_320, soBanPhatHanh_320);
		this.soPhatHanh_320 = soPhatHanh_320;
		this.thangPhatHanh_320 = thangPhatHanh_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_320 = sc_320.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_320 = sc_320.nextInt();
		sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_320);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_320);
	}
}