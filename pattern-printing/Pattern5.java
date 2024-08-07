
//Program to print Inverted Left Half Pyramid Pattern
import java.util.Scanner;

public class Pattern5 {
    public void demo1(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void demo2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void demo3(int n) {
        for (int i = 1; i < n; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void demo4(int n) {
        for (int i = 1; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern5 obj = new Pattern5();
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
