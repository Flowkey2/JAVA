import java.util.*;
public class sumPrime {
    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static int sumOfPrimes(int n) {
        int sum = 0;
        if (isPrime(n)==1) {
                sum +=n;
            
        return sum;
    }
        else{
            return sumOfPrimes(n-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int n=sc.nextInt();
        System.out.println("Sum of prime numbers up to " + n + " is: " + sumOfPrimes(n));
    }
    
}
