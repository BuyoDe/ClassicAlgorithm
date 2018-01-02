package 剑指offer;

public class 二维数组查找 {
/*
 * 利用二维数组由上到下，由左到右递增的规律，
 * 选取右上角的元素a[row][col]与target进行比较，
 * 当target小于元素a[row][col]时，那么target必定在元素a所在行的左边，
 * 即col--；
 * 当target大于元素a[row][col]时，那么target必定在元素a所在列的下边，
 * 即row++；
 */
	public boolean find(int [][] array,int target){
		int row = 0;
		int col = array[0].length-1;
		while(row<=array.length-1&&col>=0){
			if(target==array[row][col])
				return true;
			else if(target>array[row][col])
				row++;
			else
				col--;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
