package src.main.java.easy;

/**
 * Find the element that appears once in an array where every other element appears twice
 * @author amit
 *
 */
public class FindElementWithOnlyOneOccurance {

	public static void main(String[] args) {
		int[] arr = {7,5,7,8,8,1,2,1,2,4,3,4,3};
		System.out.println(findOccurance(arr));
	}
	
	private static int findOccurance(int[] arr) {
		int number=0;
		for(int i =0; i<arr.length; i++) {
			number = number^arr[i];
		}
		return number;
		
	}
}
