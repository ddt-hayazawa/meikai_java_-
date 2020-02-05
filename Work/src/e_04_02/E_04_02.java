package e_04_02;
import java.util.Random;
import java.util.Scanner;

public class E_04_02 {
	// 2桁の整数値を当てさせるプログラム
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		// Randomクラスのインスタンスを生成
		Random rand = new Random();

		// 正解用の数字を生成
		int currectVal = rand.nextInt(90) + 10;

		// タイトル
		System.out.println("数当てゲーム開始！！");
		System.out.println("10～99の数を当ててください");

		// 入力値保存用変数
		int inputVal;

		do{
			// 入力を促す
			System.out.print("いくつかな：");
			// 入力値を保存用変数に代入
			inputVal = stdIn.nextInt();

			if(currectVal < inputVal){
				// 入力値が正解より大きい場合
				System.out.print("もっと小さな数だよ");
			}else if(inputVal < currectVal){
				// 入力値が正解より小さい場合
				System.out.print("もっと大きな数だよ");
			}
		}while(inputVal != currectVal);

		// 不正解であれば繰り返し正解になったらループをぬける
		System.out.println("正解です！");
	}
}
