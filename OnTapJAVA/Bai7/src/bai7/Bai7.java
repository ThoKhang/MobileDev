package bai7;

import java.util.Scanner;

import Class.QLHS;

public class Bai7 {

	public static void main(String[] args_320) {
		Scanner sc_320 = new Scanner(System.in);
		
		QLHS list_320 = new QLHS();
		
		list_320.nhapDanhSachHS(sc_320);
		
		System.out.print("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
		list_320.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list_320.timKiemThongTin("10A1");
		
		sc_320.close();
	}

}