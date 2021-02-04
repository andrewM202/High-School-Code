public class myList {
	
	private String[] arrList = new String[5];
	public boolean add(String word) {
		String[] temp = new String[arrList.length + 1];
		for(int i = 0; i < arrList.length; i++) 
			temp[i] = arrList[i];
		temp[temp.length - 1] = word;
		return temp[temp.length - 1] == word;
			
	}
	public void remove(int loc) {
		String[] secTemp = new String[arrList.length];
		for(int i = 0; i < loc; i ++) {
			secTemp[i] = arrList[i];
		}
		for(int j = loc; j < secTemp.length; j ++) {
			secTemp[j] = arrList[j + 1];
		}
		secTemp[secTemp.length - 1] = null;
		for(int k = 0; k < arrList.length; k ++) 
			arrList[k] = secTemp[k];
	}
	public int size() {
		return arrList.length;
	}
	public String get(int loc) {
		if(loc > arrList.length - 1) 
			return null;
		if(loc < 0)
			return null;
		else {
			return arrList[loc];
		}
	}
	public void add(int loc, String word) {
		String[] tempThrice = new String[arrList.length + 1];
		
		for(int i = 0; i < loc; i ++)
			tempThrice[i] = arrList[i];
		for(int j = arrList.length - 1; j > loc; j --)
			tempThrice[j + 1] = arrList[j];
		tempThrice[loc] = word;
	}
	public void set(int x, String word) {
		arrList[x] = word;
	}
	
	
}

