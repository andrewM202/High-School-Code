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
}
public class Bulldog extends Dog {
	public void defend() {
		System.out.println("Barks at intruder");
	}
}
public class Poodle extends Dog {
	public void defend() {
		System.out.println("Runs up to the intruder and wags its tail");
	}
}

