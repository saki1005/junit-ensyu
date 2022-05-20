package junit.tutorial.ex03.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class AuthenticationTest {
	@Mock
	private AccountDao accountDao;

	@InjectMocks
	private Authentication authentication;

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
	@DisplayName("accountDao()がnullを返すときauthenticate()はnull")
	void test1() {
		when(accountDao.findOrNull("id")).thenReturn(null);
		assertEquals(null, authentication.authenticate("id", "pass"));
	}

	@Test
	@DisplayName("accountDao()がobjectを返し、パスワードが一致するときauthenticate()はobjectを返す")
	void test2() {
		Account account = new Account("toita", "nobu");
		when(accountDao.findOrNull("tobita")).thenReturn(account);
		Account accountActual = authentication.authenticate("tobita", "nobu");
		assertEquals(account, accountActual);
	}

	@Test
	@DisplayName("accountDao()がonjectを返し、パスワードが一致しないときauthenticate()はnull")
	void test3() {
		Account account = new Account("toita", "nobu");
		when(accountDao.findOrNull("tobita")).thenReturn(account);
		Account accountActual = authentication.authenticate("tobita", "nobu2");
		assertEquals(null, accountActual);
	}

}
