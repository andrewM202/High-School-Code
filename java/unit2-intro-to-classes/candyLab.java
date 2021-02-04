public class Candylab {
	
	private String name;
	private String size;
	private double cost;
	public boolean s_bogo;

	private Candylab() {			//default
		name = ("Skittles");
		size = ("King");
		cost = 1.49;
	}
	public String changeName(String n) {
		name = n;
		return n;
	}
	public String changeSize(String s) {
		size = s;
		return s;
	}
	public double changeCost(double c) {
		cost = c;
		return c;
	}
	public String toString() {
		return "The " + size + " size " + name + " costs " + cost;
	}
	
	public static void main(String[] args) {
		Candylab c1 = new Candylab();
		
		System.out.println(c1.toString());
	}
	public boolean bogo() {
		if(s_bogo == true) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
}

