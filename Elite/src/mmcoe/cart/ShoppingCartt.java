package mmcoe.cart;

import java.util.LinkedList;

public class ShoppingCartt {

    private LinkedList<Product> items;
    private double total;

    public ShoppingCartt() {
        items = new LinkedList<Product>();
        total = 0;
    }

    public void addToCart(Product p) {

        items.add(p);
        total += p.getPrice();
        
    }

    public void checkout() {

        System.out.println("Items in Cart:");

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("Total Amount: " + total);
    }
}