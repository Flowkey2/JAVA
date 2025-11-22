import java.util.*;
public class hashSet {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the set:");
        int n=sc.nextInt();

        HashSet <Integer> hs=new HashSet<Integer>(n);
        System.out.println("Enter the elements in set:");
        
        for(int i=0;i<n;i++)
        {
            
            hs.add(sc.nextInt());
        }
       // for (int i  : hs) {
            System.out.println(hs+" ");
            
        //}
        Iterator<Integer> it= hs.iterator();
        System.out.println("Enter the element you want to remove:");
        int target=sc.nextInt();
        hs.remove(target);
        System.out.println("Set after the element removal:"+hs);
        hs.add(15);
        System.out.println(hs+" ");

    }
    
}
