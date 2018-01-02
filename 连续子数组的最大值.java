package 剑指offer;

public class 连续子数组的最大值 {
	public int FindGreatestSumOfSubArray(int [] array){
		int res =array[0];//计算当前所有子数组的和的最大值
		int max = array[0];//包含array[i]的连续数组最大值
		for(int i=0;i<array.length;i++){
			max = Math.max(max+array[i], array[i]);
			res = Math.max(max, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
