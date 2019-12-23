package e_03_11;
import java.util.Scanner;

public class E_03_11 {
	// 2つの実数値を読み込みその差分によって処理を変更する
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

		// 表示用の変数を宣言
		int diff = (intValueA > intValueB ? intValueA - intValueB : intValueB - intValueA);

		// 三項演算子で一気に計算
		System.out.println("2つの数値の差は10" + (diff <= 10 ? "以下" : "以上") + "です。");

	}
}
