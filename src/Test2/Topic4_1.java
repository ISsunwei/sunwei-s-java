package Test2;

import java.util.Scanner;

//���һ���绰�����Ƿ����(0000)0000-0000
public class Topic4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������绰���룺");
		String nums = input.nextLine();
		if(nums.matches("\\(\\d{4}\\)\\d{4}-\\d{4}")) {
			System.out.println("��ȷ����");
		}
		else
			System.out.println("�Ƿ�����");
		
	}
}
