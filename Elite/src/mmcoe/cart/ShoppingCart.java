package mmcoe.cart;

public class ShoppingCart {
	private Product[] items;
	private double total;
	private int count;
	
	public ShoppingCart() {
		items = new Product[5];
	}
	

	public void addTocart(Product p) throws CartFullException {
		
		if (count < items.length) {
            items[count++] = p;
            total += p.getPrice();
        } 
		else {
            //System.out.println("Cart is full!");
			throw new CartFullException("Cart is Full");
			
        }	
	}
	
	public void checkout() {
		
		System.out.println("Items in cart : ");
		for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }        
        System.out.println("Total Amount: " + total);
    }	
}






