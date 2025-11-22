import java.util.Scanner;
public class loop {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        int max=0;
        int smax=0;
        for(int i = 1; i <= n; i++) 
        {
            System.out.println("Enter Score of Player " + i + ":");
            int score = sc.nextInt();
             if(score > max) {
                smax = max;
                max = score;
            } else if(score > smax && score < max) {
                smax = score;
            }   
                

    }
    System.out.println("The second highest score is: " + smax);
        sc.close();
    }
    
}
