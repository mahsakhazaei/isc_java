package HW3.Bank2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import HW3.Bank1.Account;

public class FilterAccount {
	List <Account> l;
	public FilterAccount(Account [] a) {
		this.l= Arrays.asList(a);
	}
	public void toUpper() {
		Consumer<Account> upper = a -> {a.setName((a.getName().toUpperCase()));};
		l.forEach(upper);
		for (Account a:l) {
			a.print();}
	}
	public void AStart() {
		Predicate <Account> startwithA = Account -> Account.getName().startsWith("A");
		List <Account> Afiltered = (List<Account>) l.stream().filter(startwithA).collect(Collectors.toList());
		for (Account a:Afiltered) {
			a.print();
		}
		
	}
	public void A_Balance() {
		Predicate <Account> startwithA = Account -> Account.getName().startsWith("A") && Account.getBalance()>10;
		List <Account> Afiltered = (List<Account>) l.stream().filter(startwithA).collect(Collectors.toList());
		for (Account a:Afiltered) {
			a.print();
		}
	}
	

}
