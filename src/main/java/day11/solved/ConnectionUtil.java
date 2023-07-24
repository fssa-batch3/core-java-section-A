/**
 * 
 */
package day11.solved;

/**
 * @author Vinit Gore
 *
 **/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/project";
		String userName = "root";
		String passWord = "123456";

		con = DriverManager.getConnection(url, userName, passWord);

		return con;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// No need re throw the exception.
		}
	}
}