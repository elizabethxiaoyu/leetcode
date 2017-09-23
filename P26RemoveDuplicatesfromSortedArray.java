
public class P26RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1,1,1,1};
		int len = removeDuplicates(nums);
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + "  ");
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;

		int index = 0;
		int count = 0;
		int sum = 0;
		for (int i = index + 1; i < nums.length - sum; i++) {
			if (nums[i] != nums[index]) {
				for (int j = index + 1; j < nums.length - count; j++) {
					nums[j] = nums[j + count];
				}
				index++;
				i = index;
				sum += count;
				count = 0;
			} else {
				count++;
				if(i == nums.length-sum -1)
					sum+=count;
				
			}
		}
		return nums.length - sum;
	}
}
