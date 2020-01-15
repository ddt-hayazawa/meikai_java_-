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

	        if(0 < intValue){
	        	// 入力値が0より大きい場合は正と表示
	        	System.out.println("その値は正です。");
	        }else if(intValue < 0){
	        	// 入力値が0より小さい場合は負と表示
	        	System.out.println("その値は負です。");
	        }else{
	        	// 残りのパターンは0のみなので0ですと表示
	        	System.out.println("その値は0です。");
	        }
	        // もう一度行うか確認
	        System.out.print("もう一度？ 1…Yes/2…No:");

	        // 繰り返し変数に入力値を代入
	        retry = stdIn.nextInt();

		// 	入力値が1の場合処理を繰り返す
		}while(retry == 1);
	}
}
