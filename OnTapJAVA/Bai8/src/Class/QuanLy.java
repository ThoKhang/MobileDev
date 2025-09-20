package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<CBGV> ds_320;

	public QuanLy() {
		ds_320 = new ArrayList<CBGV>(10);
	}

	public void themCBGV(CBGV canBo_320) {
		ds_320.add(canBo_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		CBGV canBo_320;

		System.out.print("Nhap vao so luong can bo: ");
		int n_320 = sc_320.nextInt();
		sc_320.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Can bo thu " + (i_320 + 1) + " la:");
			canBo_320 = new CBGV();
			canBo_320.nhapThongTin(sc_320);
			themCBGV(canBo_320);
		}
	}

	public void hienThiDanhSach() {
		for (CBGV cb_320 : ds_320) {
			cb_320.hienThiThongTin();
		}
	}

	public void timKiem(double luong_320) {
		for (CBGV cb_320 : ds_320) {
			if (cb_320.getLuongThucLinh() >= luong_320) {
				cb_320.hienThiThongTin();
			}
		}
	}
}