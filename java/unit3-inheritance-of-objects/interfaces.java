public interface WalkingAnimals {

	public void sleep();
	public void walk();
}

public class DairyCattle implements WalkingAnimals {
	
	private String cattleName;
	
	public DairyCattle(String name) {
		cattleName = name;
	}
	public String toString() {
		return cattleName + " is a dairy cattle.";
	}
	public void walk() {
		if(Math.random() < 0.5) {
			System.out.println("The Dairy Cattle shall walk");
		}
	}
	public void sleep() {
		if(Math.random() < 0.2) {
			System.out.println("The Dairy Cattle is sleepwalking!");
		}
		else {
			System.out.println("The Dairy Cattle is just sleeping.");
		}
	}

public abstract class Dog implements WalkingAnimals {
	private String name;
	
	public Dog() {
		name = "Dog";
	}
	public Dog(String n) {
		name = n;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public abstract void defend();
	
	public abstract void bark();
	
	public abstract void eat();
	
	public String toString() {
		return getName() + "it is a gargino";
	}
	public void walk() {
		if(Math.random() < 0.5) {
			System.out.println("The Doggy shall walk");
		}
	}
	public void sleep() {
		if(Math.random() < 0.2) {
			System.out.println("The Doggy is sleepwalking!");
		}
		else {
			System.out.println("The Doggy is just sleeping.");
		}
	}
}

public class DogClient {

	public static void main(String[] args) {
		Poodle darg = new Poodle("Darg", 10);
		Poodle dirg = new Poodle("Dirg", 100);
		Poodle dorg = new Poodle("Dorg", 10000);
		
		DairyCattle cow1 = new DairyCattle("Daisy");
		System.out.println(cow1.toString());
		cow1.walk();
		cow1.sleep();
		
		Dog bergie = new Bulldog();
		Dog borgie = new Poodle();
		bergie.walk();
		bergie.sleep();
		borgie.walk();
		borgie.sleep();
		
		
		/*
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
		
		*/
		
		
	}

}

