public class GradeRater {

	public static void main(String[] args) {
		int score = (int)((61) * Math.random() + 0);
		int roundScore = (int) ((( (double)100 / 60)) * score);
		
		System.out.println("Score = " + score + ", " + "Percent = " + roundScore + "%");
		
		if(roundScore >= 90 && score <= 100) {
			System.out.println("You got an A");
			
			if(roundScore == 100) {
				System.out.println("Wow you got a perfect!");
			}
			if(roundScore > 95 && roundScore < 100) {
				System.out.println("Wow, you did great!");
			}
		}
		else if(roundScore >= 80 && score < 90) {
			System.out.println("You got a B");
		}
		else if (roundScore >= 70 && score < 80) {
			System.out.println("You got a C");
		}
		else if (roundScore >= 60 && score < 70) {
			System.out.println("You got a D");
		}
		else {
			System.out.println("You got a F");
			
			if(roundScore == 0) {
				System.out.println("Please put some effort in next time!");
			}
		}
		
	}

}

