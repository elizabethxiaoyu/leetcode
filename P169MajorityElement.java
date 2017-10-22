import java.util.Arrays;

public class P169MajorityElement {

	public static void main(String[] args) {
		int[] nums = {-1,1,1,1,1,2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		//起始元素是0-   n-1/2
		//先排序
		//一个count 记录重复次数 如果> n/2 就停止
		if(nums.length == 1)
			return nums[0];
		Arrays.sort(nums);
		int count = 1;
		for(int i = 1 ; i<= (nums.length-1)/2+1 ; i++){
				if(nums[i] == nums[i-1])
					count++;
				else
					count=1;
				if(count > (nums.length-1)/2)
					return nums[i];
				else {
					if(i == (nums.length -1 ) /2+1)
						return nums[i];
				}
		}
		return 0;
	}
}
