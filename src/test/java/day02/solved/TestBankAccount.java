/**
 * 
 */
package day02.solved;

/**
 * @author Vinit Gore
 *
 **/
public class TestBankAccount {
	 
    public static void main(String[] args) {
         
        //create Account
        BankAccount acct1 = new BankAccount();
        acct1.setAccNo("A101");
        acct1.setName( "Krishna" );
        acct1.setBalance(1000);
 
        System.out.println(acct1.getAccNo());
        System.out.println(acct1.getName());
        System.out.println(acct1.getBalance());
    }
}