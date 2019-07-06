package Assert;

public class  MainClass
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 50; i++)
        {
            System.out.println(i);
             
            if(i == 30)
            {
                break;
            }
        }
    }
}