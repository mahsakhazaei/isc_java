package ir.freeland.jsonquize.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Utility for connection to database
 * @author A_Fattahi
 */
public class ConnectionManager{
	
	private static final Logger log = Logger.getLogger(ConnectionManager.class.getName());
	private static Connection con = null;
    
    public static Connection getConnection()
    {
    	if (con == null) {
    		try {
                //Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
            }
            catch ( SQLException e) {
                e.printStackTrace();
            }
    	}
        return con;
    }
    

}