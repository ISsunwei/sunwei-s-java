package Test2;

import java.util.Scanner;

//����һ���ַ������жϸ��ַ����Ƿ���abc��β
public class Topic4_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str = input.nextLine();
		boolean end = str.endsWith("abc");
		System.out.println(end);
	}
}
