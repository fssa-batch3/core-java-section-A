/**
 * 
 */
package day07.solved;

/**
 * @author Vinit Gore
 *
 **/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TaskDuplicate {
	public static void main(String[] args) {
		// Create ArrayList<Task> with tasks having the same name and deadline
		List<Task> taskList = new ArrayList<>();
		taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 18)));
		taskList.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 18)));
		taskList.add(new Task(3, "Task 1", LocalDate.of(2023, 7, 18)));
		taskList.add(new Task(4, "Task 2", LocalDate.of(2023, 7, 18)));

		Task t1 = new Task(1, "Task 1", LocalDate.of(2023, 7, 18));
		Task t2 = new Task(3, "Task 1", LocalDate.of(2023, 7, 18));

		System.out.println("Is t1.equals(t2)?" + t1.equals(t2));

		// Use HashSet<Task> to remove duplicate Task
		Set<Task> taskSet = new HashSet<>(taskList);

		// Convert HashSet<Task> back to ArrayList<Task> (if necessary)
		taskList = new ArrayList<>(taskSet);

		// Print the resulting ArrayList<Task> without duplicate tasks
		System.out.println("ArrayList of Tasks:");
		for (Task task : taskList) {
			System.out.println(task);
		}

		System.out.println("HashSet of Tasks:");
		for (Task task : taskSet) {
			System.out.println(task);
		}
	}
}

class Task {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	// Getters and setters

	@Override
	public String toString() {
		return "Task{" + "id=" + id + ", name='" + name + '\'' + ", deadline=" + deadline + '}';
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (this.getClass() != obj.getClass())
//			return false;
//		Task other = (Task) obj;
//		if (this.name.equals(other.name) && this.deadline.isEqual(other.deadline))
//			return true;
//		else 
//			return false;
//
//	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
//		return result;
		return Objects.hash(this.name, this.deadline);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (!this.name.equals(other.name))
			return false;
		if (!this.deadline.equals(other.deadline))
			return false;
		return true;
	}
}
