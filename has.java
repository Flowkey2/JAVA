import java.util.*;
public class has {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in A");
        int a= sc.nextInt();
        System.out.println("Enter value in B");
        int b= sc.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }
        else
        System.err.println("B is greater than A");
        sc.close();

}
}
