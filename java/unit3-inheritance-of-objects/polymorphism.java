public class DogClient {
	public static Dog bargle = new Dog();
	public static Dog bergie = new Bulldog();
	public static Dog borgie = new Poodle();
	public static void main(String[] args) {
		Poodle darg = new Poodle("Darg", 10);
		Poodle dirg = new Poodle("Dirg", 100);
		Poodle dorg = new Poodle("Dorg", 10000);
		
		System.out.println(darg);
		System.out.println(dirg);
		System.out.println(dorg);
		
		borgie.bark();
		bargle.bark();
		bergie.bark();
		
		borgie.defend();
		bergie.defend();

		// System.out.println(bargle.toString());
		// System.out.println(bergie.toString());
		// System.out.println(borgie.toString());
	}

}

