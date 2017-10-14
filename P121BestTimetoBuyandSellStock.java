import java.util.Arrays;

public class P121BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int prices[] = { 7 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		if (prices.length == 2) {
			int count = 0;
			if ((count = prices[1] - prices[0]) > 0)
				return count;
			else
				return 0;
		}
		int[] result = new int[prices.length];
		result[0] = 0;
		for (int i = 1; i < prices.length; i++) {
			result[i] = Math.max(prices[i] - prices[i - 1], prices[i] - prices[i - 1] + result[i - 1]);
		}
		Arrays.sort(result);
		if (result[result.length - 1] < 0)
			return 0;
		else
			return (result[result.length - 1]);
	}
}
