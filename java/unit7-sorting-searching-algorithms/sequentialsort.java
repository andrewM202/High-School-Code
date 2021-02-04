import java.util.ArrayList;
import java.util.Scanner;
public class SequentialSearch {

	// /Users/997329/Desktop/DS/Dictionary.txt
	
	public static void main(String[] args) {
		DictionarySorts ds = new DictionarySorts();
		ds.get(5);
		SequentialSearch search = new SequentialSearch();
		
		
		ArrayList arr = new ArrayList(ds.size());
		for(int i=0; i<ds.size(); i++)
			arr.add(i, ds.get(i));
		System.out.println(search.search(arr, "apple"));
		System.out.println(search.search(arr, "middle"));
		System.out.println(search.search(arr, "zebra"));
	}
	public int search(ArrayList arr, String s) {
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).equals(s))
				return i;	
		}	
		return -1;
	}
}

