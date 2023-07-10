/**
 * 
 */
package day01.solved;

/**
 * @author Vinit Gore
 *
 **/
public class StaticVsInstance {
	public static void main(String[] args) {
//		InstanceVariableDemo.main(args);
		StaticVariableDemo.main(args);
		InstanceCounter.main(args);
		System.out.println(InstanceCounter.instanceCount);
	}
}

class StaticVariableDemo {
	// Declare a static variable
	public static int staticVariable = 5;

	public static void main(String[] args) {
		// Access the static variable using the class name
		StaticVariableDemo myObject = new StaticVariableDemo();
		StaticVariableDemo myObject2 = new StaticVariableDemo();

		// Access the instance variable using the object reference
		myObject.staticVariable++;
		System.out.println(myObject.staticVariable);
		System.out.println(myObject2.staticVariable);
		System.out.println(StaticVariableDemo.staticVariable);

	}
}

class InstanceVariableDemo {
	// Declare an instance variable
	public int instanceVariable = 5;

	public static void main(String[] args) {
		// Create an object of MyClass
		InstanceVariableDemo myObject = new InstanceVariableDemo();
		InstanceVariableDemo myObject2 = new InstanceVariableDemo();

		// Access the instance variable using the object reference
		myObject.instanceVariable++;
		System.out.println(myObject.instanceVariable);
		System.out.println(myObject2.instanceVariable);
	}
}

class InstanceCounter {
	public static int instanceCount = 0;

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			InstanceCounter myObject = new InstanceCounter();
			instanceCount++;
			i++;
		}
	}

}
