package e_04_16;
import java.util.Scanner;

public class E_04_16 {
	// 読み込んだ数だけ＊を表示し、5個表示するたびに改行する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// ＊を表示する数の入力を促す
		System.out.print("何個＊を表示しますか？");
		// 入力値を変数Aに代入
		int intValueA = stdIn.nextInt();

		// iが入力値以下の場合、iをインクリメントしながらループ
		for (int i = 1; i <= intValueA; i++) {
			// ＊を表示
			System.out.print('*');
			// カウンタ変数が5の倍数の場合
			if (i % 5 == 0) {
				// 改行を表示
				System.out.println();
			}
		}
	}
}
