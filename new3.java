/*import java.util.*;
class Vikings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < num; i++) {
            if(arr[i] % (i + 1) == 0) {
                arr[i] = 1;
            } else if(arr[i] % (i + 1) == 1) {
                arr[i] = 0;
            }
        }
        for(int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}*/
/*import java.util.*;
class Coffee
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Welcome "+str);
    }
}*/
import java.util.Scanner;
public class new3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score of Player A:");
        int a = sc.nextInt();
        System.out.println("Enter Score of Player B:");
        int b = sc.nextInt();
        System.out.println("Enter Score of Player C:");
        int c = sc.nextInt();
        if(a<b && a>c)
        {
            System.out.println("Player A is the second highest scorer.");
        }
        else if(b<a && b>c)
        {
            System.out.println("Player B is the second highest scorer.");
        }
        else
        System.out.println("Player C is the second highest scorer.");
        
        
        }
    }



