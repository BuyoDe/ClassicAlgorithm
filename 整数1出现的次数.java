package 剑指offer;

public class 整数1出现的次数 {
	public int NumberOf1Between1AndN_Solution(int n){
		int count = 0;
		StringBuffer s = new StringBuffer();
		for(int i=0;i<n+1;i++){
			s.append(i);
		}
		String str = s.toString();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='i')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
