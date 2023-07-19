/**
 * 
 */
package day08.solved;

import java.util.HashMap;

/**
 * @author Vinit Gore
 *
 **/
public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);

		// Iterate
		System.out.println("Before:");
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}

		// Modifying a particular count
		int hrCount = deptMap.get("HR");// get
		hrCount += 1; // modify
		deptMap.put("HR", hrCount); // reassign to the key

		// Iterate
		System.out.println("After:");
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}

		// Remove DEVELOPERS
		deptMap.remove("DEVELOPERS");
		deptMap.replace("HR", 8);
		deptMap.replace("SALES", 8);	// Not a key in Map so nothing happens
		
		// Iterate
		System.out.println("Removed DEVELOPERS:");
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
	}
}