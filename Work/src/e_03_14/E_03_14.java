package e_03_14;
import java.util.Scanner;

public class E_03_14 {
	// 2つの実数値を読み込み小さい値・大きい値両方を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 実数値aの入力を促す
		System.out.print("整数a：");
		// 実数値aの入力値を変数に代入
		int intValueA = stdIn.nextInt();

		// 実数値bの入力を促す
		System.out.print("整数b：");
		// 実数値bの入力値を変数に代入
		int intValueB = stdIn.nextInt();


		// 比較用に代入値を最大値用の変数に代入
		int maxValue = intValueA;
		// 最小値も最小値用変数に代入
		int minValue = intValueB;

		if(maxValue < minValue){
			// maxがminより小さい場合は入れ替えのため仮変数にbの値を代入
			int tempVariable = maxValue;
			// 実数値aの値を最大値用変数に代入
			maxValue = minValue;
			// 仮変数に入れておいた実数値bの値を最小値用変数に代入
			minValue = tempVariable;
		}
		// 三項演算子で比較して表示
		System.out.println((maxValue == minValue) ? "2つの値は同じです。" : "最大値は" + maxValue + "、最小値は" + minValue + "です。" );
	}
}
