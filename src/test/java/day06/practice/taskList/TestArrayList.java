/**
 * 
 */
package day06.practice.taskList;

import java.time.LocalDate;

/**
 * @author Vinit Gore
 *
 **/
public class TestArrayList {

	public static void main(String[] args) {		
		Task task1 = new Task("Task 1", LocalDate.of(2023, 07, 25), 3);
		Task task2 = new Task("Task 2", LocalDate.of(2023, 07, 24), 1);
		Task task3 = new Task("Task 1", LocalDate.of(2023, 07, 25), 2);
		Task task4 = new Task("Task 4", LocalDate.of(2023, 07, 22), 2);
		
		TaskList taskListObject = new TaskList();
		taskListObject.addToTaskList(task1);
		taskListObject.addToTaskList(task2);
		taskListObject.addToTaskList(task3);
		taskListObject.addToTaskList(task4);
		
//		System.out.println("ArrayList of tasks: " + taskList);
		System.out.println("Printing taskList:");
		for(Task task: taskListObject.getTaskList()) {
			System.out.println(task);
		}
		
//		HashSet<Task> taskSet = new HashSet<Task>(taskList);
////		System.out.println(taskSet);
//		System.out.println("Printing taskSet:");
//		for(Task task: taskSet) {
//			System.out.println(task);
//		}
		
	}
}
