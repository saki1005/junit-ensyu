package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	Counter counter = new Counter();

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
	void test1() {
		int answer = counter.increment();
		assertEquals(1, answer, "Not yet implemented");
	}

	@Test
	void test2() {
		counter.increment();
		int answer = counter.increment();

		assertEquals(2, answer, "Not yet implemented");
	}

	@Test
	void test3() {
		for (int i = 0; i < 50; i++) {
			counter.increment();
		}
		int answer = counter.increment();
		assertEquals(51, answer, "Not yet implemented");
	}
}
