package src.main.java.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "jd iowhdw : ' & ";
		System.out.println(reverseString(str));
	}
	
	private static String reverseString(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}
}
