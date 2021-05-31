package Inheritance;

public class Person {
	String name;
	String email;
	String phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
		
	
	public String toString(){
		return String.format("name-%s , email - %s , phoneno - %s", name , email, phoneno);
		
	}
	

	
	
	

}
