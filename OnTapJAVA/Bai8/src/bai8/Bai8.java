package bai8;

import java.util.Scanner;

import Class.QuanLy;

public class Bai8 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		QuanLy ql_320 = new QuanLy();

		ql_320.nhapDanhSach(sc_320);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql_320.timKiem(8000000);

		sc_320.close();
	}

}