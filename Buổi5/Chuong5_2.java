package buoi5;

public class Chuong5_2 {
    public static void viDu1() {
        System.out.println("Ví Dụ 1");
        int a = 3;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++ + 1);
        System.out.println(++a + 1);

    }

    public static void viDu2() {
        System.out.println("Ví Dụ 2");
        int a = 0, b, c;
        a++;
        b = a;
        c = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu3() {
        System.out.println("Ví Dụ 3");
        int a = 0, b, c;
        ++a;
        b = a;
        c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu4() {
        System.out.println("Ví Dụ 4");
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu5() {
        System.out.println("Ví Dụ 5");
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu6() {
        System.out.println("Ví Dụ 6");
        int a = 0, b, c;
        ++a;
        b = a++;
        c = b++;
        c += c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
    }
}
