package 剑指offer;

public class 二叉搜索树的第k个节点 {
	int index = 0;
	TreeNode KthNode(TreeNode root,int k){
		if(root!=null){//中序遍历寻找第K个
			TreeNode node = KthNode(root.left,k);
			if(node!=null)
				return node;
			index++;
			if(index==k)
				return root;
			node = KthNode(root.right,k);
			if(node!=null)
				return node;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
