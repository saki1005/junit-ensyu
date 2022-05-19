package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock = new ItemStock();
	Item item = new Item("アイテム１", 1000);
	Item item2 = new Item("アイテム２", 2000);

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
		int answer = itemStock.getNum(item);
		assertEquals(0, answer, "0が失敗");
	}

	@Test
	void test2() {
		itemStock.add(item);
		int answer = itemStock.getNum(item);
		assertEquals(1, answer, "1が失敗");
	}

	@Test
	void test3() {
		itemStock.add(item);
		itemStock.add(item);
		int answer = itemStock.getNum(item);
		assertEquals(2, answer, "2が失敗");
	}

	@Test
	void test4() {
		itemStock.add(item);
		itemStock.add(item2);
		int answer = itemStock.getNum(item);
		assertEquals(1, answer, "1が失敗");
	}
}
