package src.main.java.easy;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(convertRomanToInteger("IV"));
	}

	private static int convertRomanToInteger(String inputString) {

		int result=0;
		for(int i = 0; i<inputString.length();i++) {

			int current = getValue(inputString.charAt(i));
			
			if(i+1<inputString.length()) {
				int right = getValue(inputString.charAt(i+1));
				
				if(current>=right) {
					result = result+current;
				}else {
					result = result + right-current;
					i++;
				}
			}else {
				result = result + current;
				i++;
			}
		}
		return result;
	}


	private static int getValue(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}
}
