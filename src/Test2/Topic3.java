package Test2;

public class Topic3 {

	public static void main(String[] args) {
		int num = 1;
		Integer m = new Integer(num);
		int m2 = m.intValue();           //基本数据类型和包装类的互相转化
		
		String n = m.toString();
		Integer n2 = new Integer(n);     //包装类和字符串相互转换
		
		n = String.valueOf(num);         //基本数据类型与字符串互相转换
		num = Integer.valueOf(n);
	}
}
