/**
 * 
 */
package day08.solved;

import java.util.HashMap;

/**
 * @author BharathwajSoundarara
 *
 */
public class HashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);

		// Iterate
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}

	}

}