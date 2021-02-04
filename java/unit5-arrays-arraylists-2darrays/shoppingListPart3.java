public class ShoppingList {
	static double[] garflunckle = new double[15];
	static String[] garfunckles_notebook = new String[15];
	double countCost = 0.0;
	public ShoppingList() {
		garfunckles_notebook[0] = "Apple";
		garfunckles_notebook[1] = "Pear";
		garfunckles_notebook[2] = "Citrus";
		garfunckles_notebook[3] = "Dragonfruit";
		garfunckles_notebook[4] = "Grapefruit";
		garfunckles_notebook[5] = "Mandarain";
		garfunckles_notebook[6] = "Lime";
		garfunckles_notebook[7] = "Nectarine";
		garfunckles_notebook[8] = "Apricots";
		garfunckles_notebook[9] = "Peaches";
		garfunckles_notebook[10] = "Orange";
		garfunckles_notebook[11] = "Banana";
		garfunckles_notebook[12] = "Mango";
		garfunckles_notebook[13] = "Strawberry";
		garfunckles_notebook[14] = "Watermelon";
		
		for(int i = 0; i < garflunckle.length; i++) {
			garflunckle[i] = 6.0 * Math.random() + .25;
			System.out.print(garfunckles_notebook[i] + " - ");
			System.out.println(garflunckle[i]); 
			
			if("AEIOUaeiou".indexOf(garfunckles_notebook[i].substring(0, 1)) != -1) {
				System.out.println(garfunckles_notebook[i]);
			}

			countCost += garflunckle[i];
		
			
			for(int j = 0; j < garfunckles_notebook.length; j++) {
				if(garfunckles_notebook[i].equals(garfunckles_notebook[j])) {
					System.out.println("The " + garfunckles_notebook[i] + " is repeated!");
				}
			}
		}
		System.out.println(countCost);
	}
	public static void main(String[] args) {
		new ShoppingList();
	}
 }

