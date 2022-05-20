package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class NetworkResourcesTest {
	@Mock
	private NetworkLoader networkLoader;
	
	@InjectMocks
	private NetworkResources networkResources;

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
	void test() throws Exception {
		String helloWorld = "Hello World";
		InputStream inputStream = new ByteArrayInputStream(helloWorld.getBytes(StandardCharsets.UTF_8));
		when(networkLoader.getInput()).thenReturn(inputStream);

		assertEquals("Hello World", networkResources.load());
	}

}
