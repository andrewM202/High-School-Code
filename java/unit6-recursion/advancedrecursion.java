public class AdvancedRecursion {
	public void Wilenacci(int x, int y, int cap) {
		if(x >= cap)
			return;
		if(x < 2) {
			System.out.println(1);
			System.out.println(2);
			Wilenacci(2, 4, cap);
		}
		int nextNumber = x * y;
		System.out.println(x);
		Wilenacci(y, nextNumber, cap);
	}
public static void main(String[] args) {
		AdvancedRecursion recursion = new AdvancedRecursion();
		recursion.Wilenacci(1, 2, 10000);
	}
}

