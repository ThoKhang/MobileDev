package Class;

import java.util.Scanner;

public class CanBo {
    private String hoTen320;
    private String ngaySinh320;
    private String gioiTinh320;
    private String diaChi320;

    public CanBo() {
    }

    public CanBo(String hoTen320, String ngaySinh320, String gioiTinh320, String diaChi320) {
        this.hoTen320 = hoTen320;
        this.ngaySinh320 = ngaySinh320;
        this.gioiTinh320 = gioiTinh320;
        this.diaChi320 = diaChi320;
    }

    public String getHoTen() {
        return hoTen320;
    }

    public void setHoTen(String hoTen320) {
        this.hoTen320 = hoTen320;
    }

    public String getNgaySinh() {
        return ngaySinh320;
    }

    public void setNgaySinh(String ngaySinh320) {
        this.ngaySinh320 = ngaySinh320;
    }

    public String getGioiTinh() {
        return gioiTinh320;
    }

    public void setGioiTinh(String gioiTinh320) {
        this.gioiTinh320 = gioiTinh320;
    }

    public String getDiaChi() {
        return diaChi320;
    }

    public void setDiaChi(String diaChi320) {
        this.diaChi320 = diaChi320;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Vui long nhap thong tin!");
        System.out.print("Nhap ho va ten nhan vien: ");
        this.hoTen320 = sc.nextLine();
        System.out.print("Nhap ngay sinh theo dinh dang dd/MM/yyyy: ");
        this.ngaySinh320 = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh320 = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi320 = sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Ho ten nhan vien: " + hoTen320);
        System.out.println("Ngay sinh: " + ngaySinh320);
        System.out.println("Gioi tinh: " + gioiTinh320);
        System.out.println("Dia chi: " + diaChi320);
    }
}
