package Class;

import java.util.Scanner;

public class NhanVienPhucVu extends CanBo {
    private String congViec320;

    public NhanVienPhucVu() {}

    public NhanVienPhucVu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec320) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec320 = congViec320;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap cong viec hien tai: ");
        this.congViec320 = sc.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Cong viec hien tai: " + congViec320);
    }

    public String getCongViec320() {
        return congViec320;
    }

    public void setCongViec320(String congViec320) {
        this.congViec320 = congViec320;
    }
}
