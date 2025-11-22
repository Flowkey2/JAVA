import java.util.*;
class prg
{
    public static void main(String[] args) {
        /*try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for( int j=0; j<n; j++) {
                System.out.println(arr[j]);
                
            }   }*/
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The lifo array is:");
        for (int j = n-1; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}
}