import java.util.Scanner;

class Fibonacci {

    static void fibonacci(int n) {

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for(int i = 3; i <= n; i++) {

            int c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();

        fibonacci(n);
    }
}