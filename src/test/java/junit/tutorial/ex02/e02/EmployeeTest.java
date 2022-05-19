package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws UnsupportedEncodingException, FileNotFoundException {
		String path = "Employee.txt";
		InputStream employee = getClass().getResourceAsStream(path);

		List<Employee> employeeList = Employee.load(employee);
		System.out.println(employeeList.size());

		assertAll("employee", () -> assertEquals("Ichiro", employeeList.get(0).getFirstName()),
				() -> assertEquals("Tanaka", employeeList.get(0).getLastName()),
				() -> assertEquals("ichiro@example.com", employeeList.get(0).getEmail()));
	}

}
