package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<BienLai> ds_320;

	public QuanLy() {
		ds_320 = new ArrayList<BienLai>(10);
	}

	public void themBienLai(BienLai bienLai_320) {
		ds_320.add(bienLai_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		BienLai bienLai_320;
		System.out.print("Nhap vao so luong bien lai: ");
		int n_320 = sc_320.nextInt();
		sc_320.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Bien lai thu " + (i_320 + 1) + " la:");
			bienLai_320 = new BienLai();
			bienLai_320.nhapThongTin(sc_320);

			themBienLai(bienLai_320);
		}
	}

	public void hienThiDanhSach() {
		for (int i_320 = 0; i_320 < ds_320.size(); i_320++) {
			System.out.println("Bien lai thu " + (i_320 + 1) + " la:");
			ds_320.get(i_320).hienThiThongTin();
			System.out.println();
		}
	}
}