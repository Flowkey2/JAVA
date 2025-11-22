class const1{
    int id;
    String name;
    const1(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        const1 s1=new const1(101,"Sonoo");
        const1 s2=new const1(102,"Ravi");
        s1.display();
        s2.display();
    }
}
 
