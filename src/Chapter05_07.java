
public class Chapter05_07 {
	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(4.3, 3.3));
		System.out.println(add("Hello! ", "World"));
	}
}
