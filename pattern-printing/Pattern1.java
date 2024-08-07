
//Program to print hollow rectangle or square star/number/alphabat/binary patterns
import java.util.Scanner;

public class Pattern1 {
    public void demo1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void demo2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public void demo3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void demo4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public void demo5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void demo6(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println("");
        }
    }

    public void demo7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");

                }
            }
            System.out.println("");
        }
    }

    public void demo8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    public void demo9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void demo10(int n) {
        int i, j, min;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j; // finding minimum value between i and j
                System.out.print(n - min + 1);
            }
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1);
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1);
            }
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1);
            }
            System.out.println();
        }
    }

    public void demo11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (64 + i));
            }
            System.out.println("");
        }
    }

    public void demo12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.println("");
        }
    }

    public void demo13(int n) {
        int count = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (count));
                count++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        Pattern1 obj = new Pattern1();
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
        System.out.println();
        obj.demo13(n);
        sc.close();
    }
}
