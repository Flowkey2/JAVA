import java.util.*;
class collections
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<10;i++)
        {
            list.add(sc.nextInt()+1);
        }

        for(int k:list){
            System.out.println(" "+k);
        }
        list.remove(5);
        System.out.println("After removing element at index 5:");
        for(int k:list){
            System.out.println(" "+k);
        }
    }
}