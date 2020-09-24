package Account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	BankAccount bankAccount;  //used throughout this test

	@BeforeEach
	void setUp() throws Exception {
		bankAccount = new BankAccount();
	}

	@Test
	void testDeposit() {
		bankAccount.deposit(100);
		assertEquals(bankAccount.balance, 100, 0.0);
	}

	@Test
	void testWithdraw() {
		bankAccount.deposit(1000);
		bankAccount.withdraw(100);
		bankAccount.deposit(10);
		assertEquals(bankAccount.balance, 910, 0.0);
	}

}
