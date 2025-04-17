package dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getCon();
            if (con != null) {
                st = con.createStatement();

                // Check if the database exists
                if (!databaseExists(st, "attendanceJframebd")) {
                    // Create the database if it does not exist
                    createDatabase(con, "attendanceJframebd");
                } else {
                    System.out.println("Database already exists.");
                }

                // Use the correct database
                st.execute("USE attendanceJframebd");

                // Check if the userdetails table exists and create it if not
                if (!tableExists(st, "userdetails")) {
                    st.executeUpdate("CREATE TABLE userdetails ("
                            + "id INT AUTO_INCREMENT PRIMARY KEY, "
                            + "name VARCHAR(255) NOT NULL, "
                            + "gender VARCHAR(50) NOT NULL, "
                            + "email VARCHAR(255) NOT NULL, "
                            + "contact VARCHAR(20) NOT NULL, "
                            + "address VARCHAR(500), "
                            + "state VARCHAR(100), "
                            + "country VARCHAR(100), "
                            + "uniqueregid VARCHAR(100) NOT NULL, "
                            + "imagename VARCHAR(100));");
                    System.out.println("Table 'userdetails' created successfully.");
                }

                // Check if the userattendance table exists and create it if not
                if (!tableExists(st, "userattendance")) {
                    // Create userattendance table logic here
                    st.executeUpdate("CREATE TABLE userattendance ("
                            + "id INT AUTO_INCREMENT PRIMARY KEY, "
                            + "user_id INT NOT NULL, "
                            + "checkin DATETIME, "
                            + "checkout DATETIME, "
                            + "workoutduration VARCHAR(100), "
                            + "attendance_date DATE NOT NULL, "
                            + "workoutduration VARCHAR(100), "
                            + "FOREIGN KEY (user_id) REFERENCES userdetails(id));");
                    System.out.println("Table 'userattendance' created successfully.");
                }

                JOptionPane.showMessageDialog(null, "Tables checked/Created Successfully.");

            } else {
                JOptionPane.showMessageDialog(null, "Failed to establish connection.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            // Close resources
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean databaseExists(Statement st, String dbName) throws Exception {
        ResultSet resultset = st.executeQuery("SHOW DATABASES LIKE '" + dbName + "'");
        return resultset.next();
    }

    public static void createDatabase(Connection con, String dbName) throws Exception {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE DATABASE " + dbName);
        System.out.println("Database '" + dbName + "' created successfully.");
        stmt.close();
    }

    private static boolean tableExists(Statement st, String tableName) throws Exception {
        ResultSet resultset = st.executeQuery("SHOW TABLES LIKE '" + tableName + "'");
        return resultset.next();
    }
}
