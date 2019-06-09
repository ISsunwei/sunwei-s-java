package Test5;

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
	}
}
