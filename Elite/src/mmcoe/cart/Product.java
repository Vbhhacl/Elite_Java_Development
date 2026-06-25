package mmcoe.cart;

public class Product {
	private String name;
	private double price;
	
	//good pracTice to have a default constructor even not in use 
	public Product() {
		
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		
		return "Product [Name=" + name + ", Price="+price +"]"; 
	}
	
	public double getPrice() {
		return price;
	}

}

//name 
//price 