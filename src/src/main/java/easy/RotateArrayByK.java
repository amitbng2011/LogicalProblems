package src.main.java.easy;

public class RotateArrayByK {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		
		for(int i=0; i<=k;i++) {
			rotateArray(nums, k);
		}
		
		printArray(nums);
	}
	private static void rotateArray(int[] nums, int k) {
		int key = nums[0];
		int j;
		for(j=0; j<nums.length-1; j++) {
			nums[j] = nums[j+1];
		}
		nums[j]=key;
	}
	
	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
