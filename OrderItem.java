//package proj10.mailorder;
/**
 * To create OrderItem objects that have a name and price
 */
public class OrderItem {

    private final String description; //name of item
    private final double cost;  //price of item

    /**
     * OrderItem Constructor
     *
     * @param description item Name
     * @param cost item Price
     */
    public OrderItem(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    /**
     * Getter for cost
     *
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return description;
    }
/**
 * Override default toString method
 * @return formatted String of item List
 */
    @Override
    public String toString() {
        return String.format("%-30s  $%7.2f\n", description, cost);
    }
}
