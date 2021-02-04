public class MergeSort {
	public static String[] tempStrings = new String[] {
			"Charles", "shirley", "gargantuam", "pinacolada", "pinya", "plate", "Desk", "computer",
			"bottle", "napkin", "Zipper", "trash", "pouch", "sword", "Desk", "Robe", "container",
			"wrap", "Lamp", "Laser"
			};
	
	//first is 0, n is length of array
	public static void mergesort(String[] data, int first, int n) {
		int n1; //Size of first half of array
		int n2; //Size of second half of array
		if(n > 1) /*If the array has values */ {
			n1 = n/2; //1st split is half
			n2 = n-n1; //The rest not included in 1st split
			mergesort(data, first, n1);
			mergesort(data, first+n1, n2);
			merge(data, first, n1, n2);
		}
	}
	public static void merge(String[] data, int first, int n1, int n2) {
		String[] temp = new String[n1 + n2];
		int copied = 0; //number of elements copied from data to temp
		int copied1 = 0; //number copied from 1st split
		int copied2 = 0; //number copied from 2nd split (the rest)
		int i;
		while((copied < n1) && (copied2 < n2)) {
			if(data[first + copied1].compareTo(data[first + n1 + copied2]) > 0)
				temp[copied++] = data[first + (copied++)];
			else
				temp[copied++] = data[first + n1 + (copied2++)];
		}
		while(copied < n1)
			temp[copied++] = data[first + (copied1++)];
		while(copied < n2)
			temp[copied++] = data[first + n1 + (copied2++)];
		for(i=0; i < n1+n2; i++)
			data[first + i] = temp[i];
	}
	public static void main(String[] args) {
		mergesort(tempStrings, 0, tempStrings.length);
		for(int p = 0; p < tempStrings.length; p++)
			System.out.println(tempStrings[p]);
	}

