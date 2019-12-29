package e_04_01;
import java.util.Scanner;

public class E_04_01 {
	// 3-5のプログラムを繰り返す
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 繰り返し用変数を宣言
		int retry;

		do{
	        // 整数値の入力を促す
	        System.out.print("整数値：");
	        // 整数値の入力値を変数に代入
	        int intValue = stdIn.nextInt();

	        if(intValue <= 0)
	        	// 読み込まれた値が正かどうかを先に判断
	        	System.out.println("正でない値が入力されました。");
	        else if(intValue % 5 == 0){
	        	// 整数値が5で割り切れるパターンの表示
	        	System.out.println("その値は5で割り切れます。");
	        }else{
	        	// 整数値が5で割り切れないパターンの表示
	        	System.out.println("その値は5で割り切れません。");
	        }
	        // もう一度行うか確認
	        System.out.print("もう一度？ 1…Yes/2…No:");
	        // 繰り返し変数に入力値を代入
			retry = stdIn.nextInt();

		// 	入力値が1の場合処理を繰り返す
		}while(retry == 1);
	}
}
