package day7Task;

public class Greeting{
	 public static void main(String args[]) 
	 {
	        First t1 = new First();
	        Second t2 = new Second();
	        Third t3 = new Third();
	        t1.start();
	        t2.start();
	        t3.start();
	     
	    }
}


	class First extends Thread 
	{
	    public void run() 
	    {
	        try 
	        {
	            int i=0;
	            while (i<10) 
	            {	            	
	                sleep(1000);
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
	 
	class Second extends Thread 
	{
	    public void run() 
	    {
	        try 
	        {
	            int i=0;
	            while (i<10) 
	            {
	              sleep(2000);
	              System.out.println("Hello");
	              i++;
	            }
	        } catch (Exception e) 
	        {
	        }
	    }
	}
	 
	class Third extends Thread {
	    public void run() {
	        try {
	            int i=0;
	            while (i<10) {
	                sleep(3000);
	                System.out.println("Welcome");
	                i++;
	            }
	        } catch (Exception e) {
	        }
	    }
	}
	 