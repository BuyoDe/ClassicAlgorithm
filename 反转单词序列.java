package 剑指offer;

public class 反转单词序列 {
	public String ReverseSentence(String str){
		if(str==null||str.length()==0||str.trim().length()==0)
			return str;
		StringBuffer sb = new StringBuffer();
		String[] s = str.trim().split(" ");
		for(int i=s.length-1;i>=0;i--){
			if(s[i]!="")
				sb.append(s[i]);
			if(i-1>=0)
				sb.append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
