
public class P167TwoSumIIInputarrayissorted {

	public static void main(String[] args) {
		int[] nums = { 3,24,50,79,88,150,345 };
		int[] res = twoSum(nums, 200);
		for (int i : res)
			System.out.println(i);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int index = binarySearch(target - numbers[i], numbers, i+1, numbers.length - 1);
			if (index != -1) {
				result[0] = i+1;
				result[1] = index+1;
				return result;
			}
		
		}
		return null;
	}

	public static int binarySearch(int target, int[] nums, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid])
				return binarySearch(target, nums, low, mid);
			else
				return binarySearch(target, nums, mid + 1, high);
		} else {
			if(nums[low] == target)
				return low;
			else
				return -1;
		}

	}
}
