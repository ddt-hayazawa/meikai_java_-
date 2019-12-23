package e_03_09;

import java.util.Scanner;

public class E_03_09 {
	// 二つの実数値を読み込んで大きいほうの値を表示する
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

		// 参考演算子で一気に計算し表示
		System.out.println("大きいほうの値は" + (intValueA >intValueB ? intValueA : intValueB) + "です。");
	}
}
