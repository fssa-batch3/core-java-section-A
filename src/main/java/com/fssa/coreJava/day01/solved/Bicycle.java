/**
 * 
 */
package com.fssa.coreJava.day01.solved;

/**
 * @author Vinit Gore
 *
 **/

public class Bicycle {
	private int speed = 0;
	private int gear = 0;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		if (speed == 0 && gear == 0) {
			System.out.println("Bicycle is stopped.");
		} else if (speed > 100) {
			System.out.println("Overspeed!");
		} else {
			System.out.println(" speed:" + speed + " gear:" + gear);
		}
	}

//	Automatic gear change
	void changeGearOnSpeed() {
		if (speed == 0) {
			this.changeGear(0);
		} else if (speed > 0 && speed <= 10) {
			this.changeGear(1);
		} else if (speed > 10 && speed <= 30) {
			this.changeGear(2);
		} else if (speed > 30 && speed <= 50) {
			this.changeGear(3);
		} else if (speed > 50 && speed <= 80) {
			this.changeGear(4);
		} else if (speed > 80) {
			this.changeGear(5);
		}
	};

	void printSpeedRange() {
		switch (gear) {
		case 0:
			System.out.println("Speed is 0 kmph");
			break;
		case 1:
			System.out.println("Speed is in the range: 1 to 10 kmph");
			break;
		case 2:
			System.out.println("Speed is in the range: 11 to 30 kmph");
			break;
		case 3:
			System.out.println("Speed is in the range: 31 to 50 kmph");
			break;
		case 4:
			System.out.println("Speed is in the range: 51 to 80 kmph");
			break;
		case 5:
			System.out.println("Speed is in the range: 81 to 100 kmph");
			break;
		default:
			System.out.println("Invalid gear");
		}
	}
	// Create a new Bicycle object

	public static void main(String[] args) {

		Bicycle bicycle1 = new Bicycle();

		// Speed up by 10

		bicycle1.speedUp(10);

		// Show the current speed
		System.out.println("after speedup(10), the current speed is :" + bicycle1.speed);

		// Change gear to 3
		bicycle1.changeGear(3);

		// Show the current gear
		System.out.println("after change gear (03), the current gear is :" + bicycle1.gear);

		// Speed up by 30
		bicycle1.speedUp(30);
		// Apply Brake to reduce the speed to 20
		bicycle1.applyBrakes(20);

		// Change gear to 2
		bicycle1.changeGear(2);
		// Print the current state
		bicycle1.applyBrakes(20);

		bicycle1.speedUp(30);

		// bicycle1.speedUp(100);

		bicycle1.changeGear(0);
		bicycle1.applyBrakes(30);
		bicycle1.speedUp(120);
		bicycle1.changeGear(6);

		bicycle1.printStates();

//                  bicycle1.changeGearOnSpeed();

		bicycle1.printStates();

		bicycle1.printSpeedRange();

	}

}
