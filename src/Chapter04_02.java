
public class Chapter04_02 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public static void methodB() {
		System.out.println("mrthodB");
	}

	public static void main(String[] args) {
		methodA();
	}
}
