
public class P67AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("100", "110010"));
	}

	public static String addBinary(String a, String b) {
		String a1;
		String a2;
		if (a.length() > b.length()) {
			a1 = a;
			a2 = b;
		} else {
			a1 = b;
			a2 = a;
		}
		StringBuilder sb = new StringBuilder();
		int addition = 0;
		int remain = 0;
		int temp = 0;
		int i = a1.length() - 1;
		int j = a2.length() - 1; //短字符串
		for (; i >= 0 && j >= 0; i--, j--) {
			temp = Integer.parseInt(a1.substring(i, i + 1)) + Integer.parseInt(a2.substring(j, j + 1)) + addition;
			sb.append(temp % 2);
			addition = temp / 2;
		}
		while (addition != 0 && i >= 0) {
			//System.out.println(a1.substring(i, i + 1));
			//System.out.println(addition);
			temp = Integer.parseInt(a1.substring(i, i + 1)) + addition;
			sb.append(temp % 2);
			//System.out.println(addition);
			addition = temp / 2;
			i--;
		}
		if(i<0 && addition !=0)
			sb.append(1);
		while (i >= 0){
			sb.append(a1.charAt(i));
			i--;
		}

		StringBuilder result = new StringBuilder();

		for (int k = sb.length() - 1; k >= 0; k--) {
			result.append(sb.charAt(k));
		}
		return result.toString();
	}
}
