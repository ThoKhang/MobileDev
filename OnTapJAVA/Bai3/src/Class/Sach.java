package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia_320;
	private int soTrang_320;

	public Sach() {

	}

	public Sach(String maTaiLieu_320, String tenNXB_320, int soBanPhatHanh_320, String tacGia_320, int soTrang_320) {
		super(maTaiLieu_320, tenNXB_320, soBanPhatHanh_320);
		this.tacGia_320 = tacGia_320;
		this.soTrang_320 = soTrang_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);
		System.out.print("\tNhap tac gia: ");
		tacGia_320 = sc_320.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_320 = sc_320.nextInt();
		sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_320);
		System.out.println("\tSo trang: " + soTrang_320);
	}
}