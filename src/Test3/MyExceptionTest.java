package Test3;

/*
 * �Զ����쳣�࣬�����������ָ�ʽ�쳣��
 * �Զ���һ�������࣬��һ��public static int parseInt(String str)��̬������
 * �ܹ����ַ���ת��Ϊ��ֵ�����أ������ת�������з��ַ������ַ������׳��Զ����쳣����
 * ���дһ�������࣬�����Զ��幤�����parseInt�������������쳣������
 */
public class MyExceptionTest extends NumberFormatException {

	public MyExceptionTest() {
		super();
	}
	public MyExceptionTest(String message) {
		super(message);
	}
	
}
