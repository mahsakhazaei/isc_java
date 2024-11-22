package ir.freeland.jsonquize.service;
/*
 * read json and write in DB
 */
import java.io.File;
import java.time.LocalDate; 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ir.freeland.jsonquize.model.Employee;
import ir.freeland.jsonquize.service.exception.EmployeeServiceException;

public class EmployeeService {
	private static final Logger log = Logger.getLogger(EmployeeService.class.getName());
	

	public static List<Employee> readAllEmployees(String fileName) throws EmployeeServiceException {
		//@TODO read employee handle Exception and Log
		File file1 = new File(fileName);
		ObjectMapper objectmapper = new ObjectMapper();
		List<Employee> employee = new ArrayList<>();
		
		try {
			
			employee = objectmapper.readValue(file1, new TypeReference<List<Employee>>() {});
			System.out.println(2);
		
		} catch (DatabindException e) {
			log.severe("can not pars json check file" + fileName);
			throw new EmployeeServiceException("could not bind", e);
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	

	public static int saveEmployee(List<Employee> employees) throws EmployeeServiceException {
		String sql ="""
    				INSERT INTO EMPLOYEES  (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER ,HIRE_DATE ,JOB_ID, SALARY, MANAGER_ID, DEPARTMENT_ID ) 
    				VALUES (?,?,?,?,?,?,1,?,NULL,NULL);
				""";
		int rowsAffected = 0;
	 	try (PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(sql)){
	 		log.info("Connected to the H2 database successfully!");
	 		Random rand = new Random();
	 		//ResultSet resultset;
	 		System.out.println(employees);
	 		for (Employee e: employees) {	
	 			System.out.println(e);
				int max = 2000;
				int min = 300;
		 		preparedStatement.setString(1, Integer.toString(rand.nextInt(max-min)+min));
		 		preparedStatement.setString(2, e.getFirstName());
		 		preparedStatement.setString(3, e.getLastName());
		 		preparedStatement.setString(4, e.getEmail());
		 		preparedStatement.setString(5, e.getPhoneNumber());
		 		preparedStatement.setString(6, LocalDate.now().toString());
		 		preparedStatement.setString(7, e.getSalary());
		 		preparedStatement.executeUpdate();
	 		}
            
	            
	    } catch (SQLException e) {
	    	//@TODO log and throw
		
	   }
	return rowsAffected;
	}
		
}
