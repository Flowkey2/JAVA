// import java.util.*;
// public class student {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter student's name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter student's age: ");
//         int age = sc.nextInt();
//         System.out.print("Enter student's grade: ");
//         double grade = sc.nextDouble();
//         System.out.println("Student's Name: " + name);
//         System.out.println("Student's Age: " + age);       
//         System.out.println("Student's Grade: " + String.format("%.2f", grade));
//         sc.close();     

// }
// }
class Student{
    private String name;
    private int roll;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
        System.out.println("Name:"+name);
    }
    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int roll)
    {
        this.roll=roll;
        System.out.println(roll);
    }
    class PrintDetail
    {
        public static void main(String[] args) {
            Student s=new Student();
            s.setName("Kartavya");
            s.getName();
            s.setRoll(24);
            s.getRoll();
        }
    }
}