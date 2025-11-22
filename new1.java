import java.util.*;
public class new1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");        
        String name=sc.nextLine();
        System.out.println("Please enter your age:");
        int age=sc.nextInt();
        System.out.println("Kindly enter your choice:");
        System.out.println("1. Calculate the simple interest");
        System.out.println("2. Calculate the compound interest");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter the principal amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the rate of interest:");
                double r=sc.nextDouble();
                System.out.println("Enter the time in years:");
                double t=sc.nextDouble();
                double si=(p*r*t)/100;
                System.out.println("The simple interest is: " + si);
                break;
            case 2:
                System.out.println("Enter the principal amount:");
                double p1=sc.nextDouble();
                System.out.println("Enter the rate of interest:");
                double r1=sc.nextDouble();
                System.out.println("Enter the time in years:");
                double t1=sc.nextDouble();
                System.out.println("Enter the number of times interest applied per time period:");
                int n=sc.nextInt();
                double ci=p1 * Math.pow((1 + r1 / (n * 100)), n * t1);
                System.out.println("The compound interest is: " + (ci - p1));
                break;
        }

    }
}
