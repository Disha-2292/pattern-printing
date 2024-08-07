
//Program to print Right Half Pyramid Pattern 
import java.util.Scanner;

public class Pattern2 {

    void demo1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void demo3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    void demo8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo9(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    void demo10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }

    void demo11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }

    void demo12(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + count));
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        Pattern2 obj = new Pattern2();
        obj.demo1(n);
        System.out.println();
        obj.demo2(n);
        System.out.println();
        obj.demo3(n);
        System.out.println();
        obj.demo4(n);
        System.out.println();
        obj.demo5(n);
        System.out.println();
        obj.demo6(n);
        System.out.println();
        obj.demo7(n);
        System.out.println();
        obj.demo8(n);
        System.out.println();
        obj.demo9(n);
        System.out.println();
        obj.demo10(n);
        System.out.println();
        obj.demo11(n);
        System.out.println();
        obj.demo12(n);
        sc.close();
    }
}
