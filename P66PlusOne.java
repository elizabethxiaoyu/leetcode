
public class P66PlusOne {

	public static void main(String[] args) {
		int[] digits = {9};
		
		for(int i :plusOne(digits))
			System.out.print( i + " ");
	}

	public static int[] plusOne(int[] digits) {
		boolean goahead = false;
		if (digits[digits.length - 1] < 9)
			digits[digits.length - 1] += 1;
		else {
			if( digits.length ==1){
				int[] result = {1,0};
				return result;
			}
			goahead = true;
			digits[digits.length - 1] = 0;
		}
		for (int i = digits.length - 2; i >= 0; i--) {
			if (goahead) {
				if (digits[i] < 9) {
					digits[i] += 1;
					goahead = false;
				} else {
					digits[i] = 0;
					goahead = true;
					if (i == 0) {
						int[] result = new int[digits.length + 1];
						result[0] = 1;
						for (int j = 1; j < result.length; j++) {
							result[j] = digits[j - 1];
						}
						return result;
					}

				}

			} else
				break;
		}
		return digits;
	}
}
