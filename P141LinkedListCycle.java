
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class P141LinkedListCycle {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		System.out.println(hasCycle(l1));
	}

	public static boolean hasCycle(ListNode head) {
		if(head == null)
			return false;

		ListNode first = head;
		ListNode second = head;

		while (second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
			if (first == second)
				break;
		}
			if (second == null || second.next == null)
				return false;
			else
				return true;
	}
}
