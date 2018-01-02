package 剑指offer;

import java.util.Stack;

public class 含min函数的栈 {
/*
 * 利用一个辅助栈来存放最小值
 */
	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	public void push(int node){
		dataStack.push(node);
		if(minStack.isEmpty()||node<minStack.peek()){
			minStack.push(node);
		}else{
			minStack.push(minStack.peek());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
