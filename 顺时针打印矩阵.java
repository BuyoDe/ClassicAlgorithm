package 剑指offer;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
	public ArrayList<Integer> printMarix(int [][] matrix){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int y1=0,y2=matrix[0].length-1,x1=0,x2=matrix.length-1;
		while(true){
			for(int i=y1;i<=y2;i++)
				list.add(matrix[x1][i]);
			x1++;
			if(x1>x2)break;
			for(int i=x1;i<=x2;i++)
				list.add(matrix[i][y2]);
			y2--;
			if(y1>y2)break;
			for(int i=y2;i>=y1;i--){
				list.add(matrix[x2][i]);
			x2--;
			if(x1>x2)break;
			for(int j=x2;j>=x1;j--){
				list.add(matrix[j][y1]);
			}
			y1++;
			if(y1>y2)break;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
