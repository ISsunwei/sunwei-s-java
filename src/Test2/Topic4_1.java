package Test2;

import java.util.Scanner;

//检查一个电话号码是否符合(0000)0000-0000
public class Topic4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入电话号码：");
		String nums = input.nextLine();
		if(nums.matches("\\(\\d{4}\\)\\d{4}-\\d{4}")) {
			System.out.println("正确号码");
		}
		else
			System.out.println("非法号码");
		
	}
}
