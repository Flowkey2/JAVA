// import java.util.*;
// public class words {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         int len=s.length();
//         for(int i=0;i<len;i++){
//             System.out.println(s.charAt(i));
//         }
//         System.out.println("Enter the element you want to search");
//         String st=sc.next();
//         System.out.println((s.indexOf(st)));
//         System.out.println("The uppercase is:"+s.toUpperCase());
//         System.out.println("The lowercase is:"+s.toLowerCase());


//         System.out.println("Enter what you want to append");
//         String ap=sc.next();
//         StringBuilder ss=new StringBuilder(s);
//         ss.append(ap);
//         System.out.println("The new word is-"+ss);

//     }


    
// }
import java.util.*;
public class words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String v=sc.nextLine();
        if(s.compareTo(v)>0)
        {
            System.out.println(s);
        }
        else{
            System.out.println(v);
        }
    }
}
