/**
 * 
 */
package day04.solved;

import java.time.LocalDate;

/**
 * @author Vinit Gore
 *
 **/

abstract class Animal {
	// Attributes
	private String name;
	private int age;
	private String gender;
	protected LocalDate dateOfBirth;

	public Animal() {
	}

	public Animal(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Behavior
	abstract public void speaks();
	abstract public void eats() ;

	public void sleeps() {
		System.out.println("Sleeping!");
	}

	public void grows() {
		// some code that increments age along with time
	}
}

class Lion extends Animal {

	// Attributes
	private boolean isBeard;

	public Lion() {
	}

	public Lion(String name) {
//		super(name); // Calling the constructor of Animal class
		System.out.println("Calling Child Constructor");
	}

	// Behavior
	public void hunts() {
		System.out.println("Hunt other animals!");
	}
	
	public void speaks() {
		System.out.println("Roar!!!");
	}
	
	public void eats() {
		System.out.println("Eats flesh!");
	}

}

class Giraffe extends Animal {
	private int height;
	
	public void speaks() {
		System.out.println("Hum!!!");
	}
	
	public void eats() {
		System.out.println("Eats leaves!");
	}
}

public class AnimalSolved {
	public static void main(String[] args) {
		Lion lion1 = new Lion("Simba");
//		lion1.setName("Simba");
		lion1.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		System.out.println(lion1.getName());
		lion1.speaks();
		
		Lion lion2 = new Lion();
		lion2.setName("Leo");
		System.out.println(lion1.getName());
		lion1.sleeps();
		
		Giraffe giraffe1 = new Giraffe();
		giraffe1.setName("Jack");
		System.out.println(giraffe1.getName());
		giraffe1.sleeps();

	}
}
