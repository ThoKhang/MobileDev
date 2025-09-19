package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dshd_320;

	public KhuPho() {
		dshd_320 = new ArrayList<HoDan>(10);
	}

	public void themHoDan(HoDan hoDan_320) {
		dshd_320.add(hoDan_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		HoDan hoDan_320;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan_320 = sc_320.nextInt();
		sc_320.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i_320 = 0; i_320 < soHoDan_320; i_320++) {
			System.out.println("Ho dan thu " + (i_320 + 1) + " la:");
			hoDan_320 = new HoDan();
			hoDan_320.nhapThongTin(sc_320);
			themHoDan(hoDan_320);
		}
	}

	public void hienThiDanhSach() {
		int n_320 = dshd_320.size();

		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Ho dan thu " + (i_320 + 1) + " la:");
			dshd_320.get(i_320).hienThiThongTin();
		}
	}

	public void timKiemThongTin() {
		Date now_320 = new Date();
		int namHienTai_320 = now_320.getYear() + 1900;

		Nguoi[] dstv_320 = null;

		for (HoDan hoDan_320 : dshd_320) {
			dstv_320 = hoDan_320.getList();
			for (int i_320 = 0; i_320 < hoDan_320.getSoNguoi(); i_320++) {
				if (namHienTai_320 - (dstv_320[i_320].getNgaySinh().getYear() + 1900) == 80) {
					hoDan_320.hienThiThongTin();
				}
			}
		}
	}
}