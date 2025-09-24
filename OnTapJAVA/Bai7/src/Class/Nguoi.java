package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen_320;
	protected Date ngaySinh_320;
	protected String queQuan_320;

	public Nguoi() {

	}

	public Nguoi(String hoTen_320, Date ngaySinh_320, String queQuan_320) {
		this.hoTen_320 = hoTen_320;
		this.ngaySinh_320 = ngaySinh_320;
		this.queQuan_320 = queQuan_320;
	}

	public void nhapThongTin(Scanner sc_320) {
                sc_320.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_320 = sc_320.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate_320 = sc_320.nextLine();
		ngaySinh_320 = strToDate(strDate_320);

		System.out.print("\tNhap que quan: ");
		queQuan_320 = sc_320.nextLine();
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
		System.out.println("\tNgay sinh: " + ngaySinh_320);
		System.out.println("\tQue quan: " + queQuan_320);
	}

	public String getQueQuan() {
		return queQuan_320;
	}

	public Date getNgaySinh() {
		return ngaySinh_320;
	}
}