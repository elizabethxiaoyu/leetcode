
public class P191Numberof1Bits {

	public static void main(String[] args) {
		System.out.println(hammingWeight(2147483648));
	}

	public static int hammingWeight(int n) {
		int count = 0;	

		while(n != 0 ){
			count+= (n&1);
			n >>>=1;
		}
		return count;
	}
}
