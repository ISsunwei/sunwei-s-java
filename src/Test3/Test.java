package Test3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = input.nextLine();
		try{
            System.out.println(Tool.parseInt(s));
        }catch (MyExceptionTest str){
            System.out.println();
        }
	}
}
