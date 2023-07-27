/**
 * 
 */
package day11.solved;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

/**
 * @author Vinit Gore
 *
 **/
public class TestCreateUser {

	public static void main(String[] args) {
		UserInsertQuery uiq = new UserInsertQuery();
		
		try {
			int rows = uiq.createUser("vinitgore", "vinit.gore@ctr.freshworks.com", "123456");
			if (rows == 1) {
				System.out.println("Test passed.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Test failed.");
		}
		
	}
	
	// The main method can be converted to this function
	@Test
	public void testCreateUserSuccess() {
		UserInsertQuery uiq = new UserInsertQuery();
		try {
			int rows = uiq.createUser("vinitgore", "vinit.gore@ctr.freshworks.com", "123456");
			assertEquals(rows, 1);
		} catch (SQLException e) {
			e.printStackTrace();
			fail();
		}
	}
}
