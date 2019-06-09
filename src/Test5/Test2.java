package Test5;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "张三", 88));
        list.add(new Student(2, "李四", 82));
        list.add(new Student(3, "王五", 92));
        list.add(new Student(4, "赵六", 79));
	}
}
