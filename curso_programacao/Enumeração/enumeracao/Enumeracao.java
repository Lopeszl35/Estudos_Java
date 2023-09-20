package enumeracao;

import java.util.Date;

import enumOrder.OrderStatus;
import order.Order;

public class Enumeracao {

	public static void main(String[] args) {
		/*Enumerações:
		 * È um tipo especial que serve para especeficar de forma literal
		 * um conjunto de constantes relacionadas
		*/
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
