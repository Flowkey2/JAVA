

public class exception extends Exception {
    public exception(String message)
    {
        super(message);
    }
    
}
class StudentResultProcessing{
    public static void CalculateGrade(int marks) throws exception
    {
        if(marks<0 || marks>100 )
        {
            throw new exception("Marks should be between range");
        }
        if(marks>=90)
        {
            System.out.println("A");
        }
        else if(marks >=80)
        {System.out.println("B");
    }
    else if(marks>=70)
    {
        System.err.println("C");

    }
    else 
    {
        System.err.println("F");

    }
    }
    public static void main(String[] args) {
        try {
            CalculateGrade(85);
            CalculateGrade(105);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
