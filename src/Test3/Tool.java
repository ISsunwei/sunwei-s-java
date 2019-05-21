package Test3;

public class Tool {

	public static  int parseInt(String str) throws MyExceptionTest{
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch>='0'&&ch<='9') {
					System.out.println(ch);
				}else
					throw new MyExceptionTest("´íÎóÒì³£");
			}
			return ch;
	}
}
