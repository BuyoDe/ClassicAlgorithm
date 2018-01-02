package 剑指offer;

public class 不用加减乘除做加法 {
	public int Add(int num1,int num2){
		while(num2!=0){
			int temp = num1^num2;
			num2 = (num1&num2)<<1;//进位
			num1 = temp;
		}
		return num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
