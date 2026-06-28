package mmcoe.cart;

import mmcoe.cart.Shopping;
import mmcoe.cart.ShoppingCart;

public final class CartFactory {
	private CartFactory() {
	}

	public static Shopping newCart() {
		return new ShoppingCart();
	}
}
