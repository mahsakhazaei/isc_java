package ir.freeland.jsonquize;
/*
 * main class to use other classes
 */

import java.util.List;
import java.util.Random;
import java.util.logging.LogManager;

import ir.freeland.jsonquize.model.Employee;
import ir.freeland.jsonquize.service.EmployeeService;

import java.io.FileInputStream;
import java.time.LocalDate;

public class EmployeeApplication {
	
	private static final String DATA_EMPLOYEES_JSON = "data-employees.json";
	private static final String LOGGING_PROPERTIES = "logging.properties";

	public static void main(String[] args) throws Exception {
		LogManager.getLogManager().readConfiguration(new FileInputStream(LOGGING_PROPERTIES) );
		List<Employee> employees = EmployeeService.readAllEmployees(DATA_EMPLOYEES_JSON);
		employees.forEach(t ->t.setPhoneNumber(t.getPhoneNumber().substring(1)));
		//EmployeeService.saveEmployee(employees);
	

		
		
		
	}
}