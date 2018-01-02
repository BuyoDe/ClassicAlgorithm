package 剑指offer;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {
	public void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,
			TreeNode root,int target){
		path.add(root.val);
		if(root.left==null&&root.right==null){
			if(target==root.val){
				paths.add(path);
			}
			return;
		}
		ArrayList<Integer> path2 = new ArrayList<>();
		path2.addAll(path);
		if(root.left!=null)find(paths,path,root.left,target-root.val);
		if(root.right!=null)find(paths,path2,root.right,target-root.val);
	}
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
		if(root==null)return paths;
		find(paths,new ArrayList<Integer>(),root,target);
		return paths;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
