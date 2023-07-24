/**
 * 
 */
package day11.solved;

/**
 * @author Vinit Gore
 *
 **/
/**
 * 
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
 
/**
 * @author BharathwajSoundarara
 *
 */

public class UserInsertQuery {
 
    public static void main(String[] args) throws Exception {       
         
        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO user (username, email, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\", \"password007\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
         
        //Step 04: close the connection resources       
        ConnectionUtil.close(connection, stmt, null);
         
         
         
    }
     
}
