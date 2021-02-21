public class Menu {
	//array containing food options for user
	private String foods[] = {
			"Steak",
			"Soup",
			"Grilled Chicken",
			"Rice",
			"Salmon",
			"Steamed Broccoli",
			"Salad",
			"Cancel",
	};
	
	//array containing prices for food options, matches by array index
	private double prices[] = {
			8.99,	//steak
			3.99,	//soup
			6.99,	//grilled chicken
			2.99,	//rice
			5.99,	//salmon
			1.99,	//steamed broccoli
			7.99,	//salad
	};
	
	//gets foods & prices and prints both lists side by side
	public void printMenu() {
		for(int i = 0; i < foods.length; i++) {
			if(i < prices.length) {
				System.out.println( i + " - "+ foods[i] + " - $" + prices[i]);
			}
			else {
				System.out.println( i + " - "+ foods[i]);
			}
		}
	}
	
	public String[] getFoods() {
		return foods;
	}
	
	public double[] getPrices() {
		return prices;
	}
}
