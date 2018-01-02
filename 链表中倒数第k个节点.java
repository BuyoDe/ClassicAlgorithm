package 剑指offer;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val=val;
	}
}
public class 链表中倒数第k个节点 {
	public ListNode FindKthToTail(ListNode head,int k){
		ListNode p = head;
		while(k--!=0){
			if(p==null)
				return null;
			p = p.next;
		}
		while(p!=null){
			p=p.next;
			head = head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
