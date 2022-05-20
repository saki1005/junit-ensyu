package junit.tutorial.ex02.e02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	
	public static void main(String[] args) {
		try {
			InputStream employeeText = new FileInputStream(
					"/Users/saki/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/junit-ensyu/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
			List<Employee> employeeList = load(employeeText);
			System.out.println(employeeList.get(0).getFirstName());
			System.out.println(employeeList.get(0).getLastName());
			System.out.println(employeeList.get(0).getEmail());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Employee> load(InputStream input) {
		List<Employee> empList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] items = line.split(",");
				Employee emp = new Employee();
				emp.setFirstName(items[0]);
				emp.setLastName(items[1]);
				emp.setEmail(items[2]);
				empList.add(emp);
			}
			return empList;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
