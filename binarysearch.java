import java.util.*;
public class binarysearch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the elemnt you want to search:");
        int key=sc.nextInt();
        int f=n/2;
        if(arr[f] < key)
        {
        for(int i=f;i<=n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(i+1);
                break;
            }
        }
    }        else if(arr[f]>key)
        {
            for(int i=0;i<=f;i++)
            {
                if(arr[i]==key)
                {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else if(arr[f]==key)
        {
            System.out.println(f+1);
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();
}
}