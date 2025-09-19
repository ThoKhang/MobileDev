package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	private int soNgayTro_320;
	private String loaiPhong_320;
	private double giaPhong_320;

	public KhachTro() {

	}

	public KhachTro(String hoTen_320, int CMND_320, int soNgayTro_320, String loaiPhong_320, double giaPhong_320) {
		this.hoTen_320 = hoTen_320;
		this.CMND_320 = CMND_320;
		this.soNgayTro_320 = soNgayTro_320;
		this.loaiPhong_320 = loaiPhong_320;
		this.giaPhong_320 = giaPhong_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_320 = sc_320.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_320 = sc_320.nextDouble();
		sc_320.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro_320);
		System.out.println("\tLoai phong: " + loaiPhong_320);
		System.out.println("\tGia phong: " + giaPhong_320);
	}

	public int getSoNgayTro() {
		return soNgayTro_320;
	}

	public double getGiaPhong() {
		return giaPhong_320;
	}
}