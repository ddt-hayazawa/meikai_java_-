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

		// 積を求めるための変数を宣言し初期化
		// 0を入れると掛け算ができないため1を代入
		int sekiNum = 1;

		// カウント用変数の宣言と代入
		int i = 1;

		while (inputNum > 0) {
			// 入力値になるまで積用変数に入力値をかける
			sekiNum *= i;
			if (i == inputNum) {
				// 入力値の回数までループしたら処理を抜ける
				break;
			}
			// カウント
			i++;
			// 積を求める変数を表示
		}
		System.out.println("1から" + inputNum + "までの積は" + sekiNum + "です。");
	}
}
