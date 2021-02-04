public class ComparisonTeller {

	public static void main(String[] args) {
		
		int x = (int)(6 * Math.random() + 3);
		int y = (int)(23 * Math.random() + -22);
		double z = (2 * Math.random() + 0);
		double g = (1 * Math.random() + 0);
		
		System.out.println("x = " + x + ", " + "y = " + y + ", " + "z = " + z);
		
		if(z < .5) {
			System.out.println("Hello");
		}
		if(x != 2) {
			System.out.println("World");
		}
		if(y > -20) {
			System.out.println("Good");
		}
		if(x >= 5 && y < -12) {
			System.out.println("Night");
		}
		if(x > 8 || y <  1) {
			System.out.println("!");
		}
		if(z > .5 && x+y > 9) {
			System.out.println("?");
		}
		if(g <= .49) {
			System.out.println("it feels okay");
		}
		if(g <= .24) {
			System.out.println("I wonder how correct it all is");
		}

	}
	
	// World always occurs
	// ? never occurs

}

