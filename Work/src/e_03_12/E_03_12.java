package e_03_12;
import java.util.Scanner;

public class E_03_12 {
	// 3つの実数値を読み込み最小値を求めて表示
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

		// 最小値を求めるためにまずminに実数値aを代入
		int minValue = intValueA;

		if(intValueB < min){
			// 実数値bがminより小さい場合、minにbを代入
			minValue = intValueB;
		}else if(intValueC < min){
			// 実数値cがminより小さい場合、minにcを代入
			minValue = intValueC;
		}
		System.out.println("3つの実数値の最小値は" + minValue + "です。");
	}
}
