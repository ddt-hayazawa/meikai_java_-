package e_02_06;
import java.util.Scanner;

public class E_02_06 {

	// 三角形の底辺と高さを読み込んでその面積を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 「三角形の面積を求めます」と表示
		System.out.println("三角形の面積を求めます。");

		// 底辺の入力を促す
		System.out.print("底辺：");
		// 底辺の入力値を変数に代入
		double baseValue = stdIn.nextDouble();

		// 高さの入力を促す
		System.out.print("高さ：");
		// 高さの入力値を変数に代入
		double highValue = stdIn.nextDouble();

		// 面積を表示
		System.out.println("面積は" + ((baseValue * highValue) / 2) + "です。");

	}
}
