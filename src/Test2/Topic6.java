package Test2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Topic6 {

	public static void main(String[] args) {
		
		//使用随机数生成十个整数（0--99）保存在一个数组中，然后使用数组实用类，将数组元素复制到另外一个数组
		int[] a = new int[10];
		Random ran = new Random();//生成随机数
		for(int i=0; i<10;i++) {
			a[i] = ran.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] b = a.clone();
		
		//将数组元素进行排序
		System.out.println("对数组b进行排序");
		Arrays.sort(b);
        for (int m : b) {
            System.out.print(m+" ");
        }
        
        //输入一个数值，再查找该数在数组中哪个位置
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数值");
        int num = input.nextInt();
        if(Arrays.binarySearch(b,num) < 0) {
        	System.out.println("该元素不存在");
        }
        else
        	System.out.println("元素位置："+Arrays.binarySearch(b,num));
        
	}
}
