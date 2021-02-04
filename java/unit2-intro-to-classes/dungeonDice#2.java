public class DungeonDice {

	private int highRoller;
	
	public DungeonDice() {
		highRoller = 6;
	}
	public DungeonDice(int x) {
		highRoller = x;
	}
	public int roll() {
		int roll = (int)((highRoller) * Math.random() + 0);
			return roll;
	}
	int rollAmt;
	public int roll(int rollAmt) {
		return rollAmt;
	}
	boolean negative;
	public int roll(boolean negative) {
		if(negative == true) {
			return (int)((highRoller - -highRoller + 1) * Math.random() - highRoller);
		}
		else {
			return (int)((highRoller + 1) * Math.random() - 0);
		}
	}
	public void changeHighRoller(int x) {
		if(roll() > 2) {
			highRoller = roll();
		}
	}
	
}

public class DungeonDiceDriver {
	public static void main(String [] args) {
		DungeonDice d1 = new DungeonDice();
		
		for(int x = 0; x < 5; x++) {
			System.out.println(d1.roll());
		}
		DungeonDice d2 = new DungeonDice(10);
			System.out.println(d2.roll(10));
			
			
		DungeonDice d3 = new DungeonDice(12);
			System.out.println(d3.roll(true));
			
			
		
		
	}
}

