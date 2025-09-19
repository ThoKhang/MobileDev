package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	private String ngayPhatHanh_320;

	public Bao() {

	}

	public Bao(String maTaiLieu_320, String tenNXB_320, int soBanPhatHanh_320, String ngayPhatHanh_320) {
		super(maTaiLieu_320, tenNXB_320, soBanPhatHanh_320);
		this.ngayPhatHanh_320 = ngayPhatHanh_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_320);
	}
}