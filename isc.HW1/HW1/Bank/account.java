package HW1.Bank;
import java.time.LocalDateTime;
public class account {
	private int balance;
	private String branch;
	private boolean Locked;
	private LocalDateTime last_transaction ;
	account(int balance){
		this.balance = balance;
		this.last_transaction =  LocalDateTime.now();
		this.branch = "Center";
		this.Locked= false;
	}
	account(int balance,String branch){
		this.balance = balance;
		this.last_transaction = LocalDateTime.now();
		this.branch = branch;
		this.Locked= false;
	}
	public void set_balance(int balance) {
		this.balance = balance;
	}
	public int get_balance() {
		return balance;
	}

	public void get_last_transaction() {
		System.out.println("last transaction:"+last_transaction);
	}
	public boolean isLocked() {
		return Locked;
	}
	public void lock() {
		this.Locked= true;
	}
	public void unlock() {
		this.Locked= false;
	}
	public void withdraw(int n) {
		if(n>0 && n< get_balance()) {
			set_balance(get_balance() - n);
			this.last_transaction = LocalDateTime.now();
			System.out.println("new balance= "+ get_balance());
		}
		else {
			System.out.println("invalid");
		}
	}
	public void deposit(int n) {
		set_balance(get_balance() + n);
		this.last_transaction = LocalDateTime.now();
		System.out.println("new balance= "+ get_balance());
	}
	public void print_info() {
		System.out.println("balance = "+get_balance());
		get_last_transaction();
		System.out.println("branch = "+branch);
		if(isLocked()== true) {
			System.out.println("your account is Locked");
		}
		else {
			System.out.println("your account is not Locked");
		}
		
	}
}
