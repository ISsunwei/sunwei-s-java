package Test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//��һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����
public class Topic4_10 {

	public static void main(String[] args) {
		String str = "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
		Pattern p = Pattern.compile(str); 
		p = Pattern.compile("(%CXLL=.*?(?=%))");
		Matcher matcher = p.matcher(str);
		while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
	}
}
