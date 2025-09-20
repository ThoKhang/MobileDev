package bai9;

import java.util.Scanner;

import Class.QuanLy;

public class Bai9 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		QuanLy ql_320 = new QuanLy();

		ql_320.nhapDanhSach(sc_320);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql_320.hienThiDanhSachTraCuoiThang();

		sc_320.close();
	}

}