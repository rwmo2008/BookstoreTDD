import java.util.*;
public class Basket {
	private ArrayList<Book> books;
	
	public Basket() {
		books = new ArrayList<Book>();
	}
	
	public ArrayList<Book> getBooksInBasket(){
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBook(int index) {
		return books.get(index);
	}
	
}
