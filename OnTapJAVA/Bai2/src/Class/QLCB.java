package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dsCanBo320;

    public QLCB() {
        dsCanBo320 = new ArrayList<CanBo>();
    }

    public void themCanBo(CanBo canBoThem320) {
        dsCanBo320.add(canBoThem320);
    }

    public void themDanhSachCanBo(Scanner sc320) {
        int check320;
        do {
            System.out.println("Hay them can bo vao danh sach!");
            System.out.println("Nhap 1 de them Cong nhan, 2 de them Ky su, 3 de them Nhan vien phuc vu, 4 de ket thuc");
            check320 = sc320.nextInt();
            sc320.nextLine();

            CanBo cbThem320;
            switch (check320) {
                case 1:
                    cbThem320 = new CongNhan();
                    cbThem320.nhapThongTin(sc320);
                    themCanBo(cbThem320);
                    System.out.println("Da them Cong nhan!");
                    break;
                case 2:
                    cbThem320 = new KySu();
                    cbThem320.nhapThongTin(sc320);
                    themCanBo(cbThem320);
                    System.out.println("Da them Ky su!");
                    break;
                case 3:
                    cbThem320 = new NhanVienPhucVu();
                    cbThem320.nhapThongTin(sc320);
                    themCanBo(cbThem320);
                    System.out.println("Da them Nhan vien phuc vu!");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nhap sai cu phap!");
                    break;
            }
        } while (check320 != 4);
    }

    public void timKiem(String hoTen320) {
        boolean timThay320 = false;
        for (CanBo cb320 : dsCanBo320) {
            if (hoTen320.equals(cb320.getHoTen())) {
                cb320.xuatThongTin();
                timThay320 = true;
            }
        }
        if (!timThay320) {
            System.out.println("Khong co trong danh sach!");
        }
    }
}
