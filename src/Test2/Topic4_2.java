package Test2;

import java.util.Scanner;

//��һ���ַ��������е�ip��ַ��ӡ����
public class Topic4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������IP��ַ�ַ�����");
		String str = input.nextLine();
		if(str.matches("\\d{1,3}\\.\\d{3}\\.\\d{1,3}")) {
			System.out.println(str);
		}
		else
			System.out.println("����IP��ַ");
	}
}
