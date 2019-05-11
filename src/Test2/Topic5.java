package Test2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class Topic5 {

	public static void main(String[] args) {
		
		//从控制台输入一个yyyy-MM-dd（年月日）格式的日期字符串，再将这个日期加上七天，再用FormatStyle.MEDIUM格式输出这个日期
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个日期（格式：yyyy-MM-dd（年月日））：");
		String date = input.next();
		int y = Integer.valueOf(date.substring(0, 4));
        int m = Integer.valueOf(date.substring(5, 7));
        int d = Integer.valueOf(date.substring(8));
	    LocalDate localDate = LocalDate.of(y, m, d);
	    System.out.print("增加7天输出时间为：");
	    System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		//各种格式显示当前时间
	    LocalDateTime ld = LocalDateTime.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Short Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full Date: " + fmt.format(ld));
		
		//使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果
		System.out.println("修改年份：" + ld.plusYears(1));
        System.out.println("修改月份：" + ld.plusMonths(1));
        System.out.println("修改天数：" + ld.plusDays(1));
        System.out.println("修改小时：" + ld.plusHours(1));
		}
}
