import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {
	private Basket testBasket;
	private Book testBook1;
	private Book testBook2;

	@BeforeEach
	void setUp() throws Exception {
		testBasket = new Basket();
		testBook1 = new Book();
		testBook2 = new Book();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(0, testBasket.getBooksInBasket().size());
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		testBasket.addBook(testBook1);
		assertEquals(1, testBasket.getBooksInBasket().size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
		testBasket.addBook(testBook1);
		testBasket.addBook(testBook2);
		assertEquals(2, testBasket.getBooksInBasket().size());
	}

}
