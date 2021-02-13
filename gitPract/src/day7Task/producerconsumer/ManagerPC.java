package day7Task.producerconsumer;

public class ManagerPC {


	public static void main(String[] args) throws InterruptedException {
		Shop opc = new Shop();
		Thread producer = new Thread(new Runnable() {
			public void run() {
				try {
					opc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		Thread consumer = new Thread(new Runnable() 
		{
			public void run() 
			{
				try {
					opc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();
		producer.join();
		consumer.join();
	}

}
class Shop{
	public static int getItem() {
		return item;
	}
	public static void setItem(int item) {
		Shop.item = item;
	}

	public static int item = 0;

	public void produce() throws InterruptedException {
		synchronized (this) {	
			notify();
			for (int i = 0; i <= 10; i++) {
				
				if(item >= 10) {
					wait();					
				}
				item++;
				System.out.println("Item produced new total : " + item );
				}
			
		}	
	}

	public void consume() throws InterruptedException {
		synchronized (this) {
			notify();
			if (item == 0)
			{
				wait();
			}
			for (int i = item; i > 0; i--) 
			{
				item--;
				System.out.println("Item consumed new total : " + item );
				Thread.sleep(100);
			}
			

		}
	}	
}

