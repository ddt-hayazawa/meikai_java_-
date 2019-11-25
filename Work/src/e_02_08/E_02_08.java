package e_02_08;
import java.util.Random;
import java.util.Scanner;

public class E_02_08 {
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 整数値の入力値を変数に代入
		int intValue = stdIn.nextInt();

		// 読み込んだ整数値の±5の範囲の整数値を生成
		int randamInt = rand.nextInt(10) + (intValue - 5);

		// 生成した乱数を表示
		System.out.println("その値の±5の乱数を生成しました。それは" + randamInt + "です。");
	}
}
