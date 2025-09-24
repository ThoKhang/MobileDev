package bai10;

import java.util.Scanner;

import Class.QuanLy;

public class Bai10 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		QuanLy ql_320 = new QuanLy();
		ql_320.nhapDanhSach(sc_320);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_320.hienThiDanhSach();

		sc_320.close();
	}

}
