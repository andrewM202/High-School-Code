public class MathFormulae {
	public static void main(String[] args) {
		MathFormulae formOne = new MathFormulae();
		
		formOne.numberGuesser(99.4);
	}
	public MathFormulae() {
		System.out.println("Function mathProblem - " + mathProblem(99));
		System.out.println("Function percentError - " + percentError(5,7));
		System.out.println("Function quadratic - " + quadratic(5, 4, 1));
		System.out.println("Function numberGuesser - " + numberGuesser(7.0));
	} 
	public int mathProblem(int x) {
		return Math.abs(-3*(2*x-12))+4;
	}
	public double percentError(int old, int neu) {
		return ((double)neu - old) / old * 100;
	}
	public double quadratic(int a, int b, int c) {
		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (4*a));
	}
	public String numberGuesser(double x) {
		double y = (6 * Math.random() + 2);
		if(x == y) {
			return "Wow... You are just extremely lucky";
		}
		else {
			return "Well, The Odds were not in your favor anyways!";
		}
	}
	
}

