package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
	private int chiSoMoi_320;
	private int chiSoCu_320;
	private double tien_320;

	public BienLai() {

	}

	public BienLai(int chiSoMoi_320, int chiSoCu_320, double tien_320) {
		this.chiSoMoi_320 = chiSoMoi_320;
		this.chiSoCu_320 = chiSoCu_320;
		this.tien_320 = tien_320;
	}

	public BienLai(String tenChuHo_320, int chiSoMoi_320, int chiSoCu_320, double tien_320) {
		this.tenChuHo_320 = tenChuHo_320;
		this.chiSoMoi_320 = chiSoMoi_320;
		this.chiSoCu_320 = chiSoCu_320;
		this.tien_320 = tien_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_320 = sc_320.nextInt();
		sc_320.nextLine();
		tien_320 = (chiSoMoi_320 - chiSoCu_320) * 750;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_320);
		System.out.println("\tChi so cu: " + chiSoCu_320);
		System.out.println("\tTien: " + tien_320);
	}
}