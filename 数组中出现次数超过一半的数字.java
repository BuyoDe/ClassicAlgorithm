package 剑指offer;

import java.util.HashMap;

public class 数组中出现次数超过一半的数字 {
/*
 * 使用HashMap方法
 */
	public int MoreThanHalfNum_Solution(int []array){
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		for(int i=0;i<array.length;i++){
			Integer temp = hashmap.get(array[i]);
			if(temp==null){
				hashmap.put(array[i], 1);
				temp=1;
			}else{
				hashmap.put(array[i], temp+1);
			}
			if(temp+1>array.length/2)return array[i];
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
