package e_03_18;
import java.util.Scanner;

public class E_03_18 {
	// 1～12までの整数値を読み込み、それに対応する季節を表示する
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 月の整数値の入力を促す
		System.out.print("月(1～12)：");
		// 入力値を変数に代入
		int monthVal = stdIn.nextInt();

		// 1～12までの入力で季節を分ける
		switch(monthVal){
		case 12:
		case 1:
		case 2:
			// 12～2月であれば「冬です」と表示
			System.out.println("冬です。");
			break;
		case 3:
		case 4:
		case 5:
			// 3～5月であれば「春です」と表示
			System.out.println("春です。");
			break;
		case 6:
		case 7:
		case 8:
			// 6～8月であれば「夏です。」と表示
			System.out.println("夏です。");
			break;
		case 9:
		case 10:
		case 11:
			// 9～11月であれば「秋です。」と表示
			System.out.println("秋です。");
			break;
		}
	}
}
