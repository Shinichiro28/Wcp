
public class Chapter04_9 {
	public static void main(String[] args) {
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = 0; //集計結果の変数はとして初期化しておく
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; //1科目ずつsumに合算する
		}
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);
	}
}
