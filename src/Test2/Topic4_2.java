package Test2;

import java.util.Scanner;

//将一个字符串中所有的ip地址打印出来
public class Topic4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入IP地址字符串：");
		String str = input.nextLine();
		if(str.matches("\\d{1,3}\\.\\d{3}\\.\\d{1,3}")) {
			System.out.println(str);
		}
		else
			System.out.println("错误IP地址");
	}
}
