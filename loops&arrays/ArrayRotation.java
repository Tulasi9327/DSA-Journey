import java.util.Scanner;
public class ArrayRotation {
    static void rotate(int[] arr) {

        int first = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    static void printArray(int[] arr) {

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        rotate(arr);

        printArray(arr);
    }
}
