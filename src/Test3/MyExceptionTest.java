package Test3;

/*
 * 1、自定义异常类，用来描述数字格式异常。
 */
public class MyExceptionTest extends NumberFormatException {

	public MyExceptionTest() {
		super();
	}
	public MyExceptionTest(String message) {
		super(message);
	}
	
}
