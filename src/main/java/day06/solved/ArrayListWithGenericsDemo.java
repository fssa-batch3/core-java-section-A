/**
 * 
 */
package day06.solved;

import java.util.ArrayList;

/**
 * @author Vinit Gore
 *
 **/
public class ArrayListWithGenericsDemo {
	public static void main(String[] args) {

		// Store the city names in the List ( use Generics )
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		// Display the city names
		for (String cityName : cityList) {
			System.out.println(cityName);
		}

		System.out.println(cityList); // Use of toString method of 'Object' class

	}
}
