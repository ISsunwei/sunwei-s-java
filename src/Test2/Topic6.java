package Test2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Topic6 {

	public static void main(String[] args) {
		
		//ʹ�����������ʮ��������0--99��������һ�������У�Ȼ��ʹ������ʵ���࣬������Ԫ�ظ��Ƶ�����һ������
		int[] a = new int[10];
		Random ran = new Random();//���������
		for(int i=0; i<10;i++) {
			a[i] = ran.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] b = a.clone();
		
		//������Ԫ�ؽ�������
		System.out.println("������b��������");
		Arrays.sort(b);
        for (int m : b) {
            System.out.print(m+" ");
        }
        
        //����һ����ֵ���ٲ��Ҹ������������ĸ�λ��
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����ֵ");
        int num = input.nextInt();
        if(Arrays.binarySearch(b,num) < 0) {
        	System.out.println("��Ԫ�ز�����");
        }
        else
        	System.out.println("Ԫ��λ�ã�"+Arrays.binarySearch(b,num));
        
	}
}
