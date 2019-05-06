package Test2;

public class Topic2 {

	public static void main(String[] args) {
		
		String s = "Hello";
		StringBuffer sb = new StringBuffer(s);
		String s2 = sb.toString();
		System.out.println(s2);
		
		//添加数据
		sb.append(" append");
		System.out.println(sb);
		
		//插入数据
		sb.insert(0, "insert ");
		System.out.println(sb);
		
		//删除数据
		sb.delete(13, 19);
		System.out.println(sb);
		
		//反转数据
		sb.reverse();
		System.out.println(sb);
	}
}
