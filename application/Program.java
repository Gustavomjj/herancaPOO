package herança.application;

import herança.entities.Account;
import herança.entities.BusinessAccount;
import herança.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
 
		Account acc1 = bacc; 	// 	BusinessAccount é uma account, então é possível atribuir.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING 
		
//		BusinessAccount acc4 = acc2; // Não posso atribuir, porque Account não é uma BusinessAccount. É necessário fazer um casting manual; 
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		// BusinessAccount acc6 = (BusinessAccount)acc3; // Vai dar erro porque estou declarando que é um BusinessAccount mas na vdd é um SavingsAccount; 
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
