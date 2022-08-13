
public class Exercise03_3 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "ポテト";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹いっぱいです");
		} else {
			System.out.println("空腹です");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
	}
}
