package Test4;

/*
 * 定义一个苹果类，有颜色和重量
 */
public class Apple {

	private String color;
	private float weight;
	public Apple() {}
	public Apple(String color,float weight) {
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
