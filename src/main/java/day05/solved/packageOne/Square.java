/**
 * 
 */
package day05.solved.packageOne;

/**
 * @author Vinit Gore
 *
 **/
public final class Square extends Rectangle {

	public Square(double side_length) throws Exception {
		super(side_length, side_length);
		System.out.println("Square constructor called.");
	}

	@Override
	protected double calculateArea() {
		System.out.println("Calculated area in the Square class");
		return this.length * this.length;
	}

	public static void main(String[] args) {
		try {
			Square square = new Square(5);
			square.calculateArea();
			Rectangle rect = new Rectangle(5, 5);
			rect.calculateArea();
		} catch (Exception e) {
			System.out.println("Square length should be greater than 0.");
		}

	}
}
