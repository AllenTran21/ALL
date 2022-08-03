//package proj10.mailorder;

import java.util.Scanner;
import java.util.ArrayList;

public class Proj10MailOrder
{
        
	public static final String menu = "----------------------------------\n"
			+ "1 - Add a Customer\n"
			+ "2 - Print all Customers\n"
			+ "3 - Create an Order\n"
			+ "4 - Print all Orders\n"
			+ "5 - Print all Orders Shipped to a Zipcode\n"
			+ "6 - Quit\n"
			+ "----------------------------------\n"
			+ "Please make a selection.";
	//Get an integer and validate it between size parameters
	public static int promptForInteger(Scanner input, String message, 
			int min, int max)
	{
		System.out.println(message);
		int value = Integer.parseInt(input.nextLine());
		
		while (value < min || max < value)
		{
			System.out.println(message);
			value = Integer.parseInt(input.nextLine());
		}
		
		return value;
	}
	//Get a double and validate with size parameters
	public static double promptForDouble(Scanner input, String message, 
			double min, double max)
	{
		System.out.println(message);
		double value = Double.parseDouble(input.nextLine());
		
		while (value < min || max < value)
		{
			System.out.println(message);
			value = Double.parseDouble(input.nextLine());
		}
		
		return value;
	}
	//Get a String from user along with printing prompt message
	public static String promptForString(Scanner input, String message)
	{
		System.out.println(message);
		String value = input.nextLine();
		
		while (value.length() == 0)
		{
			System.out.println(message);
			value = input.nextLine();
		}
		
		return value;
	}
	//Get address then city, state, zip together and return both separately
	public static Address promptForAddress(Scanner input)
	{
		System.out.println("Please enter the street address.");
		String streetAddress = input.nextLine();
		
		System.out.println("Please enter the city, state, and zip.");
		String cityStateZip = input.nextLine();
		
		return Address.parse(streetAddress, cityStateZip);
	}
	//Add a customer to the ArrayList, name and address
	public static void addCustomer(Scanner input, 
			ArrayList<Customer> customers)
	{
		String fullName = promptForString(input, 
				"Please enter the customer's full name.");

		Address address = promptForAddress(input);
		customers.add(new Customer(fullName, address));
	}
	//Searches for customers by unique customer number
	public static Customer findCustomerByNumber(
			ArrayList<Customer> customers, int number)
	{
//            for(int i = 0; i < customers.size(); i++){
//                if (customers.Customer.getCustomerNbr() == number){
//                    return null;
//                }
//            }
		return null;
	}
	//Creates an order to place under customers order number
	public static void createOrder(Scanner input, 
			ArrayList<Customer> customers, ArrayList<Order> orders)
	{

		int customerNbr = promptForInteger(input, 
				"Please enter the customer's number for the order.",
				0, Customer.getNbrOfCustomers() - 1);
		
		    orders.add(new Order(customers.get(customerNbr), 
                                promptForAddress(input)));
                    
		String response;
		do
		{
			String itemName = promptForString(input, 
					"Please enter the name of the item.");
			double itemPrice = promptForDouble(input,
					"Please enter the price of the " + itemName,
					0, Double.MAX_VALUE);
                        
                        OrderItem orderItems = new OrderItem(itemName, itemPrice);
                        orders.get(orders.size()-1).addItem(orderItems);
                        
			response = promptForString(input,
					"Would you like to enter another item? (y/n)");
		} while (response.equals("y") || response.equals("Y"));

	}
	
	public static void printAllCustomers(ArrayList<Customer> customers)
	{
		for(Customer customer : customers)
		{
			System.out.println("************************");
			System.out.println(customer);
                        
		}
	}
	
	public static void printAllOrders(ArrayList<Order> orders)
	{
		for(Order order : orders)
		{
			System.out.println("************************");
			System.out.println(order);
		}	
	}
	//Finds a zip and prints all order with matching zips
	public static void printOrdersInZip(Scanner input, ArrayList<Order> orders)
	{
		int zip = promptForInteger(input, "Please enter the shipping zip code.", 
				1000, 99999);
                for(int j = 0; j < orders.size(); j++){
                    if(orders.get(j).getAddress().getZip() == zip){
		//for(Order order : orders)
		//{

				System.out.println("************************");
				System.out.println(orders.get(j));

		//}
            }
        }
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Order> orders = new ArrayList<Order>();
//		OrderItem orderItem = new OrderItem("Lettuce", 4.19);
//                System.out.println(orderItem.toString());
                int customerCount = 0;
		int response;
		do
		{
			response = promptForInteger(input, menu, 1, 6);
			
			switch(response)
			{
				case 1:
					addCustomer(input, customers);
                                        customerCount++;
					break;
				case 2:
					printAllCustomers(customers);
					break;
				case 3:
					createOrder(input, customers, orders);
					break;
				case 4:
					printAllOrders(orders);
					break;
				case 5:
					printOrdersInZip(input, orders);
					break;
				case 6:
					System.out.println("Thank you, goodbye!");
					break;
			}
		} while (response != 6);
	}	
}
