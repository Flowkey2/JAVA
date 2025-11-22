public class employee {
    private String name;
    private int salary;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
        System.out.println("Name:"+name);
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
        System.out.println("Salary:"+salary);
    }
    public double increaseSalary(double percent)
    {
        double increase=salary*percent/100;
        salary+=increase;
        return salary;
    }
    class PrintDetails
    {
        public static void main(String[] args) {
            employee e=new employee();
            e.setName("Kartavya");
            e.getName();
            e.setSalary(50000);
            e.getSalary();
            double newSalary=e.increaseSalary(10);
            System.out.println("New Salary after increment: "+newSalary);
        }
    }
    
}
