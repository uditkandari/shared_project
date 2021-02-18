package day9task;

public class Customer
{
	private int customerId;
	private String customerName;
	private String cAdd;

	public void customer()
	{		
	}

	@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		Customer c1=(Customer)obj;
		return this.customerId==c1.customerId;				
	}

	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return customerId;
	}

	public Customer(int customerId, String customerName, String cAdd)
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.cAdd = cAdd;
	}

	public int getcustomerId() 
	{
		return customerId;
	}

	public void setcustomerId(int customerId) 
	{
		this.customerId = customerId;
	}

	public String getcustomerName()
	{
		return customerName;
	}

	public void setcustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getcAdd() 
	{
		return cAdd;
	}

	public void setcAdd(String cAdd) 
	{
		this.cAdd = cAdd;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", cAdd=" + cAdd + "]";
	}
}



