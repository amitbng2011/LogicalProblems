package src.main.java.easy;

public class ExcelColumnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findColumnName(3243243);
	}
	
	private static void findColumnName(int columnNumber){
		
		StringBuilder sb = new StringBuilder();
		while(columnNumber>0) {
			
			int remainder = columnNumber%26;
			
			if(remainder==0) {
				sb.append('Z');
				columnNumber = columnNumber/26-1;
			}else {
				sb.append((char)(remainder-1+'A'));
				columnNumber = columnNumber/26;
			}
			
		}
		System.out.println(sb.reverse().toString());
	}

}
