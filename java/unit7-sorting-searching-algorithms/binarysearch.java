import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

	// /Users/997329/Desktop/DS/Dictionary.txt
	
	public static void main(String[] args) {
		DictionarySorts ds = new DictionarySorts();
		ds.get(5);
		BinarySearch search = new BinarySearch();
		
		
		ArrayList arr = new ArrayList(ds.size());
		for(int i=0; i<ds.size(); i++)
			arr.add(i, ds.get(i));
		System.out.println(search.search(arr, "apple", 0, arr.size()/2, arr.size()));
		System.out.println(search.search(arr, "middle", 0, arr.size()/2, arr.size()));
		System.out.println(search.search(arr, "zebra", 0, arr.size()/2, arr.size()));
	}
	
	public int search(ArrayList arr, String key, int start, int mid, int end) {
		String middle = (String)arr.get(mid);
		if(key.compareTo(middle) == 0)
			return mid;
		else if(key.compareTo(middle) > 0) { //if key comes before middle\
			search(arr, key, start, end/2, mid);
		}
		else if(key.compareTo(middle) < 0) { //if key comes after middle
			search(arr, key, mid, (mid+end)/2, end);
		}
		return -1;
	}
}

