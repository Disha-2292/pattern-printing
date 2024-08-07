
//Program to print Left Half Pyramid Pattern
import java.util.Scanner;

public class Pattern4 {
    void demo1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        Pattern4 obj = new Pattern4();
        obj.demo1(n);
        System.out.println();
        obj.demo2(n);
        System.out.println();
        obj.demo3(n);
        System.out.println();
        obj.demo4(n);
        sc.close();
    }
}
