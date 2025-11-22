import java.util.*;
public class rotateleft {
    public static void Rotateleft(int arr[],int k){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[(i-k+n)%n]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.err.print(temp[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int result[]=new int[n];
        for(int i=0;i<=result.length-1;i++){
            result[i]=sc.nextInt();
        }
        Rotateleft(result,k);
        
            
        
    }    
}