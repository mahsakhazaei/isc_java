package HW1.Bank;

import HW1.Bank.account;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a = new account(120000,"Mirdamad");
		a.deposit(10000);
		a.withdraw(2000);
		System.out.println(a.get_balance());
		System.out.println(a.isLocked());
		System.out.println();
		a.print_info();
		
		
	}

}
