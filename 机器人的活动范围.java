package 剑指offer;

public class 机器人的活动范围 {
	public int movingCount(int threshold,int rows,int cols){
		int flag[][] = new int[rows][cols];//记录是否已经走过
		return helper(0,0,rows,cols,flag,threshold);
	}
	public int helper(int i,int j,int rows,int cols,int[][] flag,int threshold){
		if(i<0||i>=rows||j<0||j>=cols||numSum(i)+numSum(j)>threshold||flag[i][j]==1)
			return 0;
		flag[i][j] = 1;
		return helper(i-1,j,rows,cols,flag,threshold)
				+helper(i+1,j,rows,cols,flag,threshold)
				+helper(i,j-1,rows,cols,flag,threshold)
				+helper(i,j+1,rows,cols,flag,threshold)
				+1;
	}
	public int numSum(int i){
		int sum = 0;
		do{
			sum+=i%10;
		}while((i=i/10)>10);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
