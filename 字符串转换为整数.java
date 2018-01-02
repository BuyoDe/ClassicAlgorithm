package 剑指offer;

public class 字符串转换为整数 {
	public int StrToInt(String str){
		if(str.equals("")||str.length()==0)
			return 0;
		char[] a = str.toCharArray();
		int fuhao = 0;
		if(a[0] =='-')
			fuhao = 1;
		int sum = 0;
		for(int i=fuhao;i<a.length;i++){
			if(a[i]=='+')
				continue;
			if(a[i]<48||a[i]>57)
				return 0;
			sum = sum *10 + a[i] -48;
		}
		return fuhao == 0?sum:sum*-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
