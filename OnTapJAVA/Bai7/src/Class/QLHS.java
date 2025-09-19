package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs_320;

	public QLHS() {
		dshs_320 = new ArrayList<HocSinh>(10);
	}

	public void themHS(HocSinh hs_320) {
		dshs_320.add(hs_320);
	}

	public void nhapDanhSachHS(Scanner sc_320) {
		HocSinh hs_320;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n_320 = sc_320.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("\tHoc sinh thu " + (i_320 + 1) + " la:");

			hs_320 = new HocSinh();
			hs_320.nhapThongTin(sc_320);

			themHS(hs_320);
		}
	}

	public void hienThiDanhSach() {
		int n_320 = dshs_320.size();
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("\tHoc sinh thu " + (i_320 + 1) + " la:");
			dshs_320.get(i_320).hienThiThongTin();
		}
	}

	public void timKiemThongTin(int nam_320, String que_320) {
		for (HocSinh hs_320 : dshs_320) {
			if ((hs_320.getNgaySinh().getYear() + 1900 == nam_320) && (que_320.equals(hs_320.getQueQuan()))) {
				hs_320.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop_320) {
		for (HocSinh hs_320 : dshs_320) {
			if (lop_320.equals(hs_320.getLop())) {
				hs_320.hienThiThongTin();
			}
		}
	}
}