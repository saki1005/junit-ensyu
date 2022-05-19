package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {
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
	void test() {
		boolean answer = NumberUtils.isEven(10);
		assertEquals(true, answer, "trueが失敗");
	}

	@Test
	void test2() {
		boolean answer = NumberUtils.isEven(7);
		assertEquals(false, answer, "falseが失敗");
	}
}
