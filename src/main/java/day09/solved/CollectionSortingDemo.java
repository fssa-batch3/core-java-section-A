/**
 * 
 */
package day09.solved;

/**
 * @author Vinit Gore
 *
 **/
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("bangalore");
		cityNames.add("Chennai");
		cityNames.add("123");
		cityNames.add("Bangalore");

		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	}
}