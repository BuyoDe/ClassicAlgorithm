package 剑指offer;

import java.util.Stack;

public class 两个栈实现队列 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node){
		stack1.push(node);
	}
	public int pop(){
		if(stack1.isEmpty()&&stack2.isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
