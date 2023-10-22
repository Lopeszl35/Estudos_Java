package order2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import orderItem.OrderItem;
import orderStatus2.OrderStatus2;

public class Orderr {
	private LocalDateTime moment;
	private OrderStatus2 status;
	private List<OrderItem> items = new ArrayList<>();
	
	public Orderr() {
		
	}
	
	public Orderr(LocalDateTime moment, OrderStatus2 status, List<OrderItem> items) {
		this.moment = moment;
		this.status = status;
		this.items = items;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public OrderStatus2 getStatus() {
		return status;
	}
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	

	public double getTotal() {
		double total = 0;
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}
	
	public List<OrderItem> getItems() {
	    return items;
	}

	
	
}
