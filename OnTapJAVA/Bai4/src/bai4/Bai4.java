package bai4;

import java.util.Scanner;

import Class.TuyenSinh;

public class Bai4 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_320 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_320.nhapDanhSach(sc_320);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_320.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_320 = sc_320.nextInt();
		sc_320.nextLine();

		dsTuyenSinh_320.timKiemThiSinh(soBaoDanh_320);

		sc_320.close();
	}

}