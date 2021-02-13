package day7Task;

public class CarGame {
	public static void main(String[] args) 
	{
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		Car car4=new Car();
		CarRunner c1=new CarRunner(car1);
		CarRunner c2=new CarRunner(car2);
		CarRunner c3=new CarRunner(car3);
		CarRunner c4=new CarRunner(car4);
		Thread d1=new Thread(c1,"Car 1");
		Thread d2=new Thread(c2,"Car 2");
		Thread d3=new Thread(c3,"Car 3");
		Thread d4=new Thread(c4,"Car 4");
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}

class Car
{
	private String modelNo;
	private int carNo;
	public String getModelNo() 
	{
		return modelNo;
	}
	public void setModelNo(String modelNo) 
	{
		this.modelNo = modelNo;
	}
	public int getCarNo() 
	{
		return carNo;
	}
	public void setCarNo(int carNo)
	{
		this.carNo = carNo;
	}
}

class CarRunner implements Runnable
{
	static boolean winner;
	Car car;
	public CarRunner(Car car) 
	{
		this.car=car;
	}
	static int flag=0;
	@Override
	public void run() 
	{
		for (int i = 0; i <= 100; i++) 
		{
			try {
				//use rendom number 
				Thread.sleep(200);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" :" + i);

			if (flag==0) //Accident
			{
				if (i==50) 
				{
					flag=1;
					System.out.println(Thread.currentThread().getName() + "had an accident");
					break;
				}
			}

			if (i==90) //Repairing
			{
				try 
				{
					System.out.println(Thread.currentThread().getName() + "Need 10 SEC for repairing");
					Thread.sleep(10000);					
				}
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (i==35 || i==70) //Pump
			{
				try 
				{
					System.out.println(Thread.currentThread().getName() + " is out of fuel need 5 SECONDS to fill the fuel:");
					Thread.sleep(5000);					
				}catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (winner==false) 
			{
				if(i==100) 
				{
					winner=true;
					System.out.println(Thread.currentThread().getName() + ": came First ");				
				}
			}
			else 
			{
				break;
			}
		}

	}

}
