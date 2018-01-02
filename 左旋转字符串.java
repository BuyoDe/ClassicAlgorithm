package 剑指offer;

public class 左旋转字符串 {
/*
 * 三次反转
 */
	public String LeftRotateString(String str,int n){
		char[] chars = str.toCharArray();
		if(chars.length<n)return "";
		reverse(chars,0,n-1);
		reverse(chars,n,chars.length-1);
		reverse(chars,0,chars.length-1);
		StringBuffer sb = new StringBuffer(chars.length);
		for(char c:chars){
			sb.append(c);
		}
		return sb.toString();
	}
	public void reverse(char [] chars,int low,int high){
		char temp;
		while(low<high){
			temp = chars[low];
			chars[low] = chars[high];
			chars[high] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
