/**
 * 
 */
package day06.solved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/**
 * @author Vinit Gore
 *
 **/
public class Frequency{
	public static void main(String[] args) {
		List<String> list = Arrays.asList(args);
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);
	}
}