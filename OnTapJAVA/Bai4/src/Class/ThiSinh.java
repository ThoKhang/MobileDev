package Class;

import java.util.Scanner;

public class ThiSinh {
	private int soBD_320;
	private String hoTen_320;
	private String diaChi_320;
	private String dienUuTien_320;

	public ThiSinh() {

	}

	public ThiSinh(int soBD_320, String hoTen_320, String diaChi_320, String dienUuTien_320) {
		this.soBD_320 = soBD_320;
		this.hoTen_320 = hoTen_320;
		this.diaChi_320 = diaChi_320;
		this.dienUuTien_320 = dienUuTien_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap so bao danh: ");
		soBD_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_320 = sc_320.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_320 = sc_320.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_320 = sc_320.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD_320);
		System.out.println("\tHo ten: " + hoTen_320);
		System.out.println("\tDia chi: " + diaChi_320);
		System.out.println("\tDien uu tien: " + dienUuTien_320);
	}

	public int getSoBD() {
		return soBD_320;
	}
}