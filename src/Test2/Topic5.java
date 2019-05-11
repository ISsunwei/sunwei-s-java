package Test2;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;


public class Topic5 {

	public static void main(String[] args) {
		Date date = Topic5.dateChange(+7);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateFormatter.toFormat());
	}
	
	public static Date dateChange(int days) {
		Calendar canlendar = Calendar.getInstance();
		canlendar.add(Calendar.DATE, days);
		return canlendar.getTime();
	}
}
