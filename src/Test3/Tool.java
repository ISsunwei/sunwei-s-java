package Test3;

/*
 * 2、自定义一个工具类，有一个public static int parseInt(String str)静态方法，
 * 能够将字符串转换为数值并返回，如果在转换过程中发现非数字字符，则抛出自定义异常对象。
 */
public class Tool {

	public static int parseInt(String str) throws MyExceptionTest{
		    int result = 0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch>='0'&&ch<='9') {
					result=result*10+ch-'0';
				}else
					throw new MyExceptionTest("错误异常");
			}
			return result;
	}
}
