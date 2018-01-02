package 剑指offer;

public class 树的子结构 {
	public boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2){
		if(node2==null)return true;
		if(node1==null)return false;
		if(node1.val!=node2.val)return false;
		return doesTree1HaveTree2(node1.left,node2.left)&&doesTree1HaveTree2(node1.right,node2.right);
	}
	public boolean HasSubTree(TreeNode root1,TreeNode root2){
		boolean result = false;
		if(root2!=null&&root1!=null){
			if(root1.val==root2.val){
				result = this.doesTree1HaveTree2(root1, root2);
			}
			if(!result){
				result = this.HasSubTree(root1.left, root2);
			}
			if(!result){
				result = this.HasSubTree(root1.right, root2);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
