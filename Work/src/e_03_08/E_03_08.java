package e_03_08;

import java.util.Scanner;

public class E_03_08 {
	// 数字を読み込み点数に応じて優良可を判断し表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 点数の入力を促す
		System.out.print("点数：");
		// 点数の入力値を変数に代入
		int intValue = stdIn.nextInt();

		if(intValue >= 0 && intValue <= 59)
			// 0点から59点の場合は不可と表示
			System.out.println("不可");
		else if(intValue >= 60 && intValue <= 69)
			// 60点から69点の場合は可と表示
			System.out.println("可");
		else if(intValue >= 70 && intValue <= 79)
			// 70点から79点の場合は良と表示
			System.out.println("良");
		else if(intValue >= 80 && intValue <= 100)
			// 80点から100点の場合は優と表示
			System.out.println("優");
	}
}
