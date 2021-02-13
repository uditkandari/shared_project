package day7Task;

public class GreetingRunnable {

	public static void main(String[] args) {
		One oFirst = new One();
		Two oSecond = new Two();
        Three Three = new Three();
        Thread oThread1 = new Thread(oFirst);
        Thread oThread2 = new Thread(oSecond);
        Thread oThread3 = new Thread(Three);
        oThread1.start();
        oThread2.start();
        oThread3.start();

	}

}
class One implements Runnable
{
    public void run() 
    {
        try 
        {
            int i=0;
            while (i<10) 
            {	            	
                Thread.sleep(1000);
                System.out.println("Good morning ");
                i++;
            }
        } 
        catch (Exception e) 
        {
        	e.printStackTrace();
        }
    }
}
 
class Two implements Runnable
{
    public void run() 
    {
        try 
        {
            int i=0;
            while (i<10) 
            {
            	 Thread.sleep(2000);
              System.out.println("Hello");
              i++;
            }
        } catch (Exception e) 
        {
        }
    }
}
 
class Three implements Runnable
{
    public void run() {
        try {
            int i=0;
            while (i<10) {
            	 Thread.sleep(3000);
                System.out.println("Welcome");
                i++;
            }
        } catch (Exception e) {
        }
    }
}