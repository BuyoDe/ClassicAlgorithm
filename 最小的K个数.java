package 剑指offer;

import java.util.ArrayList;

public class 最小的K个数 {
	public int Partition(int[] input,int k,int low,int high){
		int pivotkey = input[k-1];
		swap(input,k-1,low);
		while(low<high){
			while(low<high&&input[high]>=pivotkey)
				high--;
			swap(input,low,high);
			while(low<high&&input[low]<=pivotkey)
				low++;
			swap(input,low,high);
		}
		return low;
	}
	public void swap(int[] input,int low,int high){
		int temp = input[high];
		input[high] = input[low];
		input[low] = temp;
	}
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
		ArrayList<Integer> aList = new ArrayList<>();
		if(input.length == 0|| k>input.length||k<=0)return aList;
		int low = 0;
		int high = input.length-1;
		int index = Partition(input,k,low,high);
		while(index !=k-1){
			if(index>k-1){
				high = index -1;
				index = Partition(input,k,low,high);
			}else{
				low = index+1;
				index = Partition(input,k,low,high);
			}
		}
		for(int i=0;i<k;i++){
			aList.add(input[i]);
		}
		return aList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
