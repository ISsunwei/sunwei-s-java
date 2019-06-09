package Test5;

/**
 * HashSet����μ���Ƿ����ظ�Ԫ�صģ���д������֤
 */
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
		
		Cat c1 = new Cat("��è",5,1);
		Cat c2 = new Cat("��è",2,2);
		Cat c3 = new Cat("��è",4,3);
		Cat c4 = new Cat("��è",5,1);
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
