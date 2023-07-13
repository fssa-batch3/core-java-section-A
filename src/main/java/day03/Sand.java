/**
 * 
 */
package day03;

/**
 * @author Vinit Gore
 *
 **/
public class Sand {

	private static int numShovels;

	private int numRakes;

	public static int getNumShovels() {

		return numShovels;

	}

	public int getNumRakes() {

		return numRakes;

	}

	public Sand() {

		System.out.println("a");

	}

	public void Sand() {

		System.out.println("b");

	}

	public void run() {

		new Sand();

		Sand();

	}

	public static void main(String[] args) {

		new Sand().run();
		

	}

}