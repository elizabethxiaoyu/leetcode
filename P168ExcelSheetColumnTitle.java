
public class P168ExcelSheetColumnTitle {

	public static void main(String[] args) {
		
	}

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 0 ){
			n--;
			sb.insert(0, (char) ('A' + n%26));
			n/=26;
		}
		return sb.toString();
	}
}
