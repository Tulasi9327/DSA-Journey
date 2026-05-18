import java.util.Scanner;

class demo {

    static boolean isArmstrong(int n) {

        int original = n;

        int sum = 0;

        while(n > 0) {

            int digit = n % 10;

            sum += digit * digit * digit;

            n = n / 10;
        }

        return sum == original;
    }

    
}
class Armstrong{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        if(demo.isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

}