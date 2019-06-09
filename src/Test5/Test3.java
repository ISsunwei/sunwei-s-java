package Test5;

/**
 * HashSet是如何检测是否有重复元素的，并写程序验证
 */
import java.util.HashSet;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		set.add("张三");
		
		String[] names = set.toArray(new String[] {});
		for(String s:names) {
			System.out.println(s);
		}
		
		Cat c1 = new Cat("白猫",5,1);
		Cat c2 = new Cat("黑猫",2,2);
		Cat c3 = new Cat("橘猫",4,3);
		Cat c4 = new Cat("白猫",5,1);
		Set<Cat> cats = new HashSet<Cat>();
		cats.add(c1);
		cats.add(c2);
		cats.add(c3);
		cats.add(c4);
		System.out.println(cats.size());
		
		for(Cat c:cats) {
			System.out.println(c);
		}
	}
}
