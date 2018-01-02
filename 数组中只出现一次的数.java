package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class 数组中只出现一次的数 {
	public void FindNumsAppearOnce(int [] array,int num1[],int num2[]){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++){
			if(!list.contains(array[i]))
				list.add(array[i]);
			else
				list.remove(new Integer(array[i]));
		}
		if(list.size()>1){
			num1[0] = list.get(0);
			num2[0] = list.get(1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
