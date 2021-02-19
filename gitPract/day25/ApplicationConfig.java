

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;


public class ApplicationConfig {
	
@Bean(name="one")
	public Customer getCustomer1()
{
	Customer customer=new Customer();
	customer.setCid("c101");
	customer.setCname("udit");
	customer.setCmob(1245678);
	return customer;
	}

@Bean(name="two")
public Customer getCustomer2()
{
	Customer customer=new Customer();
	customer.setCid("c102");
	customer.setCname("ram");
	customer.setCmob(32165498);
	Address ad=new Address();
	ad.setHno(1);
	ad.setCity("sklm");
	customer.setAdd(ad);
	return customer;
	}
@Bean(name="three")
public Customer getCustomer3()
{
	Customer customer=new Customer();
	customer.setCid("c103");
	customer.setCname("lakshman");
	customer.setCmob(897654);
	List<Item> list=new LinkedList();
	Item item=new Item();
	item.setItemId(1);
	item.setItemName("fan");
	item.setItemPrice(200);
	list.add(item);
	
	Item item2=new Item();
	item2.setItemId(1);
	item2.setItemName("cooker");
	item2.setItemPrice(200);
	list.add(item2);
	customer.setItem(list);
	return customer;
}

@Bean(name="four")
public Customer getCustomer4()
{
	return new Customer("c105","sompal",99658742);	
}

@Bean(name="five")
public Customer getCustomer5()
{
	return new Customer("c106","john",558469,new Address(904,"up"));	
}

@Bean(name="six")
public Customer getCustomer6()
{
	Customer customer=new Customer();
	customer.setCid("c104");
	customer.setCname("arjun");
	customer.setCmob(4489587);
	List<Item> list=new LinkedList();
	list.add(new Item(1,"mixy",50000));
	list.add(new Item(2,"Grinder",20000));
	customer.setItem(list);
	return customer;
	
}














}

