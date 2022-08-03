//package proj10.mailorder;

import java.util.ArrayList;
/**
 * Create order objects that contain item arrayList, customer, ordernum, custNum
 */
public class Order {

    private final ArrayList<OrderItem> items = new ArrayList<OrderItem>();//arrayList
    //of items that will be tied to the orderNum

    private final int orderNumber;//unique order number
    private final Customer customer;//unique customer number
    private Address shippingAddress = new Address("", "", "", 0);//address to ship to
    private static int ordersCreated = 0;//counter for amount of orders
/**
 * Constructor for order objects
 * @param customer specific customer object to be linked to order
 * @param shippingAddress address for orders to be shipped to
 */

    public Order(Customer customer, Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        this.customer = customer;
        this.orderNumber = ordersCreated;
        ordersCreated++;
    }
/**
 * Add items to item arrayList
 * @param item OrderItem object to be added into item array
 */
    public void addItem(OrderItem item) {
        items.add(item);
    }
/**
 * Getter for address
 * @return address to be shipped to
 */
    public Address getAddress() {
        return shippingAddress;
    }
/**
 * toString to return formatted orders and total order cost
 * @return formatted String containing order information
 */
    @Override
    public String toString() {
        double totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            totalCost += items.get(i).getCost();
        }

        String allItems = "";
        for (int i = 0; i < items.size(); i++) {
            allItems += items.get(i);
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Order Number: " + this.orderNumber)
                .append("\nPurchased by:\n" + customer)
                .append("\nShipped to:\n" + shippingAddress)
                .append("\nItems Ordered:\n" + allItems);

        stringBuilder.append(String.format("%-30s  $%7.2f",
                "Order Total:   ", totalCost));

        return stringBuilder.toString();
    }
}
