
public class Chapter04_15 {
	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB;
		arrayB = arrayA; //arrayAと同じアドレスにもなる
		arrayB[0] = 100;
		System.out.print(arrayA[0]);
	}
}
