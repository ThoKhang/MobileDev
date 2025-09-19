package bai5;

import java.util.Scanner;

import Class.KhuPho;

public class Bai5 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);

		KhuPho qlkp_320 = new KhuPho();

		qlkp_320.nhapDanhSach(sc_320);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_320.timKiemThongTin();
	}

}