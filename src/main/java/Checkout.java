import java.util.*;
public class Checkout {
	public Checkout() {
		
	}
	
	public double calculatePrice (Basket basket){
		double sum = 0;
		for(int i = 0; i < basket.getBooksInBasket().size(); i++) {
			sum += basket.getBook(i).getPrice();
		}
		/*
		 * Discounts:
		 * Every 3 books: +1% discount
		 * If >=10 books: +10% discount (once)
		 * 10 books: 13% discount
		 * 12 books: 14% discount
		 * 21 books: 17% discount
		 */
		sum -= sum * this.calculateDiscount(basket);
		return sum;
	}
	
	public double calculateDiscount(Basket basket) {
		double discount = 0;
		double threes;
		int threes_int;
		threes = basket.getBooksInBasket().size() / 3.0;
		threes_int = (int)threes;
		discount += (double)threes_int / 100;
		if (basket.getBooksInBasket().size() >=10)
			discount += 0.1;
		return discount;
	}
}
