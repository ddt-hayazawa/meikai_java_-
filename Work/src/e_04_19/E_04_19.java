package e_04_19;
import java.util.Scanner;

public class E_04_19 {
	// 入力された月の季節を表示し、1～12までの数字以外は再入力させる
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// リトライ用の変数を宣言
		int retryCount;

		do {
			// 1～12月までの入力を促す
			System.out.print("季節を求めます。\n月ですか：");
			// 入力した月を代入
			int inputMonth = stdIn.nextInt();
			// 入力した数値が3、4、5の場合、「春です」と出力
			if (inputMonth >= 3 && inputMonth <= 5) {
				System.out.println("それは春です。");
				// 6,7,8の場合、「夏です」と出力
			} else if (inputMonth >= 6 && inputMonth <= 8) {
				System.out.println("それは夏です。");
				// 9，10，11の場合、「秋です」と出力
			} else if (inputMonth >= 9 && inputMonth <= 11) {
				System.out.println("それは秋です。");
				// 12,1,2の場合、「冬です」と出力
			} else if (inputMonth == 12 || inputMonth == 1 || inputMonth == 2) {
				System.out.println("それは冬です。");
			}
			// それ以外の数字の場合、再入力するか確認
			System.out.print("もう一度？ 1…Yes/0…No：");
			// もう一度を選択した場合、リトライ用変数に1を代入
			retryCount = stdIn.nextInt();

			// もう一度を選択した場合はループ
		} while (retryCount == 1);
	}
}
