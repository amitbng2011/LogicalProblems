package src.main.java.easy;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2147483647 is true expected false
		int number = 10;
		System.out.println(powerOfTwo(number));
	}
	
	private static boolean powerOfTwo(int n) {
		 if (n == 0)
	            return false;
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	}
}
