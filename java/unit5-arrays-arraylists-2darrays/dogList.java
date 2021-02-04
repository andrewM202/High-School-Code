public class DogClient {

	public static void main(String[] args) {
		/* Poodle darg = new Poodle("Darg", 10);
		Poodle dirg = new Poodle("Dirg", 100);
		Poodle dorg = new Poodle("Dorg", 10000); */
		
		String[] dogs = new String[50];
		for(int i = 0; i < dogs.length; i++) {
			if(Math.random() >= .49) {
				dogs[i] = "Poodle " + i;
			}
			else {
				dogs[i] = "Bulldog " + i; 
			}
			System.out.println(dogs[i]);
		}
		int poodleCount = 0;
		int bulldogCount = 0;
		for(String x: dogs) {
			if("Poodle".indexOf(x) != -1) {
				poodleCount++;
			}
			else {
				bulldogCount++;
			}
		}
		
		String[] poodle = new String[poodleCount];
		String[] bulldog = new String[bulldogCount];
		
		for(int i = 0; i < dogs.length; i++) {
			if("Poodle".indexOf(dogs[i]) != -1) {
				for(int j = 0; j < poodle.length; j++) {
					poodle[j] = dogs[i];
				}
			}
		}
		for(int i = 0; i < dogs.length; i++) {
			if("Bulldog".indexOf(dogs[i]) != -1) {
				for(int j = 0; j < bulldog.length; j++) {
					bulldog[j] = dogs[i];
				}
			}
			bulldog[i] = null;
		}
		int count = 0;
		for(String x: bulldog) {
			bulldog[count] = " Vader";
			count++;
		}
		int count2 = 0;
		for(String x: poodle) {
			poodle[count2] = "Skywalker";
			count2++;
		}
		
		Dog pooksie = new Poodle("Pooksie");
		Dog borks = new Bulldog("Borks", "Bulldog");
		
		((Poodle)pooksie).defend();
		((Bulldog)borks).defend();
		
		// Adding in one more bulldog challenge
		String[] temp = new String[bulldogCount + 1];
		for(int i = 0; i < bulldog.length; i ++) {
			temp[i] = bulldog[i];
		}
		bulldog = temp;
		
		// Challenge end
		
		/*
				
	}
	This code is in dog class
	public int returnTypes(String[] dog, String t) {
		int count = 0;
		for(int i = 0; i < dog.length; i ++) {
			if(t.indexOf(dog[i]) != -1) 
				count++;
		}
		return count;
	}

}

