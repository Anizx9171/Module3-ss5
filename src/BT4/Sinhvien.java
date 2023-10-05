package BT4;

import java.util.Scanner;

public class Sinhvien {
    private String maHS;
    private String tenHS;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;

    public Sinhvien() {
    }

    public Sinhvien(String maHS, String tenHS, int tuoi, String gioiTinh, String diaChi, String soDienThoai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh: ");
        maHS = scanner.nextLine();

        System.out.print("Nhập tên học sinh: ");
        tenHS = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã học sinh: " + maHS);
        System.out.println("Tên học sinh: " + tenHS);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }

    public String getMaHS() {
        return maHS;
    }
}


