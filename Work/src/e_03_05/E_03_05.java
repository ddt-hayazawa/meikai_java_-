package e_03_05;

import java.util.Scanner;

public class E_03_05 {
    //読み込んだ整数値を5で割れるか判断し表示
    public static void main(String[] args){
        // Scannerクラスのインスタンスを生成
        Scanner stdIn = new Scanner(System.in);

        // 整数値の入力を促す
        System.out.print("整数値：");
        // 整数値の入力値を変数に代入
        int intValue = stdIn.nextInt();

        if(intValue <= 0)
        	// 読み込まれた値が正かどうかを先に判断
        	System.out.println("正でない値が入力されました。");
        else
	        if(intValue % 5 == 0)
	        	// 整数値が5で割り切れるパターンの表示
	        	System.out.println("その値は5で割り切れます。");
	        else
	        	// 整数値が5で割り切れないパターンの表示
	        	System.out.println("その値は5で割り切れません。");
    }
}
