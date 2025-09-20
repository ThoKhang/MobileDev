package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon_320;
	private Date ngayMuon_320;
	private Date hanTra_320;
	private String soHieu_320;

	public TheMuon() {

	}

	public TheMuon(int soMuon_320, Date ngayMuon_320, String soHieu_320) {
		this.soMuon_320 = soMuon_320;
		this.ngayMuon_320 = ngayMuon_320;
		this.soHieu_320 = soHieu_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		super.nhapThongTin(sc_320);

		System.out.print("\tNhap so muon: ");
		soMuon_320 = sc_320.nextInt();
		sc_320.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_320 = sc_320.nextLine();
		ngayMuon_320 = strToDate(strNgayMuon_320);

		String strNgayTra_320 = "31-12-2020";
		hanTra_320 = strToDate(strNgayTra_320);

		System.out.println("\tNhap so hieu: ");
		soHieu_320 = sc_320.nextLine();
	}

	private Date strToDate(String strNgayMuon_320) {
		Date date_320 = null;

		SimpleDateFormat sdf_320 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_320 = sdf_320.parse(strNgayMuon_320);
		} catch (ParseException e_320) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_320;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon_320);
		System.out.println("\tNgay muon: " + ngayMuon_320);
		System.out.println("\tHan tra: " + hanTra_320);
		System.out.println("\tSo hieu: " + soHieu_320);
	}

	public Date getHanTra() {
		return hanTra_320;
	}
}