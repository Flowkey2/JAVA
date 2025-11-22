import java.util.*;
public class arrayinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int a[][]=new int [num1][num2];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num1;i++)
        {
            for(int j=0;j<num2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are");
        for(int i=0;i<num1;i++)
        {
            for(int j=0;j<num2;j++)
            {
                System.out.print(a[i][j]+"     ");
            }
            System.out.println();
        }
       
    }
    
}
