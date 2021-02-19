

import java.util.List;

public class Customer
{

	private String customerId;
	private String customerName;
	private long customerMobile;
	private List<Item> Item;
	private Address add;

	public Address getAdd()
	{
		return add;
	}

	public void setAdd(Address add)
	{
		this.add = add;
	}

	public Customer(String cid, String customerName, long customerMobile, Address add) 
	{
		super();
		this.customerId = cid;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.add = add;
	}

	public List<Item> getItem() 
	{
		return Item;
	}

	@Override
	public String toString() 
	{
		return "Customer [cid=" + customerId + ", customerName=" + customerName + ", customerMobile=" + customerMobile + ", Item=" + Item + ", add=" + add + "]";
	}

	public void setItem(List<Item> item)
	{
		Item = item;
	}

	public Customer(String cid, String customerName, long customerMobile, List<Item> item)
	{
		super();
		this.customerId = cid;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.Item = item;
	}

	public Customer()
	{

	}

	public Customer(String cid, String customerName, long customerMobile) 
	{		
		this.customerId = cid;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
	}

	public String getCid() 
	{
		return customerId;
	}

	public void setCid(String cid)
	{
		this.customerId = cid;
	}

	public String getcustomerMobile() 
	{
		return customerName;
	}

	public void setCname(String customerName) 
	{
		this.customerName = customerName;
	}

	public long getCmob() {
		return customerMobile;
	}

	public void setCmob(long customerMobile) 
	{
		this.customerMobile = customerMobile;
	}

}
