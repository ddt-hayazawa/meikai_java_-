package e_04_06;

import java.util.Scanner;

public class E_04_06 {
	// 読み込んだ値が1未満であれば改行文字を出力しない
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.print("何個＊を表示しますか：");
		// 入力値を保存する変数の宣言と代入
		int inputNum = stdIn.nextInt();

		// カウント用変数の宣言と初期化
		int i = 0;
		while(i < inputNum){
			// 入力値まで＊を出力
			System.out.print('*');
			i++;
		}
		if(0 < inputNum){
			// 0より大きい場合のみ改行文字を出力
			System.out.println();
		}
	}
}
