import java.util.*;
public class asis 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check if it is a leap year:");
       /* double temp=sc.nextDouble();
        if (temp > 0) 
        {
            if(temp > 40)
            {
                System.out.println("Too hot for outdoor activities.");
                
            }
            else
            System.out.println("Safe for outdoor activities.");
    }
        else
        {
            System.out.println("Too cold for outdoor activities.");
        }
            */
        int year= sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 !=0 || year % 400 == 0)
            {
                    System.out.println(year + " is a leap year.");
                }
            }

                else 
                {
                    System.out.println(year + " is not a leap year.");
                }

    
        }
        }

