package day12.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day06.practice.taskList.Task;
import day11.solved.ConnectionUtil;

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getMyConnection();
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO tasks (id, name, status) VALUES (?, ?, ?)")) {	// This is the try-with-resources

			// Hint: Set the values for the PreparedStatement using task properties

			// Hint: Execute the update statement
		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
	}

	public void updateTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getMyConnection();
			// Hint: Add the SQL update statement here
				) {

			// Hint: Set the values for the PreparedStatement using task properties

			// Hint: Execute the update statement
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public void deleteTask(int taskId) throws DAOException {
			// Hint: Add the try-with-resources for delete query here
		
			// Hint: Set the value for the PreparedStatement using the taskId

			// Hint: Execute the delete statement
			
			// Hint: Catch the SQLException and throw DAOException with appropriate message
	}

	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getMyConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id, name, status FROM tasks");
				ResultSet rs = stmt.executeQuery()) {

			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return tasks;
	}
}
