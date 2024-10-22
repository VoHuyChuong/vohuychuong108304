package buoi5;

import java.util.Scanner;

public class Chuong5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập số
        System.out.print("nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("nhập số nguyên b: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("giá trị lớn nhất là: " + max);

        int min = (a < b) ? a : b;
        System.out.println("giá nhỏ nhất là: " + min);

        scanner.close();
    }
}