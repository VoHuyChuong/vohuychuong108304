package buoi6;

import java.util.Scanner;

public class Chuong6 {
    public static void bai61_1() {
        String hoTen = "Võ Huy Chương";
        String ngaySinh = "03/12/2006";
        String diemTongKet = "8.5";
        String tuoi = "18";
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }

    public static void bai61_2() {
        String hoTen = "Võ Huy Chương";
        String ngaySinh = "03/12/2006";
        Float diemTongKet = 8.8f;
        int tuoi = 18;
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");
    }

    public static void bai62_1() {
        String hoTen;
        String ngaySinh;
        String diemTongKet;
        String tuoi;

        Scanner sc = new Scanner(System.in);
        System.out.print("họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("ngày sinh(dd/mm/yy): ");
        ngaySinh = sc.nextLine();
        System.out.print("điểm tổng kết: ");
        diemTongKet = sc.nextLine();
        System.out.print("tuổi: ");
        tuoi = sc.nextLine();

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");

        sc.close();
    }

    public static void bai62_2() {
        String hoTen;
        String ngaySinh;
        Float diemTongKet;
        Integer tuoi;

        Scanner sc = new Scanner(System.in);
        System.out.print("họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("ngày sinh(dd/mm/yy): ");
        ngaySinh = sc.nextLine();
        System.out.print("điểm tổng kết: ");
        diemTongKet = sc.nextFloat();
        System.out.print("tuổi: ");
        tuoi = sc.nextInt();

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");

        sc.close();

    }

    public static void main(String[] args) {
        bai61_1();
        bai61_2();
        bai62_1();
        bai62_2();
    }
}
