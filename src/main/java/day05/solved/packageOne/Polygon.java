/**
 * 
 */
package day05.solved.packageOne;

/**
 * @author Vinit Gore
 *
 **/

// Any closed-side figure with number of sides > 2
public abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	protected abstract double calculateArea();
}
