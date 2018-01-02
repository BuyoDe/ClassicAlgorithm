package 剑指offer;

public class 判断平衡二叉树 {
	public boolean isBalanced=true;
	public int getDepth(TreeNode root){
		if(root==null)return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(Math.abs(left-right)>1)
			this.isBalanced=false;
		return Math.max(left, right)+1;
	}
	public boolean IsBalanced_Solution(TreeNode root){
		getDepth(root);
		return isBalanced;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
