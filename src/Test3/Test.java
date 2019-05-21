package Test3;
/*
 * 3、最后写一个测试类，调用自定义工具类的parseInt方法，并进行异常捕获处理。
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws MyExceptionTest {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一串字符串");
		String s = input.nextLine();
		try{
            System.out.println(Tool.parseInt(s));
        }catch (MyExceptionTest e){
            System.out.println(e);
        }
	}
}
