package bai6;

import java.util.Scanner;

import Class.KhachSan;

public class Bai6 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		KhachSan ql_320 = new KhachSan();

		ql_320.nhapDanhSach(sc_320);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_320 = sc_320.nextInt();

		System.out.println("==> Tong tien la: " + ql_320.tinhTien(cmnd_320));

		sc_320.close();
	}

}