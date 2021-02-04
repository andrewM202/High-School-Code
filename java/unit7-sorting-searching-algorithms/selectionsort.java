public class SelectionSort {
	public static String[] tempStrings = new String[] {
	"Charles", "shirley", "gargantuam", "pinacolada", "pinya", "plate", "Desk", "computer",
	"bottle", "napkin", "Zipper", "trash", "pouch", "sword", "Desk", "Robe", "container",
	"wrap", "Lamp", "Laser"
	};
	public void selectionSort(String[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			String min = arr[i];
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[i]) < 0) {
					min = arr[j];
				}
			if(min != arr[i]) {
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
	}
	
	public static void main(String[] args) {
		SelectionSort test = new SelectionSort();
		test.selectionSort(tempStrings);
		for(int p = 0; p < tempStrings.length; p++)
			System.out.println(tempStrings[p]);
	}
 }

