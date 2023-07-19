/**
 * 
 */
package day06.solved;

import java.util.ArrayList;

/**
 * @author Vinit Gore
 *
 **/
public class IntegerArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		arr.add(3);

		System.out.println(arr);

		arr.remove(3); // Takes 3 as the index value

		System.out.println("After arr.remove(3): " + arr);

		arr.remove(Integer.valueOf(3)); //

		System.out.println("After arr.remove(Integer.valueOf(3)) " + arr);
	}
}
