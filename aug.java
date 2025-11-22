// import java.util.*;
// public class aug {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int i;
//         int total=0;
//         System.out.println("Enter the no. of days ");
//         int n=sc.nextInt();
//         for( i=1;i<=n;i++){
//             total+=(i*i);
//         }
//         System.out.println("The total charity given "+total);
        
//     }
    
// }
// import java.util.*;
// class aug
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms for Fibonacci series: ");
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.print("Fibonacci Series: ");
//         for(int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//         sc.close();
//     }
// }
import java.util.*;
public class aug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            if(i<n || i==5){

            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
}