package 剑指offer;

public class 斐波那契数列 {
/*
 * 使用循环
 */
	public int Fibonacci(int n){
		int preNum = 1;
		int prepreNum = 0;
		int result = 0;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		for(int i=2;i<=n;i++){
			result = preNum+prepreNum;
			prepreNum = preNum;
			preNum = result;
		}
		return result;
	}
}
