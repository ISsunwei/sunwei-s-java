package Test2;

public class Topic2 {

	public static void main(String[] args) {
		
		String s = "Hello";
		StringBuffer sb = new StringBuffer(s);
		String s2 = sb.toString();
		System.out.println(s2);
		
		//�������
		sb.append(" append");
		System.out.println(sb);
		
		//��������
		sb.insert(0, "insert ");
		System.out.println(sb);
		
		//ɾ������
		sb.delete(13, 19);
		System.out.println(sb);
		
		//��ת����
		sb.reverse();
		System.out.println(sb);
	}
}
