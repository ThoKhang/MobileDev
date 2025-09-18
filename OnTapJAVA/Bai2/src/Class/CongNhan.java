package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac320;   

    public String getBac() {
        return bac320;
    }

    public void setBac(String bac320) {
        this.bac320 = bac320;
    }

    public CongNhan() {}

    public CongNhan(String hoTen320, String ngaySinh320, String gioiTinh320, String diaChi320, String bac320) {
        super(hoTen320, ngaySinh320, gioiTinh320, diaChi320);
        this.bac320 = bac320;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap bac: ");
        this.bac320 = sc.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Bac: " + bac320);
    }
}
