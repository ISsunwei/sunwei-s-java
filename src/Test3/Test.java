package Test3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws MyExceptionTest {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»´®×Ö·û´®");
		String s = input.nextLine();
		try{
            System.out.println(Tool.parseInt(s));
        }catch (MyExceptionTest e){
            System.out.println(e);
        }
	}
}
