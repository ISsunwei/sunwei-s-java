package Test4;

import java.util.function.Consumer;

/*
 * 定义一个测试类，里面有一个消费苹果的方法。如下
public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }
完成测试类的main方法。main方法创建数个苹果对象放在苹果数组里，再调用ConsumerApple方法。
调用两次，一次用lambda的形式完成参数Consumer<Apple> c的传递。
第二次用匿名内部类的形式。

 */
public class TestApple {

	public static void main(String[] args) {
		Apple[] apples = new Apple[2];
		Apple apple = new Apple("green",1);
		apples[0] = apple;
		apple = new Apple("red",(float) 1.5);
		apples[1] = apple;
		ConsumerApple(apples, (Apple applenew) ->{});
	}
	
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	}
}
