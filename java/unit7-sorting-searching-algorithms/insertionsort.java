public void insertionSort(String[] arr) {
		for(int i=1; i<arr.length; i++) {
			String hold = arr[i];
			int j = i-1;
			while((j> -1) && (arr[j].compareTo(hold) > 0)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=hold;
		}
	}
public void reverseInsertionSort(String[] arr) {
		for(int i=1; i<arr.length; i++) {
			String hold = arr[i];
			int j = i-1;
			while((j> -1) && (arr[j].compareTo(hold) < 0)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=hold;
		}
	}

