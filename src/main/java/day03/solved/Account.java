/**
 * 
 */
package day03.solved;

/**
 * @author Vinit Gore
 *
 **/
public class Account {

	public String accNo;

	public String name;

	public double balance;

	
	public Account() {

	}
	
	
    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

	/**
	 * @param string
	 * @param i
	 */
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}


	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
