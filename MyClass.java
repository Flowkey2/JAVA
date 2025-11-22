public class MyClass{
    public static int fibo(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args)
    {
        int n = 7;
        System.out.print("Fibonacci series up to " + n + ": ");
        for(int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}