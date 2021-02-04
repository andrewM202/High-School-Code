public class Hashtags {

	public static void main(String[] args) {
		
		/* Shape #1 Below */
		
		for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 5; c++) {
				System.out.print("#");
			}
			System.out.println();
		}	
		
		/* 
		   #####
		   #####
		   #####
		   #####
		   #####
		   #####
		 */
		
		/* Shape #1 Above */
		
		/* Spacing Below */
		System.out.println();
		System.out.println();
		/* Spacing Above */
		
		/* Shape #2 Below */
	
		int x = 5;
		for(int r = 0; r < 5; r++) {
			for(int c = 4; c < x; c++) {
				System.out.print("#");
			}
			x++;
			System.out.println();
		}
		
		/* 
		   #
		   ##
		   ###
		   ####
		   #####
		 */
		
		/* Shape #2 Above */
		
		
		/* Spacing Below */
		System.out.println();
		System.out.println();
		/* Spacing Above */
		
		
		/* Shape #3 Below */
		
		int q = 5;
		for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 5; c++) {
				if(q % 5 == 0) {
					System.out.print("#");
					q = q + 1;
				}
				else {
					System.out.print(">");
					q = q + 1;
				}
			}
			q = q - 1;
			System.out.println();
		}
		
		/*
		   #>>>>
		   >#>>>
		   >>#>>
		   >>>#>
		   >>>>#
		 */
		
		/* Shape #3 Above */
			
	 }	
}

