package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAll() {
		Account currentAccount = new Account(1122, 100, "George");
		currentAccount.setAnnualInterestRate(1.5);
		currentAccount.deposit(30, "from mom");
		currentAccount.deposit(40, "from girlfriend");
		currentAccount.deposit(50,  "from ex-girlfriend");
		currentAccount.withdraw(5, "donation to red cross");
		currentAccount.withdraw(4, "coffee");
		currentAccount.withdraw(2, "candy");
		
		// print the id,balance, annualINterestRate, dateCreated for the currentAccount
		//using the System.out.println("") statement
	
//		System.out.println("account id = " + currentAccount.getId());
//		System.out.println("Account balance = " + currentAccount.getBalance());
//		System.out.println("Account annualInterestRate = " + currentAccount.getAnnualInterestRate());
//		System.out.println("Account dateCreated = " + currentAccount.getDateCreated());
//		System.out.println("Account name " + currentAccount.getName());
		
		
		// print all the transactions for current account
		
//		for(Transaction currentTransaction : currentAccount.getTransactions()) {
//			System.out.println("Transaction date = " + currentTransaction.getDate());
//			System.out.println("Transaction type = " + currentTransaction.getType());
//			System.out.println("Transaction amount = " + currentTransaction.getAmount());
//			System.out.println("Transaction balance = " + currentTransaction.getBalance());
//			System.out.println("Transaction description = " + currentTransaction.getDescription());
//			
//		}
		
		System.out.println(currentAccount);
		
		// check the account holder name
		assertEquals("George", currentAccount.getName());
		//check the interest rate is 1.5
		//assertEquals()
		//check the balance is 
		//assertEquals()
		//check number of transactions is 6
		
		//check all 3 withdraw transactions
		//check all 3 deposit transactions
		
		
	}

}
