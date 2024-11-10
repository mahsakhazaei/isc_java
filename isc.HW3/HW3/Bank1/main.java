package HW3.Bank1;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Account m = new Account("mahsa",1000,"001");
		Account f = new Account("farzane",2000,"002");
		Account v = new Account("vida",4000,"006");
		Account a = new Account("amir",3500,"003");
		Account s = new Account("sina",2000,"021");
		Account []l = {m,f,v,a,s};
		Accounts list = new Accounts(l);
		list.AccountSortBalance();
		list.AccountPrint();
		list.AccountReverseSortBalance();
		list.AccountPrint();
		list.map();
		System.out.println("-------");
		list.deleteBasedOnBranch("002");
		
		

	}

	

}
