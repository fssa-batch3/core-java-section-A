/**
 * 
 */
package day02.solved;

/**
 * @author Vinit Gore
 *
 **/
public class Person {
	private String name; // Private data member

	public String getName() { // Public getter method
		return name;
	}

	public void setName(String name) { // Public setter method
		// name = name; Wrong way to use refer the attribute of class
		this.name = name; // this Keyword used for referring current instance
	}

	public static void main(String[] args) {

// Usage
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John
	}
}