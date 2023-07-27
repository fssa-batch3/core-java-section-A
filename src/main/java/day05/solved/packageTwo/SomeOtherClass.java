/**
 * 
 */
package day05.solved.packageTwo;

import day05.solved.packageOne.Rectangle;
/**
 * @author Vinit Gore
 *
 **/
public class SomeOtherClass {

	public static void main(String[] args) {
		try {
		Rectangle rectangle = new Rectangle(1.0, 1.0);
		rectangle.calculateArea(); // Gives error
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
