import java.util.Stack;


//险些在两处没有考虑栈为空的情况，这也对应了左右括号数目不匹配的情况
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
		if(s.length() ==0)
			return true;
		if(s.length() == 1)
			return false;
		Stack<Character> stack = new Stack<Character>();
		char top;
		for(char c : s.toCharArray()){
			
			switch(c){
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if(stack.isEmpty())
					return false;
				top = stack.pop();
				if(top !='(')
					return false;
				break;
			case']':
				if(stack.isEmpty())
					return false;
				top = stack.pop();
				if(top !='[')
					return false;
				break;
			case'}':
				if(stack.isEmpty())
					return false;
				top = stack.pop();
				if(top !='{')
					return false;
				break;
			
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
		
	}
}
