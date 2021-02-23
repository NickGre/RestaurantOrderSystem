/*
 * 	Restaurant ordering system made to practice Java.
 * 	Thursday, February 11, 2021
 * 	Nick Gregoris
 */
import java.util.Scanner;

public class RestaurantOrderSystem {	
	public static void main(String[] args) {
		System.out.println("Welcome to an unnamed restaurant.");
		mainMenu();
		
	}
	
	public static void mainMenu() {
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		Order order = new Order();
		
		System.out.println("Please select from one of the following options:");
		System.out.println("1 - View menu \n2 - Order \n3 - Edit Order \n4 - Cancel");
		String userSelection = scan.next();
		
		//allows user to view menu, place an order, edit their order, or close the program
		switch(userSelection) {
		case "1":
			menu.printMenu();
			order.placeOrder();
			break;
		case "2":
			order.placeOrder();
			break;
		case "3":
			order.editOrder();
			break;
		case "4":
			System.out.println("Goodbye.");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid selection.");
			mainMenu();
			break;
		}
	}
}

/*
	Implementation checklist:
	X	Menu with prices
	-	Order system
	X	Pricing total
	X	Print receipt
	X	Main menu	
*/