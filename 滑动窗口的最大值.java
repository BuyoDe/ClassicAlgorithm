package 剑指offer;

import java.util.ArrayList;

public class 滑动窗口的最大值 {
	public ArrayList<Integer> maxInWindows(int [] num,int size){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(num==null||num.length<size||size<=0)return list;
		int index = 0;
		index = findMax(num,size,0);
		list.add(num[index]);
		for(int i=size;i<num.length;i++){
			if(index<=i-size){
				index = findMax(num,size,index+1);
			}
			if(num[index]<num[i])index = i;
			list.add(num[index]);
		}
		return list;
	}
	public int findMax(int [] num,int size,int begin){
		int index = begin;
		for(int i=begin+1;i<begin+size;i++){
			if(num[index]<num[i]){
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 