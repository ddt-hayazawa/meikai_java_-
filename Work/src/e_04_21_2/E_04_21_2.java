package e_04_21_2;
import java.util.Scanner;

public class E_04_21_2 {
	// 直角が右下側の三角形を表示する
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// 変数を宣言
		int inputNum;
		do {
			// 整数値の入力を促す
			System.out.print("n段の右下の直角の三角形を表示");
			// 入力値を保存
			inputNum = stdIn.nextInt();
			// 入力値が1より小さい間繰り返す
		} while (inputNum < 1);
		// inputNumの数の段を作成
		for (int i = inputNum; i > 0; i--) {
			// 段が下がる度に1つずる空白を減らす
			for (int j = i; j - 1 > 0; j--) {
				// 空白を表示
				System.out.print(" ");
			}
			// 段が下がるたびに1つずつ＊を増やす
			for (int k = 0; k <= inputNum - i; k++) {
				// ＊を表示
				System.out.print("*");
			}
			// 改行
			System.out.println();
		}
	}
}
