
public class P172FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(25));
	}

	public static int trailingZeroes(int n) {
		int count = 0;
		while(n !=0 ){
			count += n/5;
			n/=5;
		}
			return count;
	}
}
