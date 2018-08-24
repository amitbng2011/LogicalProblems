package src.main.java.easy;

public class ReturnIndicesForTarget {
	
	public static void main(String[] args) {
		int[] input = {3,2,4,5,6,7};
		int target = 6;
		int[] result = twoSum(input, target);
		System.out.println("indices are "+ result[0] + " and " + result[1]);
	}
	
	private static int[] twoSum(int[] nums, int target){
		
		if(nums == null) return null;
		for(int i=0; i<nums.length-1; i++) {	
			
			for(int j = i+1; j<nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		
		return null;
	}
}
