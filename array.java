import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum+=arr[i];
            
        }
        System.out.println(sum);

        //
        System.out.println("The reverse array is");
        for(int i=4;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
    
}
