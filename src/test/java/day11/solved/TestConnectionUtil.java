/**
 * 
 */
package day11.solved;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

/**
 * @author Vinit Gore
 *
 **/
public class TestConnectionUtil {

	// Test if the getConnection() method is returning the MySQL
	// connection or not.
	@Test
	public void testGetConnectionSuccess() {
		try {
			Connection connection = ConnectionUtil.getConnection();
//			 if (connection != null)
			assertNotNull(connection);
		} catch (SQLException e) {
			System.out.println(e.getStackTrace());
			fail();
		}
	}
	
	
}
