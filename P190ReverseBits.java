
public class P190ReverseBits {

	public static void main(String[] args) {
		System.out.println(reverseBits(1));
	}

	public static  int reverseBits(int n) {
		if(n == 0)
			return 0;
		int result = 0;
		for(int i = 0 ; i< 32 ;i++){
			result <<= 1;
			if((n & 1) == 1)
				result+= 1;
			n >>= 1;
		}
		return result;
		
	}
}
	