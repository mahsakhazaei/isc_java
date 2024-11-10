package HW3.Bank1;

import java.lang.reflect.Array;
import java.util.*;


public class Accounts {
	List <Account> l;
	Map <String,List> mp ;
	public Accounts(Account [] a) {
		this.l= AccountList(a);
		
	}
	public List AccountList (Account []a) {
		return Arrays.asList(a);
	}
	public void AccountPrint() {
		for (Account a:this.l) {			
            a.print();
            
	}}
	public void AccountSortBalance() {
		Collections.sort(l, new Comparator<Account>() {
			@Override
			public int compare(Account a,Account b) {
				return Integer.compare(a.getBalance(), b.getBalance());
			}
		} );
	}
	public void AccountReverseSortBalance() {
		Collections.sort(l, new Comparator<Account>() {
			@Override
			public int compare(Account a,Account b) {
				return Integer.compare(b.getBalance(), a.getBalance());
			}
		} );
	}
	public Map<String, List> map (){
		Map<String, List> m = new HashMap<String, List>();
		for (Account ac:this.l) {
			m.put(ac.getBranch(),List.of(ac.getName(),ac.getBalance()));
		}
		
		for (Map.Entry<String, List> e : m.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue());
		this.mp=m;
		return m;		
	}
	
	public void deleteBasedOnBranch(String key) {
		Map<String, List> m = map();
		m.remove(key);
		for (Map.Entry<String, List> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());}
	
	this.mp=m;}
	
}
