import java.util.*;
public class arrayRotation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // Rotate the array
        int rotatedArr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            rotatedArr[i] = arr[(i + d) % n];
        }
        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(rotatedArr[i] + " ");
        }
    }
    
}
