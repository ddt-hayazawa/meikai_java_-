package e_02_04;
import java.util.Scanner;

public class E_02_04 {
	// キーボードから読み込んだ整数値を10の加算と減算をした値を出力する
	public static void main(String[] args){

		// scannerクラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値："); // 「整数値：」を表示
		int a = stdIn.nextInt(); 	  // aに整数値を読み込む

		int b = a + 10; // int型整数bを宣言し入力値に10加算した整数値を代入する
		int c = a - 10; // int型整数cを宣言し入力値に10減算した整数値を代入する

		System.out.println("10を加えた値は" + b  + "です。"); // 入力値に10加算した結果を表示する
		System.out.println("10を減じた値は" + c  + "です。"); // 入力値に10減算した結果を表示する
	}
}
