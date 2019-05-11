package Test2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class Topic5 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		 
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Short Date: " + fmt.format(ld));
		 
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium Date: " + fmt.format(ld));
		 
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long Date: " + fmt.format(ld));
		 
		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full Date: " + fmt.format(ld));
		}
}
