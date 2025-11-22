
public class stacktrace {
    public static void methodA(){
        methodB();
    }    
    public static void methodB()
    {
        methodC();
    }
    public static void methodC() throws ArrayIndexOutOfBoundsException
    {
        int [] arr={1,2,3};
        System.out.println(arr[3]);
    }
    public static void main(String[] args) {
        try{
            methodA();
            {
                
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        
    }
}
