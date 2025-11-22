import java.util.*;
class exception extends Exception
{
    public exception(String message)
    {
        super(message);
    }
}

public class onlineshopping {
    public static void Stock(int stock,int purchase) throws exception 
    {
        if(purchase>stock)
        {
            throw new exception("Stock not available");
        }
         else if(purchase<=stock)
        {
            stock=stock-purchase;
            System.out.println("Ordered successfull of "+purchase);
            System.out.println("Stock remaining: "+stock);
        }
        else if(purchase==0)
        {
            System.out.println("No purchase was made");
            System.out.println("Stock present:"+stock);
        }
    }
public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stock present");
        int s=sc.nextInt();
        System.out.println("Enter the stock you want to purchase");
        int p=sc.nextInt();

        try{
            Stock(s,p);
        }
        catch (Exception e)
        {
            System.out.println("Error-"+e.getMessage());
        }
        sc.close();
    }
}

