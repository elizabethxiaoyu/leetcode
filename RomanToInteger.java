
public class RomanToInteger {

	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		System.out.println(r.romanToInt("MCMXCVI"));
	}

	public int romanToInt(String s) {
		int[] nums = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				nums[i] = 1;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'M':
				nums[i] = 1000;
				break;

			}

		}
		if (nums.length == 1)
			return nums[0];
		int result =nums[nums.length-1];
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1])
				result -= nums[i-1] ;
			else
				result += nums[i-1];
		}
		
		for(int i  : nums)
			System.out.println(i);
		return result;
	}

}
