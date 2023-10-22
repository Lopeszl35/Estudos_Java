package clientOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import order2.Client;
import order2.Orderr;
import orderItem.OrderItem;
import orderStatus2.OrderStatus2;
import product.Product;

public class ClientOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter client Data");
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        LocalDate aniversario = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean dataValida = false;

        while (!dataValida) {
            System.out.println("Birth Date: (DD/MM/YYYY)");
            String birth = input.nextLine();

            try {
                aniversario = LocalDate.parse(birth, formatter);
                dataValida = true;
            } catch (Exception e) {
                System.out.println("Invalid date format. Use dd/mm/yyyy format");
            }
        }
        Client client = new Client(name, email, aniversario);

        System.out.println("Enter Order Data");
        OrderStatus2 status = null;
        while (status == null) {
            System.out.println("Enter a valid Order Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED):");
            String statusInput = input.nextLine().trim().toUpperCase();

            try {
                status = OrderStatus2.valueOf(statusInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Order Status. Please enter a valid order");
            }
        }

        System.out.println("How many items for this order? ");
        int quantityOrder = input.nextInt();
        input.nextLine();
        LocalDateTime momentOrder = LocalDateTime.now();
        Orderr order = new Orderr(momentOrder, status, new ArrayList<>());

        for (int i = 0; i < quantityOrder; i++) {
            System.out.println("Enter " + (i + 1) + "° item data\n");
            System.out.println("Product name: ");
            String productName = input.nextLine();

            System.out.println("Product price: ");
            double productPrice = input.nextDouble();
            input.nextLine();

            Product product = new Product(productName, productPrice);

            System.out.println("Quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            OrderItem orderItem = new OrderItem(quantity, product);
            order.addItem(orderItem); // Adicione o item ao pedido
        }

        System.out.println("Order Summary:\n" + "Order Moment: " + order.getMoment() + "\nOrder Status: "
                + order.getStatus() + "\nClient: " + client.toString() + "\nOrder items: \n");

        List<OrderItem> items = order.getItems();
        for (OrderItem item : items) {
            System.out.println("Product: " + item.getProduct().getName() + 
            		"\nPrice: " + item.getProduct().getPrice() + 
            		"\nQuantity: " + item.getQuantity() 
                    + "\nSubtotal: " + item.subTotal() + "\n");
            System.out.println();
        }

        System.out.println("Total Order Price: " + order.getTotal());

        input.close();
    }
}
