package Test5;

import java.util.HashSet;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		
		String[] names = set.toArray(new String[] {});
		for(String s:names) {
			System.out.println(s);
		}
	}
}
