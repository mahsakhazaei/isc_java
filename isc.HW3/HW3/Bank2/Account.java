package HW3.Bank2;

public class Account {
	private String name;
	private int balance;
	private String branch;
	public Account(String name,int balance,String Branch) {
		this.name = name;
		this.balance=balance;
		this.branch = Branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void print() {
		System.out.println(name+" "+balance +" "+branch);
	}

}
