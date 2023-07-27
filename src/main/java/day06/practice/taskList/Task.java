/**
 * 
 */
package day06.practice.taskList;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Vinit Gore
 *
 **/
public class Task implements Comparable<Task>{
	private int id;
	private String taskName;
	private LocalDate deadline;
    private int priority;
    private String status; // Status can be "PENDING" / "COMPLETED"
    
    
	/**
	 * @param taskName
	 * @param deadline
	 * @param priority
	 */
	public Task(String taskName, LocalDate deadline, int priority) {
		this.taskName = taskName;
		this.deadline = deadline;
		this.priority = priority;
	}
	
	/**
	 * @param id2
	 * @param name
	 * @param status2
	 */
	public Task(int id, String name, String status) {
		this.id = id;
		this.taskName = name;
		this.status = status;
	}

	/**
	 * 
	 */
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }

    public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	
	/**
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public int hashCode() {
		return Objects.hash(deadline, taskName);
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(deadline, other.deadline) && Objects.equals(taskName, other.taskName);
	}
	
	public String toString() {
		return "Task [taskName=" + taskName + ", deadline=" + deadline + ", priority=" + priority + "]";
	}
	

	public int compareTo(Task other) {
		// compareTo code here
		return 0;
	}

	

    
}
