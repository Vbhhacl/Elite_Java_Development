package mmcoe.cart;

public class TestShopping {
	public static void main(String[] args) throws CartFullException {
		//ShoppingCart cart = new ShoppingCart();
		ShoppingCartt cart = new ShoppingCartt();
		cart.addToCart(new Product("Marker",25));
		cart.addToCart(new Product("Duster",75));
		
		cart.checkout();
	}
}
