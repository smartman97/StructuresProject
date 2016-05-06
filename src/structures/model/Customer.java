package structures.model;

public class Customer
{
	private boolean hasOrder;
	private String name;
	private double total;
	
	public Customer(boolean hasOrder, String name, double total)
	{
		this.hasOrder = hasOrder;
		this.name = name;
		this.total = total;
	}

	public boolean isHasOrder()
	{
		return hasOrder;
	}

	public String getName()
	{
		return name;
	}

	public double getTotal()
	{
		return total;
	}

	public void setHasOrder(boolean hasOrder)
	{
		this.hasOrder = hasOrder;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}
	
	
}
