package e_02_09;
import java.util.Random;

public class E_02_09 {
	public static void main(String args[]){
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();

		// 0.0以上1.0未満の実数値をランダムに生成
		double lessThanOne = rand.nextDouble();
		// 生成された乱数を表示
		System.out.println("0.0以上1.0未満の実数値は" + lessThanOne +"です。");

		// 0.0以上10.0未満の乱数を生成し1.0未満の乱数をプラスする
		double lessThanTen = rand.nextInt(10) + lessThanOne;

		// 生成された乱数を表示
		System.out.println("0.0以上10.0未満の実数値は" + lessThanTen +"です。");

		// -1,0～1,0未満の乱数を生成
		double moreLessThanOne = rand.nextInt(3) -1;

		// 生成された乱数に1.0未満の乱数をプラスした実数値を表示
		System.out.println("-1.0以上1.0未満の実数値は" + (moreLessThanOne + lessThanOne) +"です。");
	}
}
