package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee e = emp.findEmployeeById("11");
		assertEquals("Elina", e.getFirstName());
		assertEquals("Sala", e.getLastName());
		assertEquals(3000, e.getSalary());
		//complete the code here
	}

	public void testFindEmployeeById_NoMatchFound() {
		Employee e1 = emp.findEmployeeById("44");
		assertNull(e1);
		//complete the code here
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Sala");
		assertEquals(2
				, list.size());
		//complete the code here
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Earth");
		assertEquals(0, list.size());
		//complete the code here
	}

	public void testFindEmployeeBySalary_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(3000);
		assertEquals(1,list.size());
		//complete the code here
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(10000);
		assertEquals(0,list.size());
		//complete the code here
	}
	
//	public void testInsertEmployee(){
//		Employee e1 = new Employee();
//		e1.setId("77");
//		e1.setFirstName("Tiger");
//		e1.setLastName("Sala");
//		e1.setSalary(2000);
//		
//		emp.insertEmployee(e1);
//		
//		Employee e2 = emp.findEmployeeById("12");
//		assertEquals("Tiger", e2.getFirstName());
//		assertEquals("Sala", e2.getLastName());
//		assertEquals(2000, e2.getSalary());
// }
//		complete the code here
		

}
