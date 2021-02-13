package day7Task;

public class IsaliveJoinTask implements Runnable
{

	public void run() 
	{ 
		
		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName() + " is alive " + Thread.currentThread().isAlive());
			System.out.println("udit kandari"); 
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{ 
		IsaliveJoinTask oIsaliveJoinTask1 = new IsaliveJoinTask(); 
		IsaliveJoinTask oIsaliveJoinTask2 = new IsaliveJoinTask();
		Thread oThread1=new Thread(oIsaliveJoinTask1,"Thread 1");
		Thread oThread2=new Thread(oIsaliveJoinTask2,"Thread 2");
		System.out.println("Before start()");
		System.out.println("Thread 1 is alive " + oThread1.isAlive());
		System.out.println("Thread 2 is alive " + oThread2.isAlive());
		oThread1.start(); 
		oThread1.join();
		oThread2.start(); 
		
	
	} 
} 

