package buoi4;
public class Chuong4_3 {
    public static void bai4_3() {
        @SuppressWarnings("unused")
        int arr1[][] = new int[2][3];
        int i = 0, j = 0;// Khai báo chỉ số để duyệt qua mảng
        System.out.printf("Phần tử thứ nhất arr1[%d][%d]", i, j);
        System.out.printf("\nPhần tử thứ hai arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ ba arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ tư arr1[%d][%d]", i = i + 1, j = 0);
        System.out.printf("\nPhần tử thứ năm arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ sáu arr1[%d][%d]", i, j = j + 1);
    }
    
    public static void main(String[] args) {
        bai4_3();
    }
    } 
    