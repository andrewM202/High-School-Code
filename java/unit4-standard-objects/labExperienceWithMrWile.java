public class Cryptography {
	String input = "abcdefghijklmnopqrstuvwxyz ";
	String output = "";
	public String shiftOne(String s, int shift) {
		String temp = "";
		for(int i = 0; i<s.length(); i++) {
			
			
			int count = input.indexOf(s.substring(i, i+1)) + shift;
			
			while (count >= input.length()) {
				count -= input.length();
			}
			while (count < 0) {
				count += input.length();
			}
			
			//count is within range now
			
			temp += input.substring(count, count + 1);
			
		}
		return temp;
	}
	public static void main(String[] args) {
		Cryptography Gargun = new Cryptography();
		for(int shift = 0; shift > -27; shift--) {
			System.out.println(shift + ": " + Gargun.shiftOne("lmderhvi", shift));
		}
	}
}

