import java.util.*;
public class arrayList2
{
    public static void main(String[] args) {
        ArrayList <String> fruits =new ArrayList<>();
        //add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Guava");
        System.out.println("List of fruits is:"+fruits);
        

        //find element
        System.out.println("Element at index 2:"+fruits.get(1));

        //Modify elements
        fruits.set(1, "DragonFruit");
        System.out.println("New List of fruits are:"+fruits); 
        
        //Insert elements
        fruits.add(3,"Apricot");
        System.out.println("After adding fruits the list of fruits is:"+fruits);

        //Remove elements
        fruits.remove(1);
        System.out.println("After removing the new list of fruits is:"+fruits);

        //Check for an elements
        System.out.println("Checking Guava:"+fruits.contains("Guava"));

        //Sort ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted list of fruits is:"+fruits);

        //Iterate In ArrayList
        for(String string : fruits){
            System.out.println(string);
        }

        //Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> next = fruits.iterator();
        while(next.hasNext()){
            System.out.println(next.next());
        }

        //clear ArrayList
        fruits.clear();
        System.out.println("After clearing the list of fruits is:"+fruits); 
          
    }
}