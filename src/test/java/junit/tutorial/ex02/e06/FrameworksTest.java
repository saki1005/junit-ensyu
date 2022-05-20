package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

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
	@CsvSource({ "GlassFish, Oracle, true", "GlassFish, DB2, true", "GlassFish, PostgreSQL, true",
			"GlassFish, MySQL, true", "JBoss, DB2, true", "JBoss, PostgreSQL, true", "Tomcat, MySQL, true"

	})
	void test1(ApplicationServer appServer, Database db, boolean support) {
		assertTrue(Frameworks.isSupport(appServer, db));
	}

	@ParameterizedTest
	@CsvSource({ "JBoss, Oracle, false", "JBoss, MySQL, false", "Tomcat, Oracle, false", "Tomcat, DB2, false",
			"Tomcat, PostgreSQL, false" })
	void test2(ApplicationServer appServer, Database db, boolean support) {
		assertFalse(Frameworks.isSupport(appServer, db));
	}

}
