import java.util.Scanner;
public class rps {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice (Rock/Paper/Scissors):");
        String c=sc.next();
        switch(c)
        {
            case "Rock":
            System.out.println("Paper");
            System.out.println("B wins...");
            break;
            case "Paper":
            System.out.println("Scissors");
            System.out.println("B wins...");
            break;
            case "Scissors":
            System.out.println("Rock");
            System.out.println("B wins...");
            break; 
            default:
            System.out.println("Invalid choice");
            break;  
        }
}
}
