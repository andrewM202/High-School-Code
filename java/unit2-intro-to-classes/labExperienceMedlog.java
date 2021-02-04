public class RandomMedication {
 
    private static String[] medicationList = {"Saed", "Plion", "Tyun", "Rexxon", "Liur", "Nuemol", "Gafter"};
   
    public static String getMedication() {
        int rnd = (int)((medicationList.length) * Math.random());
        return medicationList[rnd];
    }
   
    public static int getDosage() {
        int dosage = (int)((1000 - 100 + 1) * Math.random() + 100);
        dosage = dosage - dosage % 100;
        return dosage;
    }
}

public class Nurse {
	String name;
	int id;
	private static int NURSE_COUNT = (int)(4000 * Math.random() + 1000);
	
	public Nurse(String n, MedicationLog ml) {
		name = n;
		NURSE_COUNT++;
		id = NURSE_COUNT;
	}
	public int getid() {  //Accessor for Nurse's id
		return id;
	}
	public String getname() {   //Accessor for Nurse's name
		return name;
	}
}
public class Patient {
	String name;
	String illness;
	String medicationsInSystem;
	
	public Patient() {
		name = "John / Jane Doe";
		illness = "Unknown";
		medicationsInSystem = name + "'s medication for" + illness;
	}
	public Patient(String n, String ill) {
		name = n;
		illness = ill;
		medicationsInSystem = name + "'s medication for" + illness;
	}
	public String getIllness() {   //Accessor for Patient's illness
		return illness;
	}
	public String getName() {   //Accessor for Patient's name
		return name;
	}
	public String getMedications() {   //Accessor for Patient's medications
		return medicationsInSystem;
	}
	public void updateMedicationsInSystem(String newMed, int milligrams) {   //Mutator for medications, the stuff in parameter is being sent to us
		medicationsInSystem += "\n" + newMed + " " + milligrams + "mg";
	}
}
public class MedicationLog {
	String dailyLogs;
	String nursesInLog;
	
	public MedicationLog() {   // Default (constructor method) in medication log
		dailyLogs = "";
		nursesInLog = "";
	}
	public void addNurse(Nurse n) {
		nursesInLog+="Name: " + n.getname() + " ID Number: " + n.getid() + "\n";
	}
	public String getdailyLogs() {
		return dailyLogs;
	}
	public String getNursesOnDuty() {
		return nursesInLog;
	}
	public void takeMedication(Nurse n, String medication, int milligrams, Patient patientName) {
		dailyLogs += "Nurse: " + n.getname() + "( " + n.getid() + ") gave " + milligrams + "mg of " + medication + " to" + patientName.getName();
	}
}
public class Hospital {
	private MedicationLog ml;
	private Patient p1;
	private Patient p2;
	
	public Hospital() {
		MedicationLog m1 = new MedicationLog();
		Nurse n1 = new Nurse("Goody", ml);
		Nurse n2 = new Nurse("Rebecca", ml);
		Patient p1 = new Patient();
		Patient p2 = new Patient("Anita", "WileDitus");
		
		
		ml.takeMedication(n1, RandomMedication.getMedication(), RandomMedication.getDosage(), p1);
		ml.takeMedication(n1, RandomMedication.getMedication(), RandomMedication.getDosage(), p2);
		ml.takeMedication(n1, RandomMedication.getMedication(), RandomMedication.getDosage(), p1);
		ml.takeMedication(n1, RandomMedication.getMedication(), RandomMedication.getDosage(), p2);

	}

}
public class HospitalDriver {
	public static HospitalDriver h1 = new HospitalDriver();
		
	public static void main(String[] args) {
		System.out.println(h1);
	}
}

