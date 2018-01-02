package 剑指offer;

public class 空格替换 {
	public String repalceSpace(StringBuffer str){
		String sti = str.toString();
		char[] strChar = sti.toCharArray();
		StringBuffer stb = new StringBuffer();
		for(int i=0;i<strChar.length;i++){
			if(strChar[i]==' '){
				stb.append("%20");
			}else{
				stb.append(strChar[i]);
			}			
		}
		return stb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
