package HW7.json;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	@JsonProperty("name")
	String name;
	@JsonProperty ("balance")
	String balance;
	
	public Account(String name,String balance) {
		this.name = name;
		
		this.balance = balance;
	}
	public void transaction(String amount,String destination) {
		Integer number=0;
        try {
            number = Integer.valueOf(amount);
            System.out.println("Converted integer: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }

		if (Integer.valueOf(this.balance)>number) {
			String description=" ";
			this.balance = String.valueOf(Integer.valueOf(this.balance)-number);
			description = description+" "+amount+" transferd to "+ destination;
		}
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

}
