package Test2;

import java.util.Random;

public class Topic6 {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random ran = new Random();//���������
		for(int i=0; i<10;i++) {
			a[i] = ran.nextInt(100);
			System.out.print(a[i]+" ");
		}
	}
}
