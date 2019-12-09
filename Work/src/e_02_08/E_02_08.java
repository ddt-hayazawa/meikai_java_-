package e_02_08;
import java.util.Random;
import java.util.Scanner;

public class E_02_08 {
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// randamクラスのインスタンスを生成
		Random rand = new Random();

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 整数値の入力値を変数に代入
		int intValue = stdIn.nextInt();

		// 0から10までの乱数を生成
		int randamInt = rand.nextInt(11);

		// 生成された数値から5を引くことでその値の±5の数値を算出
		randamInt -= 5;

		// 入力した整数値に乱数を足す
		intValue += randamInt;

		// 乱数を表示する
		System.out.println("その値の±5の乱数を生成しました。それは" + intValue + "です。");
	}
}
