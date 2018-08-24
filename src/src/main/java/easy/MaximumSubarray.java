package src.main.java.easy;

import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		int startIndex=0;
		int endIndex = nums.length-1;
		int sum=0;
		if(nums.length == 1) {
			return nums[0];
		}
		int mid = (startIndex+endIndex)/2;
		int maxLeftSum = 0;
		int maxRightSum = 0;
		if(mid !=0) {
			int b1[] = Arrays.copyOfRange(nums, startIndex, mid);
			int b2[] = Arrays.copyOfRange(nums, mid+1, endIndex);
			maxLeftSum = maxSubArray(b1);
			maxRightSum = maxSubArray(b2);
		}
		
		

		int leftSum = 0, rightSum = 0;
		
		for(int i=mid; i>=startIndex; i--) {
			sum = sum+ nums[i];
			if(sum>leftSum) {
				leftSum = sum;
			}
		}
		
		sum = 0;
        for (int i = mid + 1; i <= endIndex; i++) {
            sum = sum+nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
		int total = leftSum+rightSum;
		if(maxLeftSum > maxRightSum) {
			return Math.max(maxLeftSum, total);
		}else {
			return Math.max(rightSum, total);
		}
	}

}
