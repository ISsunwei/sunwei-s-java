package Test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Students> list = new ArrayList<>();
		list.add(new Students(1, "����", 88));
        list.add(new Students(2, "����", 82));
        list.add(new Students(3, "����", 92));
        list.add(new Students(4, "����", 79));
        // ���ܷ�����
        Collections.sort(list);
        Iterator<Students> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
