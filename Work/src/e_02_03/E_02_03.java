package e_02_03;
import java.util.Scanner;

public class E_02_03 {

	// キーボードから読み込んだ整数値をそのまま反復して表示する
	public static void main(String[] args){

		// scannerクラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値："); // 「整数値：」を表示
		int a = stdIn.nextInt(); 	  // aに整数値を読み込む

		System.out.println(a + "と入力しましたね。"); // 入力された整数値と「と入力しましたね。」を結合し表示

	}
}
