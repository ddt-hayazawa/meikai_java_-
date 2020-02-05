package e_04_09;
import java.util.Scanner;

public class E_04_09 {
	// 正の整数値を読み込み1から入力値までの積を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// 数値の入力を促す
		System.out.print("正の整数値を入力してください：");
		// 入力値を保存する変数の宣言と代入
		int inputNum = stdIn.nextInt();

		// カウント用変数の宣言と代入
		int i = 1;
		// 積を入れるための変数を宣言し初期化
		// 0を入れると掛け算ができないため1を代入
		int multipicNum = 1;

		while (inputNum > 0) {
			// 入力値になるまで積用変数に1をかける
			multipicNum *= 1;
			if (i == inputNum) {
				// 入力値の回数までループしたら処理を抜ける
				break;
			}
			// カウント
			i++;
			// 入力値を
			System.out.println(inputNum);
		}
	}
}
