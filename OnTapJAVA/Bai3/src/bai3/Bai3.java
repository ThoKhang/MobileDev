package bai3;

import java.util.Scanner;

import Class.QuanLySach;

public class Bai3 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);
		QuanLySach qls_320 = new QuanLySach();
		qls_320.nhapDanhSachTL(sc_320);
		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_320 = sc_320.nextLine();
		qls_320.timLoaiTL(loai_320);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_320 = sc_320.nextLine();
		qls_320.timMaTL(maTL_320);

		sc_320.close();
	}

}