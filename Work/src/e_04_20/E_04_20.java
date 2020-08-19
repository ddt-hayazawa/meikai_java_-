package e_04_20;
import java.util.Scanner;

public class E_04_20 {
	// n段の正方形を表示する
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// カウント用の変数を宣言
		int countNum;
		do {
			// 正方形の数の入力を促す
			System.out.println("何段の正方形：");
			// 入力した数を代入
			countNum = stdIn.nextInt();
			// 入力値まで繰り返す
		} while (countNum <= 0);
		// 内側の処理countNumの数と*の数が合うまで表示する
		for (int matchNum = 1; matchNum <= countNum; matchNum++) {
			System.out.print('*');

			// countNumの数だけ*を表示したら改行する
			if (matchNum == countNum) {
				System.out.println();
			}
		}
	}
}
