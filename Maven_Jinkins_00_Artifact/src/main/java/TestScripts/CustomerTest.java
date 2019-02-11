package TestScripts;

import org.testng.annotations.Test;

public class CustomerTest 
{
	@Test
	public void CreateCustomer()
	{
		System.out.println("Customer Created");
	}
	@Test
	public void ModifyCustomer()
	{
		System.out.println("Customer Modified");
	}
	@Test
	public void DeleteCustomer()
	{
		System.out.println("Customer Deleted");
	}
}
