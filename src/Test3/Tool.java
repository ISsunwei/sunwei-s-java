package Test3;

/*
 * 2���Զ���һ�������࣬��һ��public static int parseInt(String str)��̬������
 * �ܹ����ַ���ת��Ϊ��ֵ�����أ������ת�������з��ַ������ַ������׳��Զ����쳣����
 */
public class Tool {

	public static int parseInt(String str) throws MyExceptionTest{
		    int result = 0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch>='0'&&ch<='9') {
					result=result*10+ch-'0';
				}else
					throw new MyExceptionTest("�����쳣");
			}
			return result;
	}
}
