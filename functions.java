import java.util.*;
class functions{
    public int areaRec(int a,int b)
    {
        int area=a*b;
        return area;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length");
        int len=sc.nextInt();
        System.out.println("Enter the value of width");
        int wid=sc.nextInt();
        int area1=0;

        functions ob1=new functions();
        area1+=ob1.areaRec(len, wid);
        System.out.println("The area of rectangle is:- "+area1);


    }

}