import java.util.Scanner;
public class ImprovedRecursion {
		
	private static int count = 0;
		public ImprovedRecursion() {
			//decrement(5);
			//praiseMe();
			//stars(25);
			//botherUser();
			//myChoice("GarlandGargie");
			//triangle(5);
			//flippedTriangle(5);
			completeTriangle();
		}
		
		public void decrement(int i) {
			if(count == 150) {
				count = 0;
				return;
			}
			if(count == 0)
				i = Integer.MAX_VALUE;
			i--;
			System.out.println(i + " " + count);
			count++;
			decrement(i);
		}
		public void praiseMe() {
			if(count == 35) {
				count = 0;
				return;
			}
			System.out.println("You are just so magnaminonious(?) " + count);
			count++;
			praiseMe();
		}
		public void stars(int starCount) {
			if(count == 0)
				starCount = 0;
			if(starCount == 22) {
				count = 0;
				return;
			}
			for(int i = 0; i < starCount; i++)
				System.out.print("*");
			System.out.println(" " + count);
			starCount++;
			count++;
			stars(starCount);
		}
		public void myChoice(String n) {
			String original = "HobGoblinHobblitGobblit";
			String newOne = "";
			double random = n.length() % 3;
			if(count == 35) {
				count = 0;
				return;
			}
				
			if(random == 0) {
				newOne += original.substring(0, 13) + n + original.substring(13, 23);
				count++;
			}
			if(random == 1) {
				newOne += original.substring(0, 7) + n + original.substring(7, 23);
				count++;
			}
			if(random == 2) {
				newOne += original + n;
				count++;
			}
			System.out.println(newOne);
		}
		public void botherUser() {
			Scanner sc = new Scanner(System.in);
			String phrase = sc.nextLine();
			if(phrase.indexOf("stop") != -1) {
				System.out.println("It was fun being your little sibling");
			}
			System.out.println(phrase);
			
			botherUser();
		}
		public void triangle(int n) {
			if(count == 0)
				n = 1;
			if(n == 8) {
				count = 0;
				return;
			}
			for(int i = 0; i < n; i++) 
				System.out.print("@");
			count++;
			System.out.println();
			triangle(n + 1);
		}
		public void flippedTriangle(int n) {
			if(count == 0)
				n = 1;
			if(n == 9) {
				count = 0;
				return;
			}
			for(int i = n; i < 8; i++) 
				System.out.print("@");
			count++;
			System.out.println();
			flippedTriangle(n + 1);
		}
		public void completeTriangle(int n) {
			triangle(n);
			flippedTriangle(n);
		}


		public static void main(String[] args) {
			ImprovedRecursion recur = new ImprovedRecursion();
		}
}

