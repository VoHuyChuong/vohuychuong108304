package buoi2;
import java.util.Scanner;
public class VoHuyChuong108304 {
    public static void main(String[] args) {
        // nhập 10 với 5.5
        int num1 = 10;
        float num2 = 5.5f; 

        // in ra
        System.out.println("Xin chào các bạn tân sinh viên lớp IT24B");
        System.out.println("Xin chào các bạn tân sinh viên lớp \"IT24B\"");
        System.out.println("Giá trị của num1 là " + num1);
        System.out.println("Giá trị của num2 là " + num2);

        // Nhập lớp stt tên
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();
    
        System.out.print("Nhập STT: ");
        String STT = scanner.nextLine();
       
        System.out.print("Nhập Họ Và Tên: ");
        String hovaten = scanner.nextLine();
    

        System.out.println("Xin chào các bạn tân sinh viên");
        System.out.println("Họ tên tôi là: " + hovaten);
        System.out.println("STT: " + STT);
        System.out.println("Lớp: " + tenLop);
        
        scanner.close();
    }
}
