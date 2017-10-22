
public class P171ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
	}

	public static int titleToNumber(String s) {
		int count = 0;
		int sum = 0 ;
		int lengthM = s.length()-1;
		for(int i = lengthM; i>=0; i--){
			count = lengthM -i;
			sum += ((int)(s.charAt(i) - 'A' )+1) * Math.pow(26, count);
			
		}
		return sum;
	}
}
