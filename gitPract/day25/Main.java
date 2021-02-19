

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	Customer customer1;
	Customer customer2;
	Customer customer3;
	Customer customer4;
	Customer customer5;
	Customer customer6;
	
	public static void main(String[] args) 
	{
		Main main = new Main();
		main.createCustomer();
		main.callCustomer();

	}
	public void createCustomer()
	{
		customer1=(Customer)context.getBean("one");
		customer2=(Customer)context.getBean("two");
		customer3=(Customer)context.getBean("three");
		customer4=(Customer)context.getBean("four");
		customer5=(Customer)context.getBean("five");
		customer6=(Customer)context.getBean("six");
	}
	
	public void callCustomer()
	{
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
		System.out.println(customer5);
		System.out.println(customer6);

	}
}
