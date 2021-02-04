public class CastAway {

	public static void main(String[] args) {
		int x = 4;
		double d1 = 5.68;
		int y = 8;
		double d2 = 0.4256;
		double d3 = 0.012;
		
		System.out.println("Answers:");
		
		System.out.print("Answers 1: ");
		System.out.println((int)d1 - x + y);
		
		System.out.print("Answers 2: ");
		System.out.println(d1 + d2);
		
		System.out.print("Answers 3: ");
		System.out.println((int)d1 - (int)(d3));
		
		System.out.print("Answers 4: ");
		System.out.println(y - (int)d1 + y - (int)d1);
		
		System.out.print("Answers 5: ");
		System.out.println((int)d1 - x + y + d2);
		
	}

}

