package src.main.java.easy;

public class CountAndSay1 {

	public static void main(String[] args) {
		System.out.println(reverseNumber(213123));
	}
	
	private static int reverseNumber(int n) {
		
		long input = n;
		boolean isNegative = false;
		
		if(n<0) {
			n = 0-n;
			isNegative = true;
		}
		long result = 0;
		while(input>0) {
			result = result*10;
			result = result+input%10;
			input = input/10;
		}
		
		if(result>Integer.MAX_VALUE) return 0;
		return isNegative?((int)(0-result)):(int)result;
	}
}
