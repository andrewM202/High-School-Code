Poodle[] poodle = new Poodle[25];
		String alphabet = "abcdefghijklmnopqrstuvwxy";
		for(int i = 0; i < 25; i ++) {
			poodle[i] = new Poodle(alphabet.substring(i, i +1));
		}
		Dog[][] seatingchart = new Dog[5][5];
		int count = 0;
		for(int i = 0; i < seatingchart.length; i++) {
			for(int j = 0; j < seatingchart[i].length; j++) {
				seatingchart[i][j] = poodle[count];
				count++;
			}
		}
		// actual 5.9 stuff
		for(Poodle g: poodle) {
			System.out.println(g); 
		}
		for(int i = 0; i < seatingchart.length; i = i + 2) {
			for(int j = 0; j < seatingchart[i].length; j++) {
				seatingchart[i][j].defend();
			}
                                 
		for(int i = 1; i < seatingchart.length; i = i + 2) {
			for(int j = 0; j < seatingchart[i].length; j++) {
				seatingchart[i][j].bark();
			}
		}
		for(int i = 0; i < seatingchart.length; i++) {
			for(int j = 0; j < seatingchart[i].length; j++) {
				if(j == i)
					seatingchart[i][j] = new Bulldog("newBull", "new");
				seatingchart[i][j].toString();
			}
		}
		System.out.println(seatingchart[3][3]);
		String[] holder = new String[seatingchart.length];
		for(int i = 0; i < seatingchart.length; i++) {
			for(int j = 0; j < 1; j ++) {
				holder[i] += seatingchart[i][j];
				if(seatingchart[i][j].toString() == "newBullit is a gargino") {
					seatingchart[i][j].toString();
				}	
			}
		}
