package src.main.java.easy;

public class PwerOfFour {

	public static void main(String[] args) {
		System.out.println(powerOfFour(1));
	}

	private static boolean powerOfFour(int n) {
		if(n ==0) return false;
		while(n!=1) {
			if(n%4 != 0) 
				return false;
			n = n/4;
		}
		return true;
	}
}