package Test5;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class StudentComparator implements Comparator<Student>{

	public static void main(String[] args) {
		TreeSet<Student> st = new TreeSet<>(new StudentComparator());
		st.add(new Student(1,"Tom",77));
		st.add(new Student(1,"William",80));
		st.add(new Student(1,"Bob",77));
		st.add(new Student(1,"bill",65));
		
		Iterator iter = st.iterator();
        while (iter.hasNext()) {
                    System.out.println(iter.next());
        }
	}

	public int compare(Student s1, Student s2) {
		if(s1.getScore()>s2.getScore()){
            return 1;
        }else if(s1.getScore()<s2.getScore()){
            return -1;
        } else {
           return  s1.getName().compareTo(s2.getName());
        }
	}

}		



class Student{
	private int id;
	private String name;
	private int score;
	public Student(){};
	public Student(int id,String name,int score){
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	};
	
}

