package e_03_15;
import java.util.Scanner;

public class E_03_15 {
	// 2つの整数値を読み込み降順にソートする
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 整数値aの入力を促す
		System.out.print("整数a：");
		// 整数値aの入力値を変数に代入
		int intValueA = stdIn.nextInt();

		// 整数値bの入力を促す
		System.out.print("整数b：");
		// 整数値bの入力値を変数に代入
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
		System.out.println("a ≧ bとなるようにソートしました。");
		System.out.println("変数aは" + maxValue + "です。");
		System.out.println("変数bは" + minValue + "です。");
	}
}
