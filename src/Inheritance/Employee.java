package Inheritance;

public class Employee extends Person{
	String title;
	String employername;
	char employeeGrade;
	double salary;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployername() {
		return employername;
	}
	public void setEmployername(String employername) {
		this.employername = employername;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
		return super.toString()+String.format("title -%s , employeegrade- %c , salary - %f",title,employeeGrade,salary);
	}
	
}