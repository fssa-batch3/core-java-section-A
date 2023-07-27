/**
 * 
 */
package day03.solved;

/**
 * @author Vinit Gore
 *
 **/
public class TestAccount {
	 
    public static void main(String[] args) {
    	
    	Account acc1 = new Account();
    	acc1.setAccNo("A100");
    	acc1.setName("Vinit");
    	acc1.setBalance(0);
         
        //create Account
        Account acct1 = new Account("A101", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
         
//         
        //create Account
        Account acct2 = new Account("Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
    }
 
}