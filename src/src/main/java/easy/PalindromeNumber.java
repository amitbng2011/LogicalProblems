package src.main.java.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindromeNumber(1));
	}
	
	private static boolean isPalindromeNumber(int input){
		
		int temp = input;
		if(input<0)	return false;
		
		long result = 0;
        while(input != 0){
            result = result*10+input % 10;
            input = input/10;
        }
		if(result==temp) return true;
		return false;
	}
}
