package Static;

class A
{
    static int staticField = 555;    //Static Field
     
    static void staticMethod()
    {
        //Static method
    }
}
 
public class MainClass
{
    public static void main(String[] args) 
    {
        System.out.println(A.staticField);    //Accessing staticField via class name
         
        A.staticMethod();     //Accessing staticMethod via class name
    }
}