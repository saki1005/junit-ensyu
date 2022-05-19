package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
		String test1 = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", test1, "aaaが失敗");
	}

	@Test
	void test2() {
		String test1 = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", test1, "hello_worldが失敗");
	}

	@Test
	void test3() {
		String test1 = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", test1, "practice_junitが失敗");
	}

}
