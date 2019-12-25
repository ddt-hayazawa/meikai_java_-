package e_03_07;

import java.util.Scanner;

public class E_03_07 {
	// 整数値を読み込み3で割り切れるか判断し表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 整数値の入力値を変数に代入
		int intValue = stdIn.nextInt();

		if(intValue <= 0)
			// 読み込まれた値が正かどうかを先に判断
			System.out.println("正でない値が入力されました。");

		else
			if(intValue % 3 == 0)
				// 整数値が3で割り切れるパターンの表示
				System.out.println("その値は3で割り切れます。");
			else if(intValue % 3 == 2)
				// 整数値を3で割った余りが2のパターンの表示
				System.out.println("その値を3で割った余りは2です。");
			else
				// 整数値を3で割った余りが1のパターンの表示
				System.out.println("その値を3で割った余りは1です。");
	}
}
