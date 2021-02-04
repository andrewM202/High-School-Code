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
		
	}

}
public class Poodle extends Dog {
	
	public int value;
	private boolean isPerforming;
	
	public void defend() {
		System.out.println("Runs up to the intruder and wags its tail");
	}
	public void bark() {
		System.out.println("Friendly Bark");
	}
	public void eat() {
		System.out.println("The " + getName() + " is eating");
		System.out.println(getName() + " is eating food the intruder gave");
	}
	public static void main(String[] args) {
		Poodle bargie = new Poodle();
	}
	public Poodle() {
		super("Pooksie");
		value = 2000;
		isPerforming = false;
	}
	public Poodle(String nam) {
		super(nam);
		value = 2000;
		isPerforming = false;
	}
	public Poodle(String nam, int valu) {
		super(nam);
		value = valu;
		this.value = getValue();
		isPerforming = false;
	}
	public int getValue() {
		return value;
	}
	public void changeValue(int x) {
		value = x;
	}
	public String toString() {
		return super.getName() + " the poodle is worth " + getValue();
	}
	public boolean getPerformance() {
		return isPerforming;
	}
	public void changePerformance(boolean perform) {
		isPerforming = perform;
	}
	public void isPerforming() {
		if (isPerforming == true) {
			System.out.println("The " + super.getName() + " is performing an act.");
		}
		if (isPerforming == false) {
			System.out.println("The " + super.getName() + " is not performing an act.");
		}
	}
}
public class Bulldog extends Dog {
	
	public void defend() {
		System.out.println("Barks at intruder");
	}
	public void bark() {
		System.out.println("Scary Growl");
	}
	public void eat() {
		System.out.println("The " + getName() + " is eating");
		System.out.println(getName() + " is eating the intruder");
	}
	public String toString() {
		return super.getName() + "it is a gargino";
	}
}
public class Dog {
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
	public void bark() {
		System.out.println("\"Generic Bark\"");
	}
	public void eat() {
		System.out.println("The " + getName() + " is eating");
	}
	public String toString() {
		return getName() + "it is a gargino";
	}
}

