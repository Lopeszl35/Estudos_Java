package orderItem;

import product.Product;

public class OrderItem {
	private Integer quantity;
	private double price;
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, Product product2) {
		this.quantity = quantity;
		this.price = product2.getPrice();
		this.product = product2;
	}
	
	
	public double subTotal() {
		double total;
		total = this.quantity * price;
		return total;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public Product getProduct() {
		return product;
	}
}
