package Test2;

public class Topic3 {

	public static void main(String[] args) {
		int num = 1;
		Integer m = new Integer(num);
		int m2 = m.intValue();           //�����������ͺͰ�װ��Ļ���ת��
		
		String n = m.toString();
		Integer n2 = new Integer(n);     //��װ����ַ����໥ת��
		
		n = String.valueOf(num);         //���������������ַ�������ת��
		num = Integer.valueOf(n);
	}
}
