package 剑指offer;

public class 删除链表中的重复结点 {
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead == null||pHead.next==null)return pHead;
		ListNode temp = new ListNode(-1);
		temp.next = pHead;
		ListNode curNode = pHead;
		ListNode pre = temp;
		while(curNode!=null&&curNode.next!=null){
			ListNode next = curNode.next;
			if(curNode.val==next.val){
				while(next!=null&&curNode.val==next.val){
					next = next.next;
				}
				pre.next = next;
				curNode = next;
			}else{
				pre = curNode;
				curNode = curNode.next;
			}
		}
		return temp.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
