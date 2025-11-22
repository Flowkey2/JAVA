import java.util.*;
public class SetQues {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> numbers=new HashSet<>();
        for(int i: arr)
        {
            numbers.add(i);
        }
        System.out.println(numbers+" ");
        
    }
    
}
