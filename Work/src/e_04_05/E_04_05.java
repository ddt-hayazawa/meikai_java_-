package e_04_05;
import java.util.Scanner;

public class E_04_05 {
	// 4-5の「x--」が「--x」となっていた場合の実行結果を確認
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 行う処理のタイトル
		System.out.println("カウントダウンします。");
		// ディクリメント用の変数を宣言
		int decreaseNum;
		do {
			// 整数値の入力を促す
			System.out.print("正の整数値：");
			// 入力値をディクリメント用変数に代入
			decreaseNum = stdIn.nextInt();
			// ディクリメント用変数が0以下の場合ループ
		} while (decreaseNum <= 0);

		while (0 <= decreaseNum){
			// 表示前にdecreaseNumをデクリメントする
			System.out.println(--decreaseNum);
		}
		// 4から-1までカウントダウンをすることを確認
	}
}

