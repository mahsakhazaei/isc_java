package iscJavaClass;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DB {
		// JDBC URL, username and password of H2 server
		private static final String URL = "jdbc:h2:~/test2";
		
		private static final String USER = "sa"; // Default username
		private static final String PASSWORD = ""; // Default password (empty)

		public static void main(String[] args) throws SQLException {
			Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);

	            // Query 1: List of Employees in Department with department_id of 1
	            String sql1 = "SELECT * FROM EMPLOYEE WHERE DEPARTMENT_ID = ?";
	            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
	            pstmt1.setInt(1, 1);
	            ResultSet rs1 = pstmt1.executeQuery();

	            System.out.println("List of Employees in Department 1:");
	            while (rs1.next()) {
	                System.out.println(rs1.getString("FIRST_NAME") + " " + rs1.getString("LAST_NAME"));
	            }

	            // Query 2: List of Departments with location_id of 12
	            String sql2 = "SELECT * FROM DEPARTMENT WHERE LOCATION_ID = ?";
	            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
	            pstmt2.setInt(1, 12);
	            ResultSet rs2 = pstmt2.executeQuery();

	            System.out.println("List of Departments in Location 12:");
	            while (rs2.next()) {
	                System.out.println(rs2.getString("DEPARTMENT_NAME"));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

