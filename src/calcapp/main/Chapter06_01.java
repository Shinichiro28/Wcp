package calcapp.main;

import calcapp.logics.Chapter06_01_Logic;

public class Chapter06_01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Chapter06_01_Logic.tasu(a, b);
		int delta = Chapter06_01_Logic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
