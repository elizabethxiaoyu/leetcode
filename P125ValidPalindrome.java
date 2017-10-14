
public class P125ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String s) {
		if(s.length() == 0)
			return true;
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i< s.length();i++){
			if(Character.isDigit(s.charAt(i)))
					sb1.append(s.charAt(i));
			else if(Character.isLetter(s.charAt(i)))
				sb1.append(Character.toLowerCase(s.charAt(i)));		
		}
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.length()-1);
		System.out.println(sb1.toString());
		for(int j = sb1.length()-1 ;j>=0; j--)
			sb2.append(sb1.charAt(j));
		if(sb2.toString().equals(sb1.toString()))
			return true;
		else
			return false;
	}
}
