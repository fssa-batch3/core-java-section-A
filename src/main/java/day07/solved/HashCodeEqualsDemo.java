/**
 * 
 */
package day07.solved;

/**
 * @author Vinit Gore
 *
 **/
/**
 * 
 */
import java.util.ArrayList;
import java.util.HashSet;

class Employee {

	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

public class HashCodeEqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(23);
		Employee emp2 = new Employee(23);
		ArrayList a = new ArrayList();
		a.hashCode();
		System.out.println("emp1.equals(emp2)--->>>" + emp1.hashCode());
		System.out.println("emp1.equals(emp2)--->>>" + emp2.hashCode());
		System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		System.out.println("ArrayList size:" + empList.size());

		HashSet<Employee> setOfEmps = new HashSet<>();
		setOfEmps.add(emp1);
		setOfEmps.add(emp2);

		for (Employee emp : setOfEmps) {
			System.out.println(emp);
		}

		System.out.println("HashSet size:" + setOfEmps.size());

	}

}