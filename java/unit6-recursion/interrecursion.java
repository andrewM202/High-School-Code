public class IntermediateRecursion {
	public IntermediateRecursion() {
		//System.out.println(evenSum(24));
		//System.out.println(reverseWord("Barg"));
		//System.out.println(countNine(995));
		System.out.print(replaceWile("abcwiledcwile"));
		//System.out.println(power(2, 5));
		//System.out.println(removeRepetition("aabb"));
		//System.out.println(toTheBack("billybobjoehorn", "b"));
	}
	public int evenSum(int n) {
		if(n == 0) 
			return n;
		if(n % 2 == 0) {
			return n + evenSum(n-1);
		} 
		else {
			return evenSum(n-1);
		}
	}
	public String reverseWord(String s) {
		if(s.length() == 0) {
			return "";
		}
		return s.substring(s.length() - 1, s.length()) + reverseWord(s.substring(0, s.length()-1));
	}
	public int countNine(int n) {
		if(n < 10) {
			if(n == 9)
				return 1;
			else 
				return 0;
		}
		if(n % 10 == 9)
			return 1 + countNine(n / 10);
		else {
			return 0 + countNine(n / 10);
		}
	}
	// abcwiledc
	public String replaceWile(String str) {
		if(str.indexOf("wile") != -1) {
			return replaceWile(str.substring(0, str.indexOf("wile")) + "andrew" + str.substring(str.indexOf("wile") + 4, str.length()));
		}
		return str;
	}
	public int power(int base, int n) {
		if(n <= 0)
			return 1;
		else
			return base * power(base, n - 1);
	}
	// This one took a couple hours, then I realized it was simple
	 public String removeRepetition(String str) {
		if(str.length() == 0 || str.length() == 1)
			return str;
		if(str.substring(0, 1).equals(str.substring(1, 2))) 
			return removeRepetition(str.substring(1));
		return str.substring(0, 1) + removeRepetition(str.substring(1));
		
	}
	public String toTheBack(String str, String s) {
		if(str.length() == 0 || str.length() == 1)
			return str;
		String temp = "";
		if(str.indexOf(s) != -1) {
			while(str.indexOf(s) != -1) {
				temp += s;
				str = str.substring(0, str.indexOf(s)) + str.substring(str.indexOf(s) + 1, str.length());
			}
			return toTheBack(str, temp);
		}
		if(str.indexOf(s.substring(0, 1)) == -1) {
			return str + s;
		}
		return str + s;
	}
	public static void main(String[] args) {
		IntermediateRecursion garg = new IntermediateRecursion();
	}
}

