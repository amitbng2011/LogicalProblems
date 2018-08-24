package src.main.java.easy;

public class PowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 27;
		System.out.println(powwrOfThree(number));
	}

	private static boolean powwrOfThree(int number) {

		if(number == 0) {
			return false;
		}

		while(number != 1) {
			if(number%3 != 0) return false;
			number = number/3;
		}
		return true;
	}

}
