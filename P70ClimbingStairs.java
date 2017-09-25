
public class P70ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(35));
	}
//动态规划的思想
	//爬到第n层，只有两种情况，由一层爬过来或者由两层爬过来：爬到n-1层然后爬一层到n，另一种是爬到n-2层然后爬两层
	public static int climbStairs(int n) {
		
		if(n ==1 || n== 2)
			return n;
		
		int[] nums = new int[n];
		nums[0]  = 1;
		nums[1] = 2;
		for(int i  = 2; i<n;i++){
			nums[i] = nums[i-1] + nums[i-2];
		}
		
		return nums[n-1];

	}

	public static int combination(int m, int n) {
		if (m < n)
			return 0; // 如果总数小于取出的数，直接返回0
		int k = 1;
		int j = 1;
		// 该种算法约掉了分母的(m-n)!,这样分子相乘的个数就是有n个了
		for (int i = n; i >= 1; i--) {
			k = k * m;
			j = j * n;
			m--;
			n--;
		}
		return k / j;
	}

}
