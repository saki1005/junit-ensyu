package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
	@DisplayName("2012/1/31=0")
	void test1() {
		LocalDate localDate = LocalDate.of(2012, 01, 31);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		assertEquals(0, monthlyCalendar.getRemainingDays());
	}

	@Test
	@DisplayName("2012/1/30=1")
	void test2() {
		LocalDate localDate = LocalDate.of(2012, 01, 30);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		assertEquals(1, monthlyCalendar.getRemainingDays());
	}

	@Test
	@DisplayName("2012/2/1=28")
	void test3() {
		LocalDate localDate = LocalDate.of(2012, 02, 1);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		assertEquals(28, monthlyCalendar.getRemainingDays());
	}
}
