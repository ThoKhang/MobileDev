package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> dsts_320;

	public TuyenSinh() {
		dsts_320 = new ArrayList<ThiSinh>(10);
	}

	public void themThiSinh(ThiSinh ts_320) {
		dsts_320.add(ts_320);
	}

	public void nhapDanhSach(Scanner sc_320) {
		ThiSinh ts_320;
		int chon_320;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n_320 = sc_320.nextInt();
		sc_320.nextLine();

		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon_320 = sc_320.nextInt();

			switch (chon_320) {
			case 1:
				ts_320 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts_320 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts_320 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts_320 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts_320.nhapThongTin(sc_320);
			themThiSinh(ts_320);
		}
	}

	public void hienThiDanhSach() {
		int n_320 = dsts_320.size();
		for (int i_320 = 0; i_320 < n_320; i_320++) {
			System.out.println("Thi sinh thu " + (i_320 + 1) + " la:");
			dsts_320.get(i_320).hienThiThongTin();
		}
	}

	public void timKiemThiSinh(int soBaoDanh_320) {
		for (ThiSinh ts_320 : dsts_320) {
			if (ts_320.getSoBD() == soBaoDanh_320) {
				ts_320.hienThiThongTin();
			}
		}
	}
}