package 剑指offer;

public class 链表中环的入口结点 {
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null||pHead.next==null||pHead.next.next==null)return null;
		ListNode fast = pHead.next.next;
		ListNode slow = pHead.next;
		while(fast!=null){
			if(fast.next!=null&&fast.next.next!=null){
				fast = fast.next.next;
				slow = slow.next;
			}else{
				return null;
			}
		}
		fast = pHead;
		while(fast!=slow){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
