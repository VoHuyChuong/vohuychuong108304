package buoi3;
import java.util.Scanner;
public class VoHuyChuong108304 {
    public static void main(String[] args) {
         // NHẬP THÔNG TIN TỪ MÃ NGUỒN
         String maSV = "108304";
         String hoVaTen = "Võ Huy Chương";
         String ngaySinh = "03/12/2006";
         int tuoi = 18;
         boolean gioiTinh = true; 
         String lop = "IT24B";
         String khoa = "CNTT";
         String diaChi = "Đà Nẵng";
 
         // in ra
         System.out.println("-----THÔNG TIN SINH VIÊN-----");
         System.out.println("Mã sinh viên: " + maSV);
         System.out.println("Họ và tên: " + hoVaTen);
         System.out.println("Ngày sinh: " + ngaySinh);
         System.out.println("Tuổi: " + tuoi);
         System.out.println("Giới tính (Nam: true, Nữ: false): " + gioiTinh);
         System.out.println("Lớp: " + lop);
         System.out.println("Khoa: " + khoa);
         System.out.println("Địa chỉ: " + diaChi);

        //NHẬP THÔNG TIN TỪ BÀN PHÍM
        //nhập dữ liệu
        System.out.println("\n-----THÔNG TIN SINH VIÊN NHẬP TỪ BÀN PHÍM-----");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Mã SV: ");
        String MaSV2 = scanner.nextLine();

        System.out.print("Họ và tên: ");
        String hovaten2 = scanner.nextLine();

        System.out.print("ngày sinh: ");
        String ngaysinh2 = scanner.nextLine();

        System.out.print("tuổi: ");
        int tuoi2 = scanner.nextInt();

        System.out.print("Giới tính (Nam: true, Nữ: false): ");
        boolean gioitinh2 = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Lớp: ");
        String lop2 = scanner.nextLine();

        System.out.print("Khoa: ");
        String khoa2 = scanner.nextLine();
        
        System.out.print("địa chỉ: ");
        String diachi2 = scanner.nextLine();

        //in ra
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Mã sinh viên: " + MaSV2);
        System.out.println("Họ và tên: " + hovaten2);
        System.out.println("ngày sinh: " + ngaysinh2);
        System.out.println("tuổi: " + tuoi2);
        System.out.println("Giới tính (Nam: true, Nữ: false):" + gioitinh2);
        System.out.println("Lớp: " + lop2);
        System.out.println("Khoa: " + khoa2);
        System.out.println("địa chỉ: " + diachi2);
        scanner.close();

  }
}
