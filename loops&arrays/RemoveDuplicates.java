import java.util.Scanner;
public class RemoveDuplicates {
    static void remove(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
                boolean duplicate=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.println(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[7];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        remove(arr);
    }
}
