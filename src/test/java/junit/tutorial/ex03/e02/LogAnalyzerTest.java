package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {
	@Mock
	private LogLoader logLoader;

	@InjectMocks
	private LogAnalyzer logAnalyzer;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("AnalyzeExceptionを再送出")
	void test() throws IOException {
		doThrow(new IOException()).when(logLoader).load("log.txt");

		assertThrows(AnalyzeException.class, () -> this.logAnalyzer.analyze("log.txt"));

//		when(ana)

//		doThrow(new AnalyzeException()).when(logAnalyzer.analyze("log.txt"));
//		try {
//			logAnalyzer.analyze("log.txt");
//		} catch (AnalyzeException e) {
//			System.out.println("AnalyzeExceptionが発生しました");
//		}
	}

}
