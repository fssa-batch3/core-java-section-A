/**
 * 
 */
package day04.solved;

/**
 * @author Vinit Gore
 *
 **/
import java.util.HashMap;

/**
 * Solved Example for day 1
 * 
 * @author BharathwajSoundarara
 *
 */
class Movie {
	public String title;

	public void watchMovie() {
		int numberOfPeople = 100;
	}

	public void bookMovie() {
		System.out.println("Movie booked");
	}

	public class MemoryAllocationDemo {
		public static void main(String[] args) {
			Movie movie1 = new Movie();
			movie1.title = "Harry Potter";

			Movie movie2 = new Movie();

			movie2.title = "Lord of the Rings";

			Movie movie3 = movie2;

			HashMap<String, Integer> map1 = new HashMap<String, Integer>();
			HashMap<String, Integer> map2 = new HashMap<String, Integer>();
			HashMap<String, Integer> map3 = new HashMap<String, Integer>();

			// Each object will be Stored in a separate memory location
			// so it will print false
			System.out.println(movie1 == movie2);

			new Movie().watchMovie();

		}
	}
}
