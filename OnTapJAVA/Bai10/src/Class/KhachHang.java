package Class;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo_320;
	protected int soNha_320;
	protected String maCongTo_320;

	public KhachHang() {

	}

	public KhachHang(String tenChuHo_320, int soNha_320, String maCongTo_320) {
		this.tenChuHo_320 = tenChuHo_320;
		this.soNha_320 = soNha_320;
		this.maCongTo_320 = maCongTo_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_320 = sc_320.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_320);
		System.out.println("\tSo nha: " + soNha_320);
		System.out.println("\tMa cong to: " + maCongTo_320);
	}
}