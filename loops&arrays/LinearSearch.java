import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to search");

        int key = sc.nextInt();

        int found = -1;

        for(int i = 0; i < n; i++) {

            if(arr[i] == key) {

                found = i;
                break;
            }
        }

        if(found != -1)
            System.out.println("Found at index " + found);
        else
            System.out.println("Not Found");
    }

}
