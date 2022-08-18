
public class Chapter05_03 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊さん");
		hello("朝香さん");
		hello("菅原さん");
		System.out.println("メソッドの呼び出しが終わりました");
	}

	public static void hello(String name) {
		System.out.println(name + "、こんにちは");
	}
}
