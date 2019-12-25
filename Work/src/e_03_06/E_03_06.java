package e_03_06;
import java.util.Scanner;

public class E_03_06 {
	// 整数値を読み込み10の倍数かを判断し表示する
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
			if(intValue % 10 == 0)
				// 整数値が10で割り切れるパターンの表示
				System.out.println("その値は10の倍数です。");
			else
				// 整数値が10で割り切れないパターンの表示
				System.out.println("その値は10の倍数ではありません。");
	}

}
