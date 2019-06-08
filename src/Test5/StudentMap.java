package Test5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {

		HashMap<Student2, String> hm = new HashMap<Student2, String>();
		hm.put(new Student2("����", 20), "����");
		hm.put(new Student2("����", 22), "�㽭");
		hm.put(new Student2("����", 22), "����");
		hm.put(new Student2("����", 22), "����");

		// keyset
		Set<Student2> ks = hm.keySet();
		Iterator<Student2> it=ks.iterator();
		while(it.hasNext()) {
			Student2 st = it.next();
			String addr=hm.get(st);
			System.out.println(st+"---"+addr);
		}
	}
}

class Student2 {

	private String name;
	private int age;

	public Student2() {
	}

	public Student2(String name, int age) {

	}

	@Override
	public int hashCode() {
		int result;
        result = (name==null?0:name.hashCode());
        return result;
	}

	@Override
	public boolean equals(Object obj) {
		Student2 students = (Student2) obj;

        if(this.name.equals(students.name)&&this.age==students.age){
            return true;
        }
        else return false;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}
	
}
