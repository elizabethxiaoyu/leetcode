
public class P58LengthofLastWord {

	public static void main(String[] args) {
		String s = "  ";
		System.out.println(lengthOfLastWord(s));
	}

	public static  int lengthOfLastWord(String s) {
		int count = 0;
		int i = s.length() -1;
		while(i>=0 &&Character.isWhitespace(s.charAt(i)))
			i--;
		for(;i>=0;i--){
			if(Character.isWhitespace(s.charAt(i)))
				return count;
			count++;
			
		}
		return count;
	}
}
