public abstract class Dog {
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
}

