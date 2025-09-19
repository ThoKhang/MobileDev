package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	private ArrayList<TaiLieu> dstl_320;

	public QuanLySach() {
		dstl_320 = new ArrayList<TaiLieu>(10);
	}

	public void themTaiLieu(TaiLieu tl_320) {
		dstl_320.add(tl_320);
	}

	public void nhapDanhSachTL(Scanner sc_320) {
		int chon_320;
		String stop_320;
		TaiLieu tl_320;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_320 = sc_320.nextInt();
			sc_320.nextLine();

			switch (chon_320) {
			case 1:
				tl_320 = new Sach();
				break;
			case 2:
				tl_320 = new TapChi();
				break;
			case 3:
				tl_320 = new Bao();
				break;

			default:
				tl_320 = new Sach();
				break;
			}

			tl_320.nhapThongTin(sc_320);
			themTaiLieu(tl_320);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_320 = sc_320.nextLine();
		} while (stop_320.equals("c"));
	}

	public void timMaTL(String maTL_320) {
		for (TaiLieu tl_320 : dstl_320) {
			if (maTL_320.equals(tl_320.getMaTaiLieu())) {
				tl_320.hienThiThongTin();
			}
		}
	}

	public void timLoaiTL(String loai_320) {
		for (TaiLieu tl_320 : dstl_320) {
			if (loai_320.equals("Sach") && (tl_320 instanceof Sach)) {
				tl_320.hienThiThongTin();
			} else if (loai_320.equals("TapChi") && (tl_320 instanceof TapChi)) {
				tl_320.hienThiThongTin();
			} else if (loai_320.equals("Bao") && (tl_320 instanceof Bao)) {
				tl_320.hienThiThongTin();
			}
		}
	}
}