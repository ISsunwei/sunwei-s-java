package Test5;

import java.util.HashMap;

public class StudentMap {

	public static void main(String[] args) {
		
		HashMap<Student2,String> hm=new HashMap<Student2,String>();
		hm.put(new Student2("����",20),"����");
		hm.put(new Student2("����",22),"�㽭");
		hm.put(new Student2("����",22),"����");
		hm.put(new Student2("����",22),"����");
	}
}

class Student2{
	
	private String name;
	private int age;
	public Student2(){}
	public Student2(String name,int age) {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
