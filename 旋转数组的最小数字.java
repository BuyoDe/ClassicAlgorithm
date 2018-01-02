package 剑指offer;

public class 旋转数组的最小数字 {
/*
 * 使用二分法
 */
	public int minNumberInRotateArray(int [] array){
		int low=0;int high = array.length-1;
		while(low<high){
			int mid = low+(high-low)/2;
			if(array[mid]>array[high])
				low = mid+1;
			else if(array[mid]==array[high])
				high = high-1;
			else
				high = mid;
		}
		return array[low];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
