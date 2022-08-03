//package chp9.addresses;

//package chp9.carmax;

/**
 * Represents a vehicle in a Carmax-like inventory system
 */
public class Vehicle {

    /**
     * Make of the vehicle (ex: Dodge, Nissan, Toyota, Buick, etc.
     */
    private final String make;

    /**
     * Model of the vehicle (ex: Pathfinder, Bronco, Civic, etc.
     */
    private final String model;

    /**
     * Year vehicle was manufactured
     */
    private final int year;

    /**
     * Manufacturer's suggested retail price
     */
    private final double msrp;

    /**
     * Color of the vehicle - can be changed
     */
    private String color;

    /**
     * Current price of the vehicle - can be changed
     */
    private double price;

    /**
     * Constructor accepts initial data for the car in the above order
     */
    // TODO: Implement the Vehicle constructor, include ALL of the above
    // data as parameters
    public Vehicle() {
        make = "";
        model = "";
        year = 0;
        msrp = 0;
        color = "";
        price = 0;

    }

    public Vehicle(String newMake, String newModel, int newYear, double newMSRP, String newColor, double newPrice) {
        make = newMake;
        model = newModel;
        year = newYear;
        msrp = newMSRP;
        color = newColor;
        price = newPrice;
    }

    /**
     * Returns the make of the vehicle
     */
    // TODO: implement getMake
    public String getMake() {
        return make;
    }

    /**
     * Returns the model of the vehicle
     */
    // TODO: implement getModel
    public String getModel() {
        return model;
    }

    /**
     * Returns the color of the vehicle
     */
    // TODO: implement getColor
    public String getColor() {
        return color;
    }

    /**
     * Returns the year of the vehicle
     */
    // TODO: implement getYear
    public int getYear() {
        return year;
    }

    /**
     * Returns the msrp of the vehicle
     */
    // TODO: implement getMSRP
    public double getMSRP() {
        return msrp;
    }

    /**
     * Returns the current price of the vehicle
     */
    // TODO: implement getPrice
    public double getPrice() {
        return price;
    }

    /**
     * Repaints the vehicle to a new color provided as a parameter
     */
    // TODO: implement repaint
    public void changeColor(String newColor) {
        color = newColor;
    }

    /**
     * Changes the current price of the vehicle to the new price provided as a
     * parameter
     */
    // TODO: implement changePrice
    public void changePrice(double newPrice) {
        price = newPrice;
    }

    /**
     * Returns the vehicle's data as a string in the following format: [ make :
     * model : year : msrp : color : price ]
     */
    // TODO: implement toString
    public String toString() {
        
        //String formattedPrice = String.format("%.2f", price);
        //String formattedPrice = Double.toString(((int)(price * 100)) / 100);
        //String returnString = ("[ " + make + " : " + model + " : " + year + " : " + (int)msrp + " : " + color + " : " + formattedPrice + " ]");
        //return returnString;
        return String.format("[ %s : %s : %d : %.0f : %s : %.2f ]",
                make, model, year, msrp, color, price);

    }
}
