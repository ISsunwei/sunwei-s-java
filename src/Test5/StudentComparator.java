package Test5;

import java.util.TreeSet;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	public static void main(String[] args) {
		TreeSet<Student> st = new TreeSet<>(new StudentComparator());
		
	}

	public int compare(Student s1, Student s2) {
		return s1.getScore()-s2.getScore();
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

