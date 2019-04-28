package Test2;
/*
 * (1) 统计该字符串中字母s出现的次数
   (2) 取出子字符串"test"  //substring
   (3) 将本字符串复制到一个字符数组Char[] str中.// toCharArray
   (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
   (5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
   (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台

 */
public class Topic1_1 {

	
	public static void main(String[] args) {
		
		String str = "this is a test of java";
		
		// (1)统计该字符串中字母s出现的次数
		int count = 0;
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='s') {
				count++;
			}
		}
		System.out.println("(1)该字符串中字母s出现的次数为:"+count);
		
		// (2) 取出子字符串"test"  //substring
		System.out.println("(2) 取出子字符串\"test\":"+" "+str.substring(10, 14));
		
		// (3) 将本字符串复制到一个字符数组Char[] str中  //toCharArray
		char[] str1 = str.substring(10, 14).toCharArray();
		System.out.println("(3) 将本字符串复制到一个字符数组Char[] str1中");
		for(char c:str1) {
			System.out.print(" "+c+" ");
		}
		
		// (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
		String[] letter = str.split("\\s+");
        StringBuffer upper = new StringBuffer();
        for (String firstw : letter) {
            upper.append(String.valueOf(firstw.charAt(0)).toUpperCase()).append(firstw.substring(1)).append(" ");
        }
        System.out.println(" ");
        System.out.println("(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台");
        System.out.println(upper);
		
		// (5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
        StringBuffer overthrow = new StringBuffer(str);
        System.out.println("(5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)");
        System.out.println(overthrow.reverse());
        
        
        StringBuffer overthrow2 = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
        	overthrow2.append(str.charAt(i));
        }
        System.out.println(overthrow2.toString());
		
        // (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
        System.out.println("(6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台");
        String[] b = str.split("\\s+");
        for(String s:b){
            System.out.print(s+"|");
        }
		
		
		
		
	}
	
}
