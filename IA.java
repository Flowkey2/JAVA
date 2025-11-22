import java.util.Scanner;
public class IA {
    public static void main(String[] args) {
    /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(n);
        sc.close(); */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your subscription type (Monthly/Yearly):");
        String subscriptionType = sc.nextLine();
        System.out.println(name + ",you have a " + subscriptionType + " subscription.");
    }
    
}
