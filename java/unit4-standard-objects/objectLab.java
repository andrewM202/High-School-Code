public abstract class Fish {
	public String fishname = "Blake";
	public int fishage = 0;
	public Fish() {
		fishname = "Blake";
		fishage = 0;
	}
	public Fish(String FishyName, int FishyAge) {
		fishname = FishyName;
		fishage = FishyAge;
	}
	public abstract void eat();
	public void swim(String gimmeName) {
		System.out.println(gimmeName + " swam for 10 minutes.");
	}
	public String getFishName() {
		return fishname;
	}
	public int getFishAge() {
		return fishage;
	}
public boolean equals(Object other) {
		return ((Fish)other).getFishAge() == this.getFishAge(); 
	}

}
public class GoldFish extends Fish {
	public void eat() {
		System.out.println(fishname + " is eatig fish food.");
	}
	public GoldFish(String FishyName, int FishyAge) {
		super(FishyName, FishyAge);
	}
	public String toString() {
		return "Goldfish " + fishname + " is " + fishage + " years old.";
	}
}
public class FishBowlClient {
	
	public boolean equals(Object other, Object gother) {
		if(((Fish)other).getFishAge()==((Fish)gother).getFishAge()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Fish Gargie = new GoldFish("Gargie", 15);
		Fish Barg = new GoldFish("Barg", 15);
		Fish BorgLord = new GoldFish("BorgieLord", 15);
		
		System.out.println(BorgLord.equals(Gargie)); // Overridden Equals Prints out True  
		System.out.println(Barg.equals(Gargie)); // Overridden Equals Prints out True
		System.out.println(Gargie.equals(Gargie)); // Overridden Equals Prints out True
		
	/*	BorgLord = Gargie;
		System.out.println(BorgLord.equals(Gargie)); // Non-Overridden Prints out True 
		System.out.println(Barg.equals(Gargie)); // Non-Overridden Prints out false 
		System.out.println(Gargie.equals(Gargie)); // Non-Overridden Prints out True */ 
/*
		System.out.println(BorgLord == Gargie); // Prints out True 
		System.out.println(Barg == Gargie); // Prints out false 
		System.out.println(Gargie == Gargie); // Prints out True 
	*/	
		
		System.out.println(Gargie.toString()); 
		System.out.println(Barg.toString()); 
		
		/* Default toString() prints out 
		 * GoldFish@27c170f0
		 * GoldFish@5451c3a8
		 */
		
		/* New toString() prints out
		 * Goldfish Gargie is 15 years old.
		 * Goldfish Barg is 15 years old.
		 */
 	}
}

