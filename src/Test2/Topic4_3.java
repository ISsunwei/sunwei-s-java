package Test2;

import java.util.Scanner;

//将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
public class Topic4_3 {
  
	    public static void main(String[] args)  {
	        Scanner input = new Scanner(System.in);
	        System.out.println("请输入一组字符:");
	        String str = input.next();
	        str = str.replaceAll("([a-z!])\\1+", "$1");
	        System.out.println(str);  
	    }
}
