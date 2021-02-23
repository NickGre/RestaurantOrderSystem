import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Order {
	RestaurantOrderSystem ros = new RestaurantOrderSystem();
	Menu menu = new Menu();
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat(".##");
	
	ArrayList <String> foodOrdered = new ArrayList();	//stores foods ordered for receipt
	ArrayList <Double> foodCosts = new ArrayList();		//stores prices of food ordered for totaling
	public String i;									//stores users choice
	private String[] selection = menu.getFoods();		//gets the food list to enable the user to order
	private double[] costs = menu.getPrices();			//gets the price list to enable the bill to be totaled
	
	public void placeOrder() { 
		System.out.println("\nWhat would you like to order?");
		i = scan.next();
		
		try {
			i.toString();	//converts user input to string for validation
		}
		catch(Exception e) {
			System.out.println("Invalid seletion, please order with the numbers presented.");
		}
		
		//adds users choice to foodOrdered and foodCosts
		switch(i) {
		case "0":
			foodOrdered.add(selection[0]);
			foodCosts.add(costs[0]);
			System.out.println(selection[0] + " has been added to your order.\n");
			continueOrder();
			break;
		case "1":
			foodOrdered.add(selection[1]);
			foodCosts.add(costs[1]);
			System.out.println(selection[1] + " has been added to your order.\n");
			continueOrder();
			break;
		case "2":
			foodOrdered.add(selection[2]);
			foodCosts.add(costs[2]);
			System.out.println(selection[2] + " has been added to your order.\n");
			continueOrder();
			break;
		case "3":
			foodOrdered.add(selection[3]);
			foodCosts.add(costs[3]);
			System.out.println(selection[3] + " has been added to your order.\n");
			continueOrder();
			break;
		case "4":
			foodOrdered.add(selection[4]);
			foodCosts.add(costs[4]);
			System.out.println(selection[4] + " has been added to your order.\n");
			continueOrder();
			break;
		case "5":
			foodOrdered.add(selection[5]);
			foodCosts.add(costs[5]);
			System.out.println(selection[5] + " has been added to your order.\n");
			continueOrder();
			break;
		case "6":
			foodOrdered.add(selection[6]);
			foodCosts.add(costs[6]);
			System.out.println(selection[6] + " has been added to your order.\n");
			continueOrder();
			break;
		case "7":
			foodOrdered.add(selection[6]);
			foodCosts.add(costs[6]);
			System.out.println(selection[6] + " has been added to your order.\n");
			continueOrder();
			break;
		case "8":
			System.out.println("Cancelled.");
			ros.mainMenu();
			break;
		default:
			System.out.print("Invalid seletion. Please order with the numbers presented.");
			placeOrder();
			break;
		}
	}
	
	//continues order if user wants to add to order
	private void continueOrder() {	
		System.out.println("Would you like to add to your order? \n1 - Yes \n2 - No");
		i = scan.next();
		
		switch(i) {
		case "1":	//continues order
			placeOrder();
			break;
		case "2":	//finishes order and prints receipt
			printReceipt();
			//ros.mainMenu();	//REMOVE THIS LATER ONLY FOR TESTING **********************************************************
			break;
		default:	//throws error at if user doesn't input 1 or 2
			System.out.println("Invalid selection. Please use 1 for yes or 2 for no.");
			continueOrder();
			break;
		}

	}
	
	//calculates total of foodCosts
	private double total() {	
		double sum = 0;
		for(int i = 0; i < foodCosts.size(); i++) {
			sum += foodCosts.get(i);
		}
		return sum;
	}
	
	//builds and print receipt to console
	private void printReceipt() {
		System.out.println("You ordered:");
		
		//prints lists side by side instead of foodOrdered followed by foodCosts
		for(int i = 0; i < foodOrdered.size(); i++)	 
			System.out.println(foodOrdered.get(i) + " - $" + foodCosts.get(i));
		
		System.out.println("________________________");			//dividing line to make list easier to read
		System.out.println("Total: $" + df.format(total()));		//formats total() to 2 decimal places before printing
		
	}
	
	//getter for addItem and removeItem allowing user to edit order
	public void editOrder() {
		System.out.println("How would you like to change your order? \n1 - Add to order \n2 - Remove from order");
		i = scan.next();
		
		switch(i) {
		case "1":
			addItem();
			break;
		case "2":
			//removeItem();
			System.out.println("Not yet implemented.");
			ros.mainMenu();
			break;
		default:
			System.out.println("Invalid selection.");
			editOrder();
		}
	}
	
	//allows user to add to their order
	private void addItem() {
		menu.printMenu();
		placeOrder();
	}
	
	/*
	//allows user to remove items from their order
	private void removeItem() {

		System.out.println("Your order: ");
		
		for(int y = 0; y < foodOrdered.size(); y++)	 
			System.out.println(foodOrdered.get(y) + " - $" + foodCosts.get(y));
		
		System.out.println("What would you like to remove?");
		i = scan.next();
		
		try {
			Integer.parseInt(i);	//converts user input to string for validation
			System.out.println(foodOrdered.indexOf(i) + " has been removed from your order.");
			foodOrdered.remove(i);
			printReceipt();
		}
		catch(Exception e) {
			System.out.println("Invalid seletion, please order with the numbers presented.");
		}	
	}
	*/
}