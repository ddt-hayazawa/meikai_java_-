package e_04_07;
import java.util.Scanner;

public class E_04_07 {
	// 読み込んだ値の個数だけ記号文字を表示する
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.print("何個＊を表示しますか：");
		// 入力値を保存する変数の宣言と代入
		int inputNum = stdIn.nextInt();

		// カウント用変数の宣言と初期化
		int i = 0;
		while(i < inputNum){
			// カウント用変数の値が奇数の場合1個目は+を出力する
			// 入力値まで＊と+を出力
			System.out.print(i % 2 == 1 ? '*' : '+');
			i++;
		}
	}
}
