/**
 * 
 */
package day07.solved;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Vinit Gore
 *
 **/
public class LoopingOverSet {

	public static void main(String[] args) {

		Set<String> cityNames = new HashSet<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");
		
		// Method 1: Using foreach
		System.out.println("Using foreach:");
		for (String cityName : cityNames) {
			System.out.println(cityName);
		}
		
		// Method 2: Using Iterator class
		System.out.println("Using Iterator class:");
		Iterator<String> iterator = cityNames.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
