package Account;

public class BankAccount {
   double balance;
   String owner;
   
   //deposit
   public void deposit (double amount) {
	   balance += amount;
   }
   
   //withdraw
   public void withdraw (double amount) {
	  balance -= amount; 
   }
}
