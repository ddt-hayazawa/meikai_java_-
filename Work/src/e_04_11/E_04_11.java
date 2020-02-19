package e_04_11;

import java.util.Scanner;

public class E_04_11 {
	// 整数値を0までカウントダウンする
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.print("正の整数値：");
		// 入力値を変数に代入
		int inputNum = stdIn.nextInt();

		// 入力値をiに代入し、入力値になるまで繰り返す
		for (int i = inputNum; i >= 0; i--) {
			// iを表示
			System.out.println(i);
		}
	}
}
