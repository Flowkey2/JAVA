public class Object {

    static int debt = 0;


    String name;
    int value;

   
    public Object(String name, int value) {
        this.name = name;
        this.value = value;
        debt+=500; 
    }

   
    public void printState() {
        System.out.println("Name: " + name + ", Money: " + value);
    }

    
    public static void printObjectCount() {
        System.out.println("Total debt taken: " + debt);
    }

    public static void main(String[] args) {
        Object obj1 = new Object("Ram", 100);
        Object obj2 = new Object("Shyam", 2000);

        obj1.printState();
        obj2.printState();

        Object.printObjectCount();
    }
}