package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds_320;

	public KhachSan() {
		ds_320 = new ArrayList<KhachTro>(10);
	}

	public void themKhachTro(KhachTro kt_320) {
		ds_320.add(kt_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		KhachTro khach_320;

		System.out.print("Nhap vao so luong khach: ");
		int n_320 = sc_320.nextInt();
		sc_320.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Khach tro thu " + (i_320 + 1) + " la:");
			khach_320 = new KhachTro();
			khach_320.nhapThongTin(sc_320);
			themKhachTro(khach_320);
		}
	}

	public void hienThiDanhSach() {
		for (KhachTro khach_320 : ds_320) {
			khach_320.hienThiThongTin();
		}
	}

	public double tinhTien(int CMND_320) {
		double tien_320 = 0;

		for (KhachTro khach_320 : ds_320) {
			if (khach_320.getCMND() == CMND_320) {
				tien_320 = khach_320.getSoNgayTro() * khach_320.getGiaPhong();
			}
		}

		return tien_320;
	}
}