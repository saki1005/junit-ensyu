package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	@ParameterizedTest
	@DisplayName("min=-0.0,max=10.5で0.0,10.5のときtrue")
	@ValueSource(doubles = { -0.1, 0.0, 10.5, 10.6 })
	void test1(double value) {
		Range range = new Range(0.0, 10.5);
		boolean answer = range.contains(value);
		if (answer == true) {
			assertTrue(answer);
		} else {
			assertFalse(answer);
		}
	}

	@ParameterizedTest
	@DisplayName("min=-5.1,max=5.1で-5.1,5.1のときtrue")
	@ValueSource(doubles = { -5.2, -5.1, 5.1, 5.2 })
	void test3(double value) {
		Range range = new Range(-5.1, 5.1);
		boolean answer = range.contains(value);
		if (answer == true) {
			assertTrue(answer);
		} else {
			assertFalse(answer);
		}
	}
}
