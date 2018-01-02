package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class 从尾到头打印链表 {
/*
 * 递归版本	
 */
	class ListNode{
		int val;
		ListNode next=null;
		public ListNode(int val){
			this.val=val;
		}
	}
	public List<Integer> list = new ArrayList<Integer>();
	public List<Integer> printListFromTailToHead(ListNode listNode){
		if(listNode!=null){
			this.printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
