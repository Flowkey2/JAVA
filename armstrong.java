import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int count=0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp!=0)
        {
            sum=sum+(int)Math.pow(temp%10,count);
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Armstrong number");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number");
        }
    }
    }
