package 剑指offer;

public class 二叉树的深度 {
	public int TreeDepth(TreeNode pRoot){
		if(pRoot==null)
			return 0;
		int left = TreeDepth(pRoot.left);
		int right = TreeDepth(pRoot.right);
		return Math.max(left, right)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
