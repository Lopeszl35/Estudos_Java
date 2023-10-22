package orderItem;

public class Product {
	
	private String name;
	private Double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	
	public double getPrice() {
		return price;
	}
}
