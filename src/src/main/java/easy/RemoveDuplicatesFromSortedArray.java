package src.main.java.easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] sortedArr = {1};
		
		System.out.println(removeDuplicate(sortedArr));
	}
	
	private static int removeDuplicate(int[] sortedArr) {
		if(sortedArr.length==0) return 0;
		int i=0;
		for(int j=1; j<sortedArr.length; j++) {
			if(sortedArr[j] != sortedArr[i])
				i++;
			sortedArr[i] = sortedArr[j];
		}
		return i+1;
	}
}
