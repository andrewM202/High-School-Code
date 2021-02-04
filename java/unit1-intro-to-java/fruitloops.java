public class FruitLoops {

	public static void main(String[] args) {
		
		System.out.println("Banana");
		System.out.println("Banana");
		System.out.println("Banana");
		System.out.println("Banana");
		System.out.println("Banana" + "\n");
		
		// 1A Above //
		
		for(int favFruit = 0; favFruit < 5; favFruit++) {
			System.out.println("Banana");
		}
		// 1B Above // 

		for(int multThree = -1998; multThree <= 2000; multThree = multThree + 3) {
			System.out.print(multThree + " ");
		}
		
		//1C Above //
			{ 
			System.out.print("\n" + "\n");
			
		}
		for(int j = 0; j < 150; j++) {
			int k = (int)((31) * Math.random() - 15);
			
			System.out.print(k + " ");
		}
		// 1D Above //
		
			{
			System.out.print("\n \n");
		}
		
		while(Math.random() > .02) {
			System.out.print("Avocado" + " ");
		}
		// 2 Above //
		
			{
			System.out.print("\n \n");
		}
			double increase = .01;
		while(Math.random() > increase ) {
			increase = increase + .03;
			System.out.print("Avocado" + " ");
		}			
	}	

}

