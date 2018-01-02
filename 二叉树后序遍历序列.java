package 剑指offer;

public class 二叉树后序遍历序列 {
	public boolean ju(int [] a,int star,int root){
		if(star>=root)return true;
		int i=root;
		while(i>star&&a[i-1]>a[root])
			i--;
		for(int j=star;j<i-1;j++)
			if(a[j]>a[root])
				return false;
		return ju(a,star,i-1)&&ju(a,i,root-1);
		}
	public boolean VerifySquenceOFBST(int [] sequence){
		if(sequence.length==0)
			return false;
		if(sequence.length==1)
			return true;
		return ju(sequence,0,sequence.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
