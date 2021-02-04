public class Cryptography {
	String input = " abcdefghijklmnopqrstuvwxyz";
	String output = "";
	public String shiftOne(String s) {
		String temp = "";
		for(int i = 0; i<s.length(); i++) {
			int count = input.indexOf(s.substring(i, i+1)) - 1;
			temp += input.substring(count, count + 1);
		}
		return temp;
	}
	public static void main(String[] args) {
		Cryptography Gargun = new Cryptography();
		System.out.println(Gargun.shiftOne("tpnfujnftadjqifstadboacfacsplfoafbtjmzapodfazpvadboajefoujgzauifauzqfapgadjqifsajuajt"));
	}
}

