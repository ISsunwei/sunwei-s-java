package Test2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class Topic5 {

	public static void main(String[] args) {
		
		//�ӿ���̨����һ��yyyy-MM-dd�������գ���ʽ�������ַ������ٽ�������ڼ������죬����FormatStyle.MEDIUM��ʽ����������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����ڣ���ʽ��yyyy-MM-dd�������գ�����");
		String date = input.next();
		int y = Integer.valueOf(date.substring(0, 4));
        int m = Integer.valueOf(date.substring(5, 7));
        int d = Integer.valueOf(date.substring(8));
	    LocalDate localDate = LocalDate.of(y, m, d);
	    System.out.print("����7�����ʱ��Ϊ��");
	    System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		//���ָ�ʽ��ʾ��ǰʱ��
	    LocalDateTime ld = LocalDateTime.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Short Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long Date: " + fmt.format(ld));
		
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full Date: " + fmt.format(ld));
		
		//ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���޸����ʱ�䣨�ֱ��޸���ݡ��·ݡ��졢Сʱ����Ȼ���ӡ���
		System.out.println("�޸���ݣ�" + ld.plusYears(1));
        System.out.println("�޸��·ݣ�" + ld.plusMonths(1));
        System.out.println("�޸�������" + ld.plusDays(1));
        System.out.println("�޸�Сʱ��" + ld.plusHours(1));
		}
}
