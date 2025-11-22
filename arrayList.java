import java.util.*;
public class arrayList {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            arr.add(sc.nextInt());
        }
        System.err.println("list is "+arr);
    }
}
