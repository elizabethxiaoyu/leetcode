import java.util.Arrays;

public class P53MaximumSubarray {

	public static void main(String[] args) {
		int nums[] =  {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	public static  int maxSubArray(int[] nums) {
		if(nums.length ==1)
			return nums[0];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 0 ) {
				max = Math.max(max, sum);
				sum = 0;
			
			}else {			
				max = Math.max(max, sum);
			}
		}
		return max;
	}
}
