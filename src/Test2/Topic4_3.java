package Test2;

import java.util.Scanner;

//���ַ������������ֵ��ַ�ѹ����һ��������aaabbbccccd��ѹ������abcd��
public class Topic4_3 {
  
	    public static void main(String[] args)  {
	        Scanner input = new Scanner(System.in);
	        System.out.println("������һ���ַ�:");
	        String str = input.next();
	        str = str.replaceAll("([a-z!])\\1+", "$1");
	        System.out.println(str);  
	    }
}
