package e_04_04;
import java.util.Scanner;

public class E_04_04 {
	// 4-4のwhile終了時に変数の値がー1になることを確認
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
			// ディクリメント用変数が0以上の場合ループ
			System.out.println(decreaseNum);
			// ディクリメント用変数を-1する
			decreaseNum --;
		}
		// 結果を表示する
		System.out.println("decreaseNumの実際の値は" + decreaseNum + "です。");

	}

}
