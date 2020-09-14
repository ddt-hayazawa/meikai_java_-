package e_04_21_1;
import java.util.Scanner;

public class E_04_21_1 {
	// 直角が左上側の三角形を表示する
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// 変数を宣言
		int inputNum;
		do {
			// 整数値の入力を促す
			System.out.print("n段の左上直角の三角形を表示");
			// 入力値を保存
			inputNum = stdIn.nextInt();
			// 入力値が1より小さい間繰り返す
		} while (inputNum < 1);
		// inputNumの数の段を作成
		for (int i = 0; i < inputNum; i++) {
			// 段が下がるたびに1つずつ＊を減らす
			for (int j = (inputNum - i); j > 0; j--) {
				// ＊を表示
				System.out.print("*");
			}
			// 改行
			System.out.println();
		}
	}
}
