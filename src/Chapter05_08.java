
public class Chapter05_08 {
	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(add(20, 60));
		System.out.println(add(30, 50, 70));
	}
}
