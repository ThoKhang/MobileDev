package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<TheMuon> ds_320;

	public QuanLy() {
		ds_320 = new ArrayList<TheMuon>(10);
	}

	public void themTheMuon(TheMuon theMuon_320) {
		ds_320.add(theMuon_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		TheMuon theMuon_320;

		System.out.print("Nhap vao so luong the muon: ");
		int n_320 = sc_320.nextInt();
		sc_320.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("The muon thu " + (i_320 + 1) + " la:");
			theMuon_320 = new TheMuon();
			theMuon_320.nhapThongTin(sc_320);
			themTheMuon(theMuon_320);
		}
	}

	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the_320 : ds_320) {
			if (the_320.getHanTra().getDate() == 31 || the_320.getHanTra().getDate() == 30) {
				the_320.hienThiThongTin();
			}
		}
	}
}