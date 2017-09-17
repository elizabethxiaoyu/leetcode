
public class P14LongestCommonPrefix {

	public static void main(String[] args) {
		P14LongestCommonPrefix p = new P14LongestCommonPrefix();
		String[] strs = {"aaacc","aaa","aaba"};
		System.out.println(p.longestCommonPrefix(strs));
		String s1 = "acc";
		String s2 = "b";
		
		System.out.println(s1.indexOf(s2));
	}
//边界条件 0或 1个元素，有相同元素  后面比前面的短
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";
		String  result = strs[0];
		int i = 1;
		while(i< strs.length){
			while(strs[i].indexOf(result) != 0){
				result =result.substring(0, result.length()-1);
			}
			i++;
			
		}
		return result;
	}
}
