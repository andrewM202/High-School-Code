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

public class Poodle extends Dog {
	
	public int value;
	
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
	}
	public Poodle(String nam) {
		super(nam);
		value = 2000;
	}
	public Poodle(String nam, int valu) {
		super(nam);
		value = valu;
		this.value = getValue();
	}
	public int getValue() {
		return value;
	}
	public void changeValue(int x) {
		value = x;
	}
	public String toString() {
		return super.getName() + " is a gargino";
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

public class DogClient {
	public static Dog bargle = new Poodle();
	public static Dog bergie = new Dog();
	public static Dog borgie = new Bulldog();
	public static void main(String[] args) {
		Poodle darg = new Poodle("Darg", 10);
		Poodle dirg = new Poodle("Dirg", 100);
		Poodle dorg = new Poodle("Dorg", 10000);
		
		System.out.println(darg);
		System.out.println(dirg);
		System.out.println(dorg);
		
		
		// System.out.println(bargle.toString());
		// System.out.println(bergie.toString());
		// System.out.println(borgie.toString());
	}

}

