package e_04_12;
import java.util.Scanner;

public class E_04_12 {
	// 整数値を0から入力値までカウントアップする
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.print("正の整数値：");
		// 入力値を変数に代入
		int inputNum = stdIn.nextInt();

		// 0をiに代入し、入力値になるまで繰り返す
		for (int i = 0; i <= inputNum; i++) {
			// iを表示
			System.out.println(i);
		}
	}
}
