package 剑指offer;

public class 对称的二叉树 {
	public boolean isSymmetrical(TreeNode pRoot){
		if(pRoot==null)return true;
		return f(pRoot.left,pRoot.right);
	}
	public boolean f(TreeNode t1,TreeNode t2){
		if(t1==null&&t2==null)return true;
		if(t1!=null&&t2!=null)
			return t1.val==t2.val&&f(t1.left,t2.right)
			&&f(t1.right,t2.left);
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
