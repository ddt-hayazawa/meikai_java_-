package e_04_03;
import java.util.Scanner;

public class E_04_03 {
	// 2つの整数値を読み込み小さい数字から大きい数字まで昇順で表示
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 整数値aの入力を促す
		System.out.print("整数A：");
		// 入力値を変数Aに代入
		int intValueA = stdIn.nextInt();

		// 整数値bの入力を促す
		System.out.print("整数B：");
		// 入力値を変数Bに代入
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

		// ループで回す用の変数を用意し最小値を代入
		int increaseNum = minValue;

		do {
			// 一回目は最小値が表示される
			System.out.print(increaseNum);
			// 最大値になるまで1をプラスしていく
			increaseNum = increaseNum + 1;
			// 数字と数字がつながらないよう空白を表示
			System.out.print(" ");
		}while (maxValue != increaseNum);
		// 最大値になった時点でループを抜けるので
		// 最大値を表示する
		System.out.println(increaseNum);

	}
}
