import java.util.Scanner;
public class SimpleRecursion {
	
	public SimpleRecursion() {
		//decrement(5);
		//praiseMe();
		//stars(25);
		//botherUser();
		//myChoice("Gargun");
	}
	
	public void decrement(int i) {
		int onetimecount = 0;
		if(onetimecount == 0)
			i = Integer.MAX_VALUE;
		i--;
		onetimecount++;
		decrement(i);
	}
	public void praiseMe() {
		System.out.println("You are just so magnaminonious(?)");
		praiseMe();
	}
	public void stars(int starCount) {
		int count = 0;
		if(count == 0)
			starCount = 0;
		for(int i = 0; i < starCount; i++)
			System.out.print("*");
		System.out.println();
		starCount++;
		count++;
		stars(starCount);
	}
	public void myChoice(String n) {
		String original = "Hob";
		String newOne = "";
		double random = n.length() % 3;
		if(random == 0)
			newOne += original.substring(0, 1) + n + original.substring(1, 3);
		if(random == 1)
			newOne += original.substring(0, 2) + n + original.substring(2, 3);
		if(random == 2)
			newOne += original + n;
		System.out.println(newOne);
	}
	public void botherUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bush is a " + sc.nextLine());
		botherUser();
	}
	public static void main(String[] args) {
		SimpleRecursion recur = new SimpleRecursion();
	}
}

