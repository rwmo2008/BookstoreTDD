import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckoutTest {
	private Basket testBasket;
	private Checkout testCheckout;
	private Book testBook1;
	private Book testBook;
	@BeforeEach
	void setUp() throws Exception {
		testBasket = new Basket();
		testCheckout = new Checkout();
		testBook1 = new Book(1.99);
		testBook = new Book(8.99);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		assertEquals(0.0, testCheckout.calculatePrice(testBasket), 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		testBasket.addBook(testBook1);
		assertEquals(1.99, testCheckout.calculatePrice(testBasket), 0.001);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOf2BooksInBasket_WhenPassedBasketWith2Books() {
		testBasket.addBook(testBook1);
		testBasket.addBook(testBook);
		assertEquals(10.98, testCheckout.calculatePrice(testBasket), 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOf3BooksInBasket_WhenPassedBasketWith3Books() {
		testBasket.addBook(testBook1);
		testBasket.addBook(testBook1);
		testBasket.addBook(testBook1);
		assertEquals(5.91, testCheckout.calculatePrice(testBasket), 0.001);
	}
	
	
}
