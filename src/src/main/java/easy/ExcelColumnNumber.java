package src.main.java.easy;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		excelNameToNumber("A");
		excelNameToNumber("AB");
		excelNameToNumber("ZY");
	}
	
	private static int excelNameToNumber(String excelName) {
		int length = excelName.length()-1;
		int result = 0;
		for(int i=0; i<excelName.length(); i++) {
			char ch = excelName.charAt(i);
			result = result+(int)Math.pow(26, length)*(ch-'A'+1);
			length--;
		}
		return result;
	}

}
