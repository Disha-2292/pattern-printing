
//Advance Pattern
//Full Pyramid, Inverted Pyramid, Diamond , Hour-glass,
import java.util.Scanner;

public class Pattern6 {
    void demo1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo3(int n) {
        for (int i = 1; i < n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void demo5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void demo6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void demo7(int n) {
        for (int i = 1; i < n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || j == 1 || j == (2 * i - 1)) {
                    System.out.print((char) (64 + i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || j == 1 || j == (2 * i - 1)) {
                    System.out.print((char) (64 + i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern6 obj = new Pattern6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want");
        int n = sc.nextInt();
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
        sc.close();
    }
}
