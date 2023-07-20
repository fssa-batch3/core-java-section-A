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

public class SortingInReverseOrderDemo {
	public static void main(String[] args) {
		ArrayList<String> deptNames = new ArrayList<String>();
		deptNames.add("B");
		deptNames.add("D");
		deptNames.add("A");
		deptNames.add("C");

		System.out.println("Before Sorting: " + deptNames);
		Collections.sort(deptNames);
		System.out.println("After Sorting: " + deptNames);

		Collections.reverse(deptNames);
		System.out.println("Reverse:" + deptNames);

		ArrayList<String> deptNames2 = new ArrayList<String>();
		deptNames2.add("B");
		deptNames2.add("D");
		deptNames2.add("A");
		deptNames2.add("C");

		System.out.println("Before Sorting in reverse: " + deptNames2);
		Collections.sort(deptNames2, Collections.reverseOrder());
		System.out.println("After Sorting in reverse Order:" + deptNames2);
	}
}