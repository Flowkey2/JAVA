class Student {
    String name;
    Student() {
        name = "Default";
    }
    Student(String n) {
        name = n;
    }
}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John");
        System.out.println(s1.name + " & " + s2.name);
    }
}