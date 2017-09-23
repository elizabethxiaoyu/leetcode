
public class P38CountandSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(9));
	}

	public static String countAndSay(int n) {
		if (n == 1)
			return String.valueOf(1);
		String start = "1";
		StringBuilder result = new StringBuilder();
		int first = 0;
		for (int i = 1; i < n; i++) {
			result.setLength(0);
			for (int j = 0; j < start.length(); j++) {
				first = Integer.parseInt(start.substring(j, j + 1), 10);
				int count = 0;
				while (j < start.length() && Integer.parseInt(start.substring(j, j + 1), 10) == first) {
					count++;
					j++;
				}
				result.append(String.valueOf(count));
				result.append(String.valueOf(first));
				j--;
			}
			start = result.toString();

		}
		return result.toString();
	}
}
