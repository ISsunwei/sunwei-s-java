package Test5;

import java.util.TreeSet;
import java.util.Comparator;

public class Tset_1 implements Comparator{

	public int compare(Student o1, Student o2) {
		
		return 0;
	}

	public static void main(String[] args) {
		
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

