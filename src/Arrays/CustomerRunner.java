package Arrays;

public class CustomerRunner {

	public static void main(String[] args) {
	
		Address homeaddress = new Address("Solapur","line1","413003");
		Customer customer = new Customer("isha", homeaddress);
		Address workAddress = new Address("Solapur","line1 for work","413004");
		customer.getworkAddress(workAddress);
		System.out.println(customer);
	
	

	}

}
