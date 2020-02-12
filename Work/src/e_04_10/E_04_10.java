package e_04_10;
import java.util.Scanner;

public class E_04_10 {
	// 読み込んだ値(1以上)の個数だけ＊を表示
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// 数値の入力を促す
		System.out.print("何個＊を表示しますか：");
		// 入力値を保存する変数の宣言と代入
		int inputNum = stdIn.nextInt();

		// iを1から開始して入力値以下になるまで繰り返す
		for (int i = 0; i < inputNum; i++) {
			// ＊を表示
			System.out.print("*");
			if (i == inputNum) {
				// iが入力値と同じになったとき、改行を出力
				System.out.println();
			}
		}
	}
}
