public class CellSimulation {

	public static void main(String[] args) {
		String cellName = "WildD Cells";
		int cellCount = 10;
		int cellAcidTolerance = 13;
		double probOfCellReproduction = .055;
		double probOfCellDeath = .01487;
		double probOfAcidTolerance = .0875;
		
		
		
			for(int days = 0; days < 3000; days++) {
				for(int cell = 0; cell < cellCount; cell++) {
					if(Math.random() <= probOfCellReproduction) {
						cellCount++;
							
					}
					else {
					if(Math.random() <= probOfCellDeath) {
							cellCount--;
					}
					
					}
						
				}
				if (Math.random() <= probOfAcidTolerance) {
					if(cellAcidTolerance >= 90) {
						probOfCellReproduction = .048;
						probOfCellDeath = .0832;
					}
					if (cellCount < 100000 && cellAcidTolerance < 120) {
						cellAcidTolerance++;
					}
					if(cellCount >= 100000 && cellAcidTolerance < 120) {
						cellAcidTolerance = cellAcidTolerance + 2;
						}
						if(cellCount > 300000) {
							cellAcidTolerance = cellAcidTolerance + 2;
						}
					}
					if (cellCount == 0) {
						days = 5000;
					}
				System.out.println("End of Day " + days + " - " + cellName);
				System.out.println("Cell Count: " + cellCount + ", " + "Acid Tolerance: " + cellAcidTolerance +"\n" + "~~~~~~~~~~~");
		}
	}
}

