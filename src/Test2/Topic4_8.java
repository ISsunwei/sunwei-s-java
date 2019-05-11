package Test2;

import java.util.Scanner;

//将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
public class Topic4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = input.nextLine();
	    System.out.println( str.replaceAll("(\\D+)"," "));
	}
}
