package e_03_13;
import java.util.Scanner;

public class E_03_13 {
	// 3つの実数値を読み込み中央値を求めて表示
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

		// 実数値cの入力を促す
		System.out.print("整数c：");
		// 実数値bの入力値を変数に代入
		int intValueC = stdIn.nextInt();

		// ①中央値を求めるためにまず最小値を算出
		// まずは実数値aをminに代入
		int minValue = intValueA;

		if(intValueB < minValue){
			// 実数値bがminより小さい場合、minにbを代入
			minValue = intValueB;
		}else if(intValueC < minValue){
			// 実数値cがminより小さい場合、minにcを代入
			minValue = intValueC;
		}

		// ②中央値を求めるために最大値を求める
		// まずは実数値bをmaxに代入
		int maxValue = intValueB;

		if(intValueB < intValueA){
			// 実数値bがmaxより大きい場合、maxにbを代入
			maxValue = intValueC;
		}else if(maxValue < intValueC){
			// 実数値cがmaxより大きい場合、maxにcを代入
			maxValue = intValueC;
		}

		// ③中央値を求める
		// まずは実数値cをmidに代入
		int midValue = intValueC;

		if(intValueA != maxValue && intValueA != minValue){
			// 実数値aが最大値と最小値でなければaが中央値
			midValue = intValueA;
		}

		if(intValueB != maxValue && intValueB != minValue){
			// 実数値bが最大値と最小値でなければbが中央値
			midValue = intValueB;
		}
		// 求めた中央値を表示
		System.out.println("3つの実数値の中央値は" + midValue + "です。");
	}
}
