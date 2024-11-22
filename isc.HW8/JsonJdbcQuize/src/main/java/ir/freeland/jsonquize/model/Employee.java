package ir.freeland.jsonquize.model;
/*
 * define class of employee to map json files to its property
 */
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	@JsonProperty ("firstName")
	private String firstName;
	@JsonProperty ("lastName")
	private String lastName;
	@JsonProperty ("email")
	private String email;
	@JsonProperty ("phoneNumber")
	private String phoneNumber;
	@JsonProperty ("salary")
	private String salary;
	public Employee(String firstName, String lastName, String email, String phoneNumber, String salary) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public Employee() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", salary=" + salary + "]";
	}
	
}
