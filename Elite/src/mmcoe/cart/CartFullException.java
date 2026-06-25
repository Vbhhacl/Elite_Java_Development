package mmcoe.cart;

public class CartFullException extends Exception {
	public CartFullException() {		
	}

	public CartFullException(String message) {
		super(message);
	}
}