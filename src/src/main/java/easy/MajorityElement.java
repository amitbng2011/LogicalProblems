package src.main.java.easy;

/**
 * @Desc Mejority element
 * Time Cimplexity - o(n*n)
 * Space Complexity - o(1)
 * @author amit
 *
 */
public class MajorityElement {

	public static void main(String[] args) {

		int[] arr = {3,3};
		System.out.println(majorityElement(arr));
		
	}

	public static int majorityElement(int[] nums) {

		if(nums.length==1) {
			return nums[0];
		}else {
			for(int index = 0; index<nums.length-1; index++) {
				int count=1;
				for(int j=index+1; j<nums.length;j++) {
					if(nums[index] == nums[j]) {
						count++;
					}
				}
				if(count > nums.length/2) {
					return nums[index];
				}
			}
		}
		
		return 0;
	}
}
