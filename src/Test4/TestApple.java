package Test4;

import java.util.function.Consumer;

/*
 * ����һ�������࣬������һ������ƻ���ķ���������
public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }
��ɲ������main������main������������ƻ���������ƻ��������ٵ���ConsumerApple������
�������Σ�һ����lambda�����ڲ������ʽ��ɲ���Consumer<Apple> c�Ĵ��ݡ�
�ڶ����������ڲ������ʽ��

 */
public class TestApple {

	public static void main(String[] args) {
		Apple[] apples = new Apple[2];
		Apple apple = new Apple("green",1);
		apples[0] = apple;
		apple = new Apple("red",(float) 1.5);
		apples[1] = apple;
		
		//lambda����ʽ
		ConsumerApple(apples, (Apple applenew) ->{System.out.println("���óɹ�");});
		
		//�����ڲ������ʽ
		 ConsumerApple(apples,new Consumer<Apple>() {

			@Override
			public void accept(Apple apple) {
				// TODO Auto-generated method stub
				System.out.println("���óɹ�");
			}
			 
		 });
	}
	
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	}
}
