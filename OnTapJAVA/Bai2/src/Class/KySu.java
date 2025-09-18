package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao320;   // thêm 320 vào tên biến

    public KySu() {}

    public KySu(String hoTen320, String ngaySinh320, String gioiTinh320, String diaChi320, String nganhDaoTao320) {
        super(hoTen320, ngaySinh320, gioiTinh320, diaChi320);
        this.nganhDaoTao320 = nganhDaoTao320;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao320;
    }

    public void setNganhDaoTao(String nganhDaoTao320) {
        this.nganhDaoTao320 = nganhDaoTao320;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao: ");
        this.nganhDaoTao320 = sc.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao320);
    }
}
