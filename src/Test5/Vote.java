package Test5;

/**
 * .дһ��ͳ��ͶƱ��������3����ѡ�ˣ���10�˲μ�ѡ�٣�ÿ��ѡ��������������ѡ�˵ı�ţ�Ҫ�����������ѡ�˵ĵ�Ʊ����
��������������10��ѡ�����ύ�ĺ�ѡ�˱��
��������������ѡ�˱�ż���Ӧ�ĵ�Ʊ��*
Ҫ����map����ʾͶƱ�����

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<10;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("����������ѡ�˱��");
			for(int j=0;j<2;j++) {
				int num = input.nextInt();
				if(map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
                    map.put(num, 1);
                }
			}	
		}
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
