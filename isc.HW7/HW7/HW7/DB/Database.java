package HW7.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	private static final String URL = "jdbc:h2:~/test3";
	private static final String USER = "sa"; // Default username
	private static final String PASSWORD = ""; // Default password (empty)

	public static void main(String[] args) throws SQLException, Throwable {
		String country= "United States of America";
    	String sql = """
    			SELECT DEPARTMENT_NAME
    			FROM   DEPARTMENTS
    			WHERE LOCATION_ID IN (
    				SELECT LOCATION_ID
    				FROM LOCATIONS 
    				WHERE COUNTRY_ID IN(
    				   SELECT COUNTRY_ID
    					FROM COUNTRIES
    					WHERE COUNTRY_NAME = ?
    				)
    			);
    			"""
    	
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        		PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ) {
                System.out.println("Connected to the H2 database successfully!"); 
                preparedStatement.setString(1, country);
                try(ResultSet resultSet = preparedStatement.executeQuery()){
	                // Process the result set 
                	System.out.println("Departments in "+country+" :");
	                while (resultSet.next()) {
	                	System.out.println(resultSet.getString("DEPARTMENT_NAME"));                    
	                }
	                
                }
            } 
        
        System.out.println("finish");
}
	

}