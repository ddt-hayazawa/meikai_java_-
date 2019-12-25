package e_03_10;

import java.util.Scanner;

public class E_03_10 {
	// 二つの実数値を読み込んでその値の差を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 実数値aの入力を促す
		System.out.print("整数a：");
		// 実数値aの入力値を変数に代入
		int intValueA = stdIn.nextInt();

		// 実数値bの入力を促す
		System.out.print("整数b：");
		// 実数値bの入力値を変数に代入
		int intValueB = stdIn.nextInt();

		// 三項演算子で一気に計算
		System.out.println("2つの数値の差は" + (intValueA >intValueB ? (intValueA - intValueB) : (intValueB - intValueA)) + "です。");

	}
}
