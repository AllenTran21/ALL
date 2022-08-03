//package proj10.mailorder;
/**
 * Customer class handling customer names, addresses, and customer number
 * @author Allen
 */
public class Customer {

    private final String fullName; //Customer full name
    private Address address = new Address("", "", "", 0);   //customer address object
    private final int customerNumber; //customer number to be given
    private static int customersCreated;    //counter for customers created
/**
 * Customer constructor
 * @param fullName customer name
 * @param address customer address
 */
    public Customer(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
        this.customerNumber = customersCreated;
        customersCreated++;
    }
/**
 * getter for customerNumber
 * @return customerNumber given to specific customer
 */
    public int getCustomerNbr() {
        return this.customerNumber;
    }
/**
 * Setter for customer address
 * @param address input address
 */
    public void setAddress(Address address) {
        this.address = address;
    }
/**
 * toString method to return formatted name for Display
 * @return formatted String
 */
    @Override
    public String toString() {
        String firstName = fullName.substring(0, fullName.indexOf(' '));
        String middleName = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String lastName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());

//        String streetAddress;
//        String city;
//        String state;
//        int zip;
//customers without middle name
        if ("middleName".length() == 0) {
            return String.format(
                    "Customer Nbr: %d\n%s, %s\nBilling Address:\n%s",
                    getCustomerNbr(), lastName, firstName,
                    address);
//customers with middle name
        } else {
            return String.format(
                    "Customer Nbr: %d\n%s, %s%s\nBilling Address:\n%s",
                    getCustomerNbr(), lastName, firstName, middleName,
                    address);

        }
    }
/**
 * Getter for number of customers
 * @return customers that have been created
 */
    public static int getNbrOfCustomers() {
        return customersCreated;
    }
}
