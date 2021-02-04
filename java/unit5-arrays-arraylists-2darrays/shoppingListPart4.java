public class ShoppingList {
	static double[] listD = new double[15];
	static String[] listS = new String[15];
	double countCost = 0.0;
	public ShoppingList() {
		listS[0] = "citrus";
		listS[1] = "pear";
		listS[2] = "bombfruit";
		listS[3] = "dragonfruit";
		listS[4] = "grapefruit";
		listS[5] = "mandarin";
		listS[6] = "lime";
		listS[7] = "nectarine";
		listS[8] = "apricots";
		listS[9] = "peaches";
		listS[10] = "orange";
		listS[11] = "banana";
		listS[12] = "mango";
		listS[13] = "strawberry";
		listS[14] = "watermelon";
		
		
		for(int i = 0; i < listD.length; i++) {
			listD[i] = 6.0 * Math.random() + .25;
			System.out.print(listS[i] + " - ");
			System.out.println(listD[i]); 
			
			if("AEIOUaeiou".indexOf(listS[i].substring(0, 1)) != -1) {
				System.out.println(listS[i]);
			}

			countCost += listD[i];
		
			
			for(int j = 0; j < listS.length; j++) {
				if(j != i)
					if(listS[i].equals(listS[j])) {
					System.out.println("The " + listS[i] + " is repeated!");
				}
			}
		}
		System.out.println(countCost);
	}
	public double getCost(double[] arr) {
		double total = 0.0;
		for(double x:arr) {
			total += x;
		}
		return total;
	}
	public void changeFruit(String[] arr, String o, String n) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(o)) {
				arr[i] = n;
			}
		}
	}
	public void halfOff(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / 2;
		}
	}
	public String[] mergeArrays(String[] arr, double[] arr2) {
		String[] temp = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i] + " for " + arr2[i];
		}
		return temp;
	}
	public void swap(String[] arr, double[] arr2, int x, int y) {
		String temp = arr[x];
		double temp2 = arr2[x];
		arr[x] = arr[y];
		arr2[x] = arr2[y];
		arr[y] = temp;
		arr2[y] = temp2;
	}
	public void alphatize(String[] arr, double[] d) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += " is $" + d[i];
		}
		for(int i = arr.length - 1; i > -1; i--) 
			for(int j = arr.length-1; j > -1; j--) {
				if(arr[i].compareTo(arr[j]) < 0) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
			}
		}
		
	}

	public static void main(String[] args) {
		new ShoppingList();
	    ShoppingList newly = new ShoppingList();
	    
	    newly.alphatize(listS); 
	    for(int i = 0; i < listS.length; i++) {
	    	System.out.println(listS[i]);
	    }
	    
	  } 

		public static void main(String[] args) {
		new ShoppingList();
	    ShoppingList newly = new ShoppingList();
	    
	    newly.alphatize(listS); 
	    for(int i = 0; i < listS.length; i++) {
	    	System.out.println(listS[i]);
	    }
	    
	  }    
}

