package e_03_16;
import java.util.Scanner;

public class E_03_16 {
	// 3つの整数値を読み込み昇順にソートする
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

		// 整数値cの入力を促す
		System.out.print("整数c：");
		// 整数値cの入力値を変数に代入
		int intValueC = stdIn.nextInt();

		// 比較用に代入値を最大値用の変数に代入
		int maxValue = intValueA;
		// 最小値も最小値用変数に代入
		int minValue = intValueB;
		// 中間値を中間値用変数に代入
		int midValue = intValueC;

		if(maxValue < midValue){
			// maxがmidより小さい場合は入れ替えのため仮変数にaの値を代入
			int tempVariable = maxValue;
			// 整数値aの値を最大値用変数に代入
			maxValue = midValue;
			// 仮変数に入れておいた整数値cの値を中間値用変数に代入
			midValue = tempVariable;
		}

		if(midValue < minValue){
			// midがminより小さい場合は入れ替えのため仮変数にcの値を代入
			int tempVariable = midValue;
			// 整数値aの値を中間値用変数に代入
			midValue = minValue;
			// 仮変数に入れておいた整数値aの値を中間値用変数に代入
			minValue = tempVariable;
		}

		if(maxValue < midValue){
			// maxがmidより小さい場合は入れ替えのため仮変数にbの値を代入
			int tempVariable = maxValue;
			// 整数値cの値を最大値用変数に代入
			maxValue = midValue;
			// 仮変数に入れておいた整数値aの値を中間値用変数に代入
			midValue = tempVariable;
		}
		// どう表示するかを宣言
		System.out.println("数字を昇順となるようにソートしました。");
		// 連結し表示
		System.out.println("結果は" + minValue + "<" + midValue + "<" + maxValue + "です。");
	}
}
