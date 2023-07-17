/**
 * 
 */
package day06.solved;

/**
 * @author Vinit Gore
 *
 **/
public class StringArray {
	private String[] cityArr;

	StringArray(int size, String[] arr) {
		cityArr = new String[size];
		if (cityArr.length >= arr.length) {
			for (int i = 0; i < arr.length; i++) {
				cityArr[i] = arr[i];
			}
		} else {
			System.out.println("arr length should not be greater than size");
		}
	}

	public void addAtEnd(String cityName) {
		if (cityArr[cityArr.length - 1] == null)
			cityArr[cityArr.length - 1] = cityName;
		else
			System.out.println("Array already full!");
	}

	public void display() {
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}

	}

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] newArr = new String[6];
		newArr[0] = "Chennai";
		newArr[1] = "Bangalore";
		newArr[2] = "Mumbai";
		newArr[3] = "Hyderabad";
		newArr[4] = "Trivandrum";

		StringArray strArr = new StringArray(6, newArr);

		// Display the city names
		System.out.println("Initial array:");
		strArr.display();
		System.out.println(strArr.toString());

		// 1. add "Delhi" at the end of the array
		strArr.addAtEnd("Delhi");
		strArr.addAtEnd("Lucknow");

		// Display the city names
		System.out.println("After adding Delhi:");
		strArr.display();

//		// 2. update "Bangalore" to "Kolkata"
//		String changeCity = "Bangalore";
//		for (int i = 0 ; i < cityArr.length-1; i++) {
//			if (changeCity.equals(cityArr[i])) {
//				cityArr[i] = "Kolkata";
//			}
//		}
//		// Display the city names
//		System.out.println("After update \"Bangalore\" to \"Kolkata\":");
//		strArr.display();
//
//		// 3. remove "Mumbai"
//		boolean start = false;
//		for (int i = 0; i < cityArr.length; i++) {
//			if ("Mumbai".equals(cityArr[i])) {
//				start = true;
//			}
//			if (start && i < cityArr.length-1) {
//				cityArr[i] = cityArr[i + 1];
//			}
//		}
//		cityArr[cityArr.length-1] = null;
//
//		// Display the city names
//		System.out.println("After remove \"Mumbai\":");
//		strArr.display();

	}
}
