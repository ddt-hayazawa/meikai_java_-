package e_04_17;
import java.util.Scanner;

public class E_04_17 {
	// 読み込んだ整数値のすべての約数を表示し、最後に個数を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 表示する整数値の入力を促す
		System.out.print("整数値：");
		// 入力値を変数Aに代入
		int intValueA = stdIn.nextInt();

		// 個数を数える変数を宣言
		int countNum = 0;
		// 入力値になるまでループ
		for (int i = 1; i <= intValueA; i++) {
			// 割り切れた場合
			if (intValueA % i == 0) {
				// 表示
				System.out.println(i);
				// 約数の場合はカウントを+する
				countNum++;
			}
		}
		// カウントした個数用の変数を表示
		System.out.println("約数は" + countNum + "です。");
	}
}
