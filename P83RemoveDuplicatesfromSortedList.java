
public class P83RemoveDuplicatesfromSortedList {

	// Definition for singly-linked list.
	 class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		public ListNode(int val, ListNode next) {
			super();
			this.val = val;
			this.next = next;
		}
		
	}

	public static void main(String[] args) {
		P83RemoveDuplicatesfromSortedList p = new P83RemoveDuplicatesfromSortedList();
		ListNode node5 = p.new ListNode(1,null);
		ListNode node4 = p.new ListNode(1,node5);
		ListNode node3 = p.new ListNode(1,node4);
		ListNode node2 = p.new ListNode(1,node3);
		ListNode node1 = p.new ListNode(1,node2);
		ListNode cur = deleteDuplicates(node1);
		while(cur != null){
			System.out.print(cur.val + "  ");
			cur = cur.next;
		}
		
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head ==null)
			return null;
		if (head.next == null)
			return head;
		ListNode before = head;
		ListNode current = head.next;
		while (current != null) {
			if (current.val == before.val) {
				before.next = current.next;
			}
			else
				before = current;
			current = current.next;

		}
		return head;

	}
}
