/**
 * 
 */
package day02.solved;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vinit Gore
 *
 **/
public class TestBankAccount {

	public static void main(String[] args) {

		// create Account
		BankAccount acct1 = new BankAccount();
		acct1.setAccNo("A101");
		acct1.setName("Krishna");
		acct1.setBalance(1000);
		
		System.out.println(acct1.getAccNo());
		System.out.println(acct1.getName());
		System.out.println(acct1.getBalance());

	}

	@Test
	public void testGetterSetters() {
		// create Account
		BankAccount acct1 = new BankAccount();
		acct1.setAccNo("A101");
		acct1.setName("Krishna");
		acct1.setBalance(1000);

		assertEquals("A101", acct1.getAccNo());
		assertEquals("Krishna", acct1.getName());
		assertEquals(1000, acct1.getBalance());
	}
}