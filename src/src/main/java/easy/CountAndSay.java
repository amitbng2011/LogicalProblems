package src.main.java.easy;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countAndSay(10));
	}
	
	private static String countAndSay(int num) {
		
		String result = "1";
		int index = 1;
		
		while(index<num) {
			
			StringBuilder builder = new StringBuilder();
			int count = 1;
			
			for(int j=1; j<result.length();j++) {
				if(result.charAt(j) == result.charAt(j-1)) {
					count++;
				}else {
					builder.append(count);
					builder.append(result.charAt(j-1));
					count=1;
				}
			}
			
			builder.append(count);
			builder.append(result.charAt(result.length()-1));
			result = builder.toString();
			index++;
		}
		return result;
	}

}
