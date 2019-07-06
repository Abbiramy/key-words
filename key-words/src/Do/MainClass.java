package Do;

public class MainClass
{
    public static void main(String[] args) 
    {
        int a = 10;
         
        int b = 20;
         
        do
        {
            a = a + b;
             
            b = b + 10;
             
            System.out.println("a = "+a);
             
            System.out.println("b = "+b);
             
        } while (a <= 100);
    }
}