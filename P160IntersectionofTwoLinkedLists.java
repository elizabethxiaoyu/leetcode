class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class P160IntersectionofTwoLinkedLists {

	public static void main(String[] args) {

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if(headA == headB)
	            return headA;
		if(headA == null || headB ==null ||(headA.next == null && headB.next == null))
			return null;
		if(headA.next == headB  )
			return headB;
		if(headB.next ==  headA)
			return headA;
		int lengthA = 0;
		int lengthB = 0;
		ListNode headAA= headA;
		ListNode headBB = headB;
		
		while(headAA != null){
			lengthA+= 1;
			headAA = headAA.next;
			
		}
		while(headBB != null){
			lengthB+=1;
			headBB = headBB.next;
		}
		headAA= headA;
		headBB = headB;
		
		int len = Math.abs(lengthA - lengthB);
		if(lengthA > lengthB){
			for(int i = 0 ;i< len;i++)
				headAA = headAA.next;
		}else{
			for(int i = 0 ;i< len;i++)
				headBB = headBB.next;
		}
		
		
		while(headAA != null && headBB != null){
			if(headAA == headBB )
				return headAA;
			headAA = headAA.next;
			headBB = headBB .next;
		}
		return null;
	}
}
