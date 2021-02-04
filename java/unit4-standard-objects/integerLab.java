public class IntegerLabbo {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);
		int n = iObj.intValue();
		Object obj = new Integer(10);
		
		System.out.println(iObj.toString()); // Prints out 10
		System.out.println(n); // Prints out 10
		
		System.out.println(iObj.equals(obj)); //Prints out true
		// System.out.println(iObj.intValue().equals(obj.intValue())); Error
		// iObj.intValue().equals(n); Error
		
		// iObj == obj; Error
		// iObj.intValue() == n; Error
		// iObj.intValue() == obj.intValue(); Error
		
		// System.out.println(iObj.compareTo(obj)); Error
		System.out.println(iObj.compareTo((Integer)obj)); // Prints out 0
		// System.out.println(obj.compareTo(iObj)); Error
		// System.out.println((Integer)obj.compareTo(iObj));
		// System.out.println((Integer)obj.compareTo(n));
		System.out.println(iObj.compareTo(iObj.intValue())); // Prints out 0
		
	}
}

