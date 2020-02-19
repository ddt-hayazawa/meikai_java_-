package e_04_15;

import java.util.Scanner;

public class E_04_15 {
	// 身長と標準体重の対応表を表示する
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 開始値の入力を促す
		System.out.println("何cmから：");
		// 入力値を変数に代入
		int startNum = stdIn.nextInt();

		// 終了値の入力を促す
		System.out.println("何cmまで：");
		// 入力値を変数に代入
		int endNum = stdIn.nextInt();

		// 増分値の入力を促す
		System.out.println("何cmごと：");
		// 入力値を変数に代入
		int diffNum = stdIn.nextInt();

		//
		if(startNum <= 0 || endNum <= 0 || diffNum <= 0){
			System.out.println("入力値が小さすぎます。");

		}
	}
}
