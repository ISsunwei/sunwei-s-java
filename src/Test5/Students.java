package Test5;

public class Students implements Comparable<Students> {

	private int id;
    private String name;
    private double score;

    public Students() {}
    public Students(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
	@Override
	public int hashCode() {
		int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (!(obj instanceof Students)) return false;

        Students students = (Students) obj;

        if (id != students.id) return false;
        if (Double.compare(students.score, score) != 0) return false;
        return name != null ? name.equals(students.name) : students.name == null;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Students o) {
		if (this.score != o.score) {
            return this.score > o.score ? 1 : -1;
        }
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return 0;
	}
    
}
