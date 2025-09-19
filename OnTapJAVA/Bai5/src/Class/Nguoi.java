package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen_320;
	private Date ngaySinh_320;
	private String ngheNghiep_320;

	public Nguoi() {

	}

	public Nguoi(String hoTen_320, Date ngaySinh_320, String ngheNghiep_320) {
		this.hoTen_320 = hoTen_320;
		this.ngaySinh_320 = ngaySinh_320;
		this.ngheNghiep_320 = ngheNghiep_320;
	}

	public void nhapThongTin(Scanner sc_320) {
		System.out.print("\tNhap ho ten: ");
		hoTen_320 = sc_320.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_320 = sc_320.nextLine();
		ngaySinh_320 = strToDate(strDate_320);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_320 = sc_320.nextLine();
	}

	private Date strToDate(String strDate_320) {
		Date date_320 = null;

		SimpleDateFormat sdf_320 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_320 = sdf_320.parse(strDate_320);
		} catch (ParseException e_320) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_320;
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_320);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh_320));
		System.out.println("\tNghe nghiep: " + ngheNghiep_320);
	}

	private String dateToString(Date date_320) {
		SimpleDateFormat sdf_320 = new SimpleDateFormat("dd-MM-yyyy");

		String strDate_320 = sdf_320.format(date_320);

		return strDate_320;
	}

	public Date getNgaySinh() {
		return ngaySinh_320;
	}
}