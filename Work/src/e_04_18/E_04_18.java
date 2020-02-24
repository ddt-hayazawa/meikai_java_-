package e_04_18;
import java.util.Scanner;

public class E_04_18 {
	// 1から入力値までの整数値の二乗値を表示
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 表示する整数値の入力を促す
		System.out.print("nの値：");
		// 入力値を変数Aに代入
		int intValueA = stdIn.nextInt();

		// 入力値までループ
		for (int i = 1; i <= intValueA; i++) {
			// i×iをすることで二乗を計算しループの間表示し続ける
			System.out.println(i + "の二乗は" + (i * i));
		}
	}
}
