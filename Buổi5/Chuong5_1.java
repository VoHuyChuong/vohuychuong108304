package buoi5;

import java.util.Scanner;

public class Chuong5_1 {
    // sử dụng toán tử 3 ngôi - Ternary
    public static int timGiaTriLonNhat(int a, int b) {
        return a > b ? a : b;
    }

    public static int timGiaTriNhoNhat(int a, int b) {
        return a < b ? a : b;
    }

    // sữ dụng pp so sánh
    public static int timGiaTriLonNhatSoSanh(int a, int b) {
        int max = a;
        if (max < b)
            max = b;
        return max;
    }

    public static int timGiaTriNhoNhatSoSanh(int a, int b) {
        int min = a;
        if (min > b)
            min = b;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("nhập số thứ nhất: ");
        num1 = sc.nextInt();
        System.out.print("nhập số thứ hai: ");
        num2 = sc.nextInt();

        // in toán tử 3 ngôi
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2, timGiaTriLonNhat(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2, timGiaTriNhoNhat(num1, num2));

        // in ra pp so sánh
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2,
                timGiaTriLonNhatSoSanh(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2,
                timGiaTriNhoNhatSoSanh(num1, num2));

        sc.close();
    }
}
