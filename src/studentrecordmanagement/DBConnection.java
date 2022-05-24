/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecordmanagement;

import java.sql.*;


public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_record_management", "root", "");
        } catch (Exception e) {
        }
        return con;
    }
}
