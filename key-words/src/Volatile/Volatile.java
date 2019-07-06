package Volatile;

public class Volatile {
    private static  boolean flag = false;
    public static void main(String[] args) {
        new Thread(new Runnable(){
            
            @Override
            public void run() {
                for (int i = 1; i <= 5000; i++){
                    System.out.println("printing value " + i);
                }
                flag = true;
            }
            
        }).start();
        
        new Thread(()-> {
            int i = 1;
            while (!flag) i++;
            System.out.println("Job Done " + i);    
        }).start();
    }
}
