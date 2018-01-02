package 剑指offer;

import java.util.Arrays;
import java.util.Comparator;

public class 把数组排成最小的数 {
/*
 * 解题思路：
 * 先将整数数组转换成String数组，然后将String数组排序，最后将排序好的字符串数组拼接
 * 排序规则如下：
 * 若ab>ba 则a>b,
 * 若ab < ba,则a<b,
 * 若ab = ba，则a=b；
 */
	public String PrintMinNumber(int [] numbers){
		if(numbers == null||numbers.length == 0)return "";
		int len = numbers.length;
		String [] str = new String[len];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++){
			str[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				String c1 = arg0+arg1;
				String c2 = arg1+arg0;
				return c1.compareTo(c2);
			}
		});
		for(int i=0;i<len;i++){
			sb.append(str[i]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
