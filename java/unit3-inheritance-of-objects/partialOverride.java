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
	public static void main(String[] args) {
		Bulldog bargie = new Bulldog();
		bargie.eat();
	}
}
public class Poodle extends Dog {
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
		bargie.eat();
	}
}

