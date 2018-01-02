package 剑指offer;

public class 第一个只出现一次的字符 {
/*
 * 散列的思想
 */
	public int FirstNotRepeatingChar(String str){
		char[] c=str.toCharArray();
		int[] a = new int['z'+1];
		for(char d:c)
			a[(int) d]++;
		for(int i=0;i<c.length;i++)
			if(a[(int)c[i]]==1)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
