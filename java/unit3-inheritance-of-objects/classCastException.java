public class DogClient {

	public static void main(String[] args) {
		Poodle darg = new Poodle("Darg", 10);
		Poodle dirg = new Poodle("Dirg", 100);
		Poodle dorg = new Poodle("Dorg", 10000);
		
		Dog bargle = new Dog();
		Dog bergie = new Bulldog();
		Dog borgie = new Poodle();
		
		System.out.println(darg);
		System.out.println(dirg);
		System.out.println(dorg);
		
		((Bulldog)bergie).defend();
		
		((Poodle)borgie).defend();
		((Poodle)borgie).getValue();
		((Poodle)borgie).changeValue(1);
		borgie.eat();
		borgie.bark();
		((Poodle)borgie).getPerformance();
		((Poodle)borgie).changePerformance(true);
		((Poodle)borgie).isPerforming();
		borgie.toString();
		
		((Bulldog)bergie).defend();
		bergie.eat();
		bergie.bark();
		bergie.toString();
		
		
		/* Class cast exceptions below, bergie is my bulldog */
		((Poodle)bergie).getPerformance();
		((Poodle)bergie).changePerformance(true);
		((Poodle)bergie).isPerforming();
		/* Class cast exceptions above */
		
	}

}

