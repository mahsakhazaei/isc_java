package HW3.Bank2;

import HW3.Bank1.Account;
import HW3.Bank1.Accounts;

public class main {

	public static void main(String[] args) {
		Account m = new Account("mahsa",12,"001");
		Account f = new Account("Ardalan",100,"002");
		Account v = new Account("vida",2,"006");
		Account a = new Account("Amir",5,"003");
		Account s = new Account("sina",30,"021");
		Account e = new Account("Azade",20,"024");
		Account []l = {m,f,v,a,s,e};
		FilterAccount list = new FilterAccount(l);
		list.toUpper();
		list.AStart();
		list.A_Balance();

	}

}
