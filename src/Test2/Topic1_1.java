package Test2;
/*
 * (1) ͳ�Ƹ��ַ�������ĸs���ֵĴ���
   (2) ȡ�����ַ���"test"  //substring
   (3) �����ַ������Ƶ�һ���ַ�����Char[] str��.// toCharArray
   (4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��//��������ʽ
   (5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)
   (6) �����ַ���ת����һ���ַ������飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ���,�����������̨

 */
public class Topic1_1 {

	
	public static void main(String[] args) {
		
		String str = "this is a test of java";
		
		// (1)ͳ�Ƹ��ַ�������ĸs���ֵĴ���
		int count = 0;
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='s') {
				count++;
			}
		}
		System.out.println("(1)���ַ�������ĸs���ֵĴ���Ϊ:"+count);
		
		// (2) ȡ�����ַ���"test"  //substring
		System.out.println("(2) ȡ�����ַ���\"test\":"+" "+str.substring(10, 14));
		
		// (3) �����ַ������Ƶ�һ���ַ�����Char[] str��  //toCharArray
		char[] str1 = str.substring(10, 14).toCharArray();
		System.out.println("(3) �����ַ������Ƶ�һ���ַ�����Char[] str1��");
		for(char c:str1) {
			System.out.print(" "+c+" ");
		}
		
		// (4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��//��������ʽ
		String[] letter = str.split("\\s+");
        StringBuffer upper = new StringBuffer();
        for (String firstw : letter) {
            upper.append(String.valueOf(firstw.charAt(0)).toUpperCase()).append(firstw.substring(1)).append(" ");
        }
        System.out.println(" ");
        System.out.println("(4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨");
        System.out.println(upper);
		
		// (5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)
        StringBuffer overthrow = new StringBuffer(str);
        System.out.println("(5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)");
        System.out.println(overthrow.reverse());
        
        
        StringBuffer overthrow2 = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
        	overthrow2.append(str.charAt(i));
        }
        System.out.println(overthrow2.toString());
		
        // (6) �����ַ���ת����һ���ַ������飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ���,�����������̨
        System.out.println("(6) �����ַ���ת����һ���ַ������飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ���,�����������̨");
        String[] b = str.split("\\s+");
        for(String s:b){
            System.out.print(s+"|");
        }
		
		
		
		
	}
	
}
