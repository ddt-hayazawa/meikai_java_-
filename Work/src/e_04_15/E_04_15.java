package e_04_15;

import java.util.Scanner;

public class E_04_15 {
	// 身長と標準体重の対応表を表示する
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 開始値用変数の宣言
		int startVal;
		// 終了値用変数の宣言
		int endVal;
		// 増分値用変数の宣言
		int displayVal;

		do {
			// 開始値の入力を促す
			System.out.print("何cmから：");
			// 入力値を変数に代入
			startVal = stdIn.nextInt();

			// 終了値の入力を促す
			System.out.print("何cmまで：");
			// 入力値を変数に代入
			endVal = stdIn.nextInt();

			// 増分値の入力を促す
			System.out.print("何cmごと：");
			// 入力値を変数に代入
			displayVal = stdIn.nextInt();

			// 身長が0cm以下だと整数ではなくなるため再入力を促す
			if (startVal <= 0 || endVal <= 0 || displayVal <= 0) {
				System.out.println("入力値が小さすぎます。");
			}
			// 身長が100cm以下だと計算できないため再入力を促す
		} while (startVal <= 100 || endVal <= 100 || displayVal <= 0);

		// 出力内容の説明
		System.out.println("身長　標準体重");
		// 終了値になるまで増分値をプラスする
		for (int i = startVal; i <= endVal; i += displayVal) {
			// displayValセンチごとに結果を出力する
			System.out.println(i + " " + (i - 100) * 0.9);

		}
	}
}
