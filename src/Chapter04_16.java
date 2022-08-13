
public class Chapter04_16 {
	public static void main(String[] args) {
		boolean judge = true;
		if (judge == true) {
			int[] array = { 1, 2, 3 };
			System.out.print(array[0]); //1と結果がでる
			array = null; //参照を切る
			System.out.print(array[0]); //ヌルポになる
			array[0] = 100;
			System.out.print(array[0]); //同様の結果
		}
	}
}
