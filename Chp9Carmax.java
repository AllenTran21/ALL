//package chp9.addresses;


import java.util.Scanner;

/**
 * Managed a Carmax-like inventory system
 */
public class Chp9Carmax {

    /**
     * Displays the entire inventory to the console
     */
    public static void printInventory(Vehicle vehicles[]) {
        for (int i = 0; i < vehicles.length; ++i) {
            System.out.println(vehicles[i]);	// DO NOT CHANGE THIS LINE!
        }
    }

    /**
     * Asks the user to populate the inventory
     */
    public static Vehicle[] loadInventory(Scanner input) {
        // Create the vehicle inventory
        System.out.println("How many vehicles in the inventory?");
        int nbrVehicles = Integer.parseInt(input.nextLine());

        // TODO: create an array of Vehicles here with space for nbrVehicles number
        // of vehicles
        Vehicle[] vehicles = new Vehicle[nbrVehicles];

        // Grab the data for each vehicle
        // NOTE: instead of using nbrVehicles as the loop constraint,
        // I use the actual size of the array - this prevents 
        for (int i = 0; i < vehicles.length; ++i) {
            System.out.println("Please enter vehicle (make model year msrp "
                    + "color salePrice)");
            String make = input.next();
            String model = input.next();
            int year = Integer.parseInt(input.next());
            double msrp = Double.parseDouble(input.next());
            String color = input.next();
            double sale = Double.parseDouble(input.next());
            input.nextLine();

            // TODO: Create a Vehicle here, passing all of the above data
            // to its constructor
            // Add the vehicle to the array in the ith location
            vehicles[i] = new Vehicle(make, model, year, msrp, color, sale);
        }

        return vehicles;
    }

    /**
     * Asks the user what sale they would like to start
     */
    public static void startSale(Scanner input, Vehicle vehicles[]) {
        System.out.println("What percent off of msrp would you like for "
                + "the sale (ex: .25 is 25%)?");
        double salePercent = Double.parseDouble(input.nextLine());

        for (int i = 0; i < vehicles.length; ++i) {
            // TODO: Update the ith vehicle's price assuming that the
            // sale price is calculated from the MSRP and the above
            // salePercent.
            double salePrice = (vehicles[i].getMSRP() * (salePercent * 1000.0)) / 1000.0;
            vehicles[i].changePrice(vehicles[i].getMSRP() - salePrice);
            // Note: if the salePercent is .25, that is 25% OFF of the
            // MSRP value
        }
    }

    /**
     * Repaints all the cars of a certain color to a new color
     */
    public static void repaintInventory(Scanner input, Vehicle vehicles[]) {
        System.out.println("Which color vehicles would you like to repaint?");
        String color = input.nextLine();
        System.out.println("Which color do you want to paint them?");
        String newColor = input.nextLine();

        for (int i = 0; i < vehicles.length; ++i) {
            // TODO: If the ith vehicle's color is equal to the color indicated
            // update it to the newColor.
            if (vehicles[i].getColor().equals(color)) {
                vehicles[i].changeColor(newColor);
            }
        }
    }

    /**
     * Manages the entire vehicle inventory, repaints vehicles and initiates
     * sales.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the inventory from the user and display
        // TODO: Store the referece to the array that is returned by loadInventory
        /* TODO: something here */
        Vehicle[] inventory = loadInventory(input);
        printInventory(inventory);

        // Repaint all the vehicles of a certain color
        repaintInventory(input, inventory);
        printInventory(inventory);

        // Start a new sale
        startSale(input, inventory);
        printInventory(inventory);
    }
}
