package src.main.java.easy;

public class LengthOfLastword {

	public static void main(String[] args) {
		String str = "  my name is dhkjeliwhd       ";
		System.out.println(lengthOfLastWord(str));
	}

	private static int lengthOfLastWord(String s) {
		s = s.trim();
		int length=0;
		if(s.length()==0) {
			return length;
		}
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				length=0;
			}else {
				length++;
			}
		}
		return length;
	}
}
