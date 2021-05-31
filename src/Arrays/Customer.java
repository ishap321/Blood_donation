package Arrays;

public class Customer {
	String name;
	Address homeAddress;
	Address workAddress;
	
	Customer(String name, Address homeAddress)
	{
		this.name=name;
		this.homeAddress=homeAddress;
	}
	
	void getHomeAddress(Address homeAddress)
	{
		this.homeAddress=homeAddress;
	}

	void getworkAddress(Address workAddress)
	{
		this.workAddress=workAddress;
	}
	
	public String toString()
	{
		return String.format("name-[%s], homeAddress-[%s], workAddress-[%s]",name,homeAddress,workAddress);
	}
}
