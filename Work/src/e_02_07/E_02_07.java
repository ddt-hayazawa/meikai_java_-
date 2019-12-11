package e_02_07;
import java.util.Random;

public class E_02_07 {
	// 整数値をランダムに生成して表示
	public static void main(String[] args){
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();

		// 1桁の正の整数値を乱数で生成
		int positiveInt = rand.nextInt(9) + 1;
		// 生成された乱数を表示
		System.out.println("正の整数値は" + positiveInt +"です。");

		// 1桁の負の整数値を乱数で生成
		int negativeInt = rand.nextInt(9) - 9;
		// 生成された乱数を表示
		System.out.println("負の整数値は" + negativeInt  +"です。");

		// 2桁の正の整数値を乱数で生成
		int positiveInts = rand.nextInt(90) + 10;
		// 生成された乱数を表示
		System.out.println("正の2桁の整数値は" + positiveInts +"です。");
	}
}
