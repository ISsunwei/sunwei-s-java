package Test2;

import java.util.Scanner;

//��һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������
public class Topic4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str = input.nextLine();
	    System.out.println( str.replaceAll("(\\D+)"," "));
	}
}
