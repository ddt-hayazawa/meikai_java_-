package e_04_08;
import java.util.Scanner;

public class E_04_08 {
	// 正の整数値を読み込んでその桁数を出力する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// 数値の入力を促す
		System.out.print("正の整数値を入力してください：");
		// 入力値を保存する変数の宣言と代入
		int inputNum = stdIn.nextInt();

		// カウント用変数の宣言と代入
		int i = inputNum;
		// 表示用の変数の宣言と初期化
		int countNum = 0;

		while(i > 0){
			// 0になるまで10で割る
			i /= 10;
			// 表示用変数をカウントアップ
			countNum++;
		}
		// 表示用変数を表示
		System.out.print(countNum);
	}
}