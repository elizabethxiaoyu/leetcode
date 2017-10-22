import java.util.Stack;

public class P155MinStack {
	Stack<Integer> s = new Stack();
	int min = Integer.MIN_VALUE;

	public static void main(String[] args) {

	}

	/** initialize your data structure here. */
	public P155MinStack() {
	}

	public void push(int x) {
		if (x <= min) {
			s.push(min);
			min = x;
		}
		this.s.push(x);

	}

	public void pop() {
		if (min == s.pop())
			min = s.pop();
	}

	public int top() {
		return s.peek();
	}

	public int getMin() {
		return min;
	}

}
