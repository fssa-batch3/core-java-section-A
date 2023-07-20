/**
 * 
 */
package day06.practice.taskList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Vinit Gore
 *
 **/


public class TaskList {
	
	private ArrayList<Task> taskList;
	
	/**
	 * @param taskList
	 */
	public TaskList() {
		this.taskList = new ArrayList<Task>();
	}

	public ArrayList<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}

	public boolean addToTaskList(Task t) {
		return this.taskList.add(t);
	}
}
