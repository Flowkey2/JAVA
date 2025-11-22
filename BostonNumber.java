import java.util.*;
public class BostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isBoston(n) ? "Is Boston." : "Not a Boston!");
    }

    static boolean isBoston(int n) {
        int digitSum = sumOfDigits(n);
        int factorDigitSum = 0;
        int num = n;
        boolean hasFactor = false;

        for (int i = 2; i * i <= num; i++) {
            while (n % i == 0) {
                factorDigitSum += sumOfDigits(i);
                n /= i;
                hasFactor = true;
            }
        }

        if (n > 1 && n != num) {
            factorDigitSum += sumOfDigits(n);
            hasFactor = true;
        }

        // Only composite numbers can be Boston numbers
        return hasFactor && digitSum == factorDigitSum;
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
