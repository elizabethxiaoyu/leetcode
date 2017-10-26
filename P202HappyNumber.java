import java.util.HashSet;

public class P202HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static  boolean isHappy(int n) {
		HashSet <Integer> hashSet = new HashSet<Integer>();
		int sum = 0;
		while(hashSet.add(n)){
			sum = 0;
			while(n >0){
				int num = n % 10;
				sum += Math.pow(num, 2);
				n /= 10;
			}
			if(sum ==1)
				return true;
			else
				n = sum;
		}
		return false;
	}
}
