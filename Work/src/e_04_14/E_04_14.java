package e_04_14;
import java.util.Scanner;

public class E_04_14 {
	// 4-13を式で表示
	public static void main(String[] args){
		// Scannerインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.print("正の整数値：");
		// 入力値を変数に代入
		int inputNum = stdIn.nextInt();

		// 合計算出用の変数の宣言と初期化
		int sumNum = 0;
		// 入力値まで繰り返す
		for (int i = 1; i <= inputNum; i++) {
			// 合計用変数に入力値を足す
			sumNum += i;
			// iを表示
			System.out.print(i);
			// iが入力値と同じだったら=を、それ以外だったら式が
			// 続くので+を表示
			System.out.print( i== inputNum ? "=" : "+");
		}
		// 合計を表示
		System.out.println(sumNum);
	}
}
