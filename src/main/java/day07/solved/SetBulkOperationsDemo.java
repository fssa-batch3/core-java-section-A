/**
 * 
 */
package day07.solved;

/**
 * @author Vinit Gore
 *
 **/
import java.util.HashSet;
import java.util.Set;

public class SetBulkOperationsDemo {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(4);
		
		
		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.println(union);
		
		// containsAll()
		if (union.containsAll(s1))
			System.out.println("All elements of s1 present in union");

		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println(intersection);

		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println(difference);

	}
}