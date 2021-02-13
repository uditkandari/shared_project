package day7Task;

public class IsDaemonTask implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		IsDaemonTask oTask1 = new IsDaemonTask();
		IsDaemonTask oTask2 = new IsDaemonTask();
		Thread oThread1 = new Thread(oTask1,"udit");
		Thread oThread2 = new Thread(oTask2,"happy");
		oThread1.setDaemon(true);
		oThread1.start();
		oThread1.join();
		oThread2.start();

	}

	@Override
	public void run() {
		System.out.println("Checking if " + Thread.currentThread().getName() + " is a daemon thread.");
		if (Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName() + " is a daemon thread:");

		}
		else {
			System.out.println(Thread.currentThread().getName() + " is not a daemon thread:");
		}

	}

}
