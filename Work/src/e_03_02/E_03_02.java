package e_03_02;
import java.util.Scanner;

public class E_03_02 {
    //整数値を読込み約数かを判断する
    public static void main(String[] args){
        // Scannerクラスのインスタンスを生成
        Scanner stdIn = new Scanner(System.in);

        // 整数値Aの入力を促す
        System.out.print("整数値A：");
        // 整数値Aの入力値を変数に代入
        int intValueA = stdIn.nextInt();
        // 整数値Bの入力を促す
        System.out.print("整数値B：");
        // 入力値を変数に代入
        int intValueB = stdIn.nextInt();

        // 整数値Bが整数値Aの約数かどうかを判断する
        if(intValueA % intValueB == 0 )
        	// 「BはAの約数です」と表示する
        	System.out.println("BはAの約数です。");
        else
        	// 「BはAの約数ではありません。」と表示する
        	System.out.println("BはAの約数ではありません。");
    }
}
