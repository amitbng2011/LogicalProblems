package src.main.java.easy;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println(addIntegers(x, y));
	}
	
	private static int addIntegers(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return addIntegers(x^y, (x&y)<<1);
		}
	}
}
