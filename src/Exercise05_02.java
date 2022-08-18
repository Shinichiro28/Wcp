
public class Exercise05_02 {
	public static void main(String[] args) {
		String title = "お誘い";
		String address = "aaa@email.com";
		String text = "明日飲みに行きませんか？";
		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
