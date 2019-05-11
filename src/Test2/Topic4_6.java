package Test2;

import java.util.Scanner;

//输入一个字符串，判断该字符串是否以abc结尾
public class Topic4_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = input.nextLine();
		boolean end = str.endsWith("abc");
		System.out.println(end);
	}
}
