
public class Exercise05_04 {
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleleArea(double radius) {
		return radius * radius * 3.14;
	}

	public static void main(String[] args) {
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" + calcTriangleArea(10.0, 5.0) + "平方cm");
		System.out.println("縁の半径がが5.0cmの場合、面積は" + calcCircleleArea(5.0) + "平方cm");
	}
}
