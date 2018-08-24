package src.main.java.easy;
/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output: 321
 * @author amit
 *
 */
public class ReverseInteger {

	
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
	private static int reverse(int x) {
		
		long longInput = x;
        boolean isNegtive = false;        
        if(longInput < 0){
        	longInput = 0 - longInput;
            isNegtive = true;
        }

        long result = 0;
        while(longInput != 0){
            result = result*10;
            result = result+longInput % 10;
            longInput = longInput/10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        return isNegtive  ? 0 - ((int)result) : (int)result;
    
	}

}
