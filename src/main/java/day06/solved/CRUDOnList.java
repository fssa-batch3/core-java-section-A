/**
 * 
 */
package day06.solved;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinit Gore
 *
 **/
public class CRUDOnList {

	public static void main(String[] args) {
		// Store the city names in the List
		List<String> cityList = new ArrayList<String>();
		System.out.println("Create initial list.");
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		System.out.println(cityList);
		
		// Adding at particular Index
		cityList.add(2, "Delhi");

		// Added Delhi in Second Index
		System.out.println("Added Delhi at 2nd index");
		System.out.println(cityList);

		// Reading with Index
		System.out.println("Read city at index 1");
		String elementAtOne = cityList.get(1);
		System.out.println(elementAtOne);

		// Changing the element at a particular index

		// Changing the element at 1 as Kolkata
		System.out.println("Update city at index 1 to Kolkata");
		cityList.set(1, "Kolkata");

		// Reading the element at index 1 again
		elementAtOne = cityList.get(1);
		System.out.println(elementAtOne);

		// Deleting elements

		cityList.remove(1);

		System.out.println("Removing the element in the index 1");

		System.out.println(cityList);

		// Removing specific element
		cityList.remove("Delhi");

		System.out.println("List after removing Delhi");

		System.out.println(cityList);

	}
}
