package e_03_01;
import java.util.Scanner;

public class E_03_01 {
    //整数値を読み込んでその絶対値を求めて表示する
    public static void main(String[] args){
        // Scannerクラスのインスタンスを生成
        Scanner stdIn = new Scanner(System.in);

        // 整数値の入力を促す
        System.out.print("整数値：");
        // 入力値を変数に代入
        int intValue = stdIn.nextInt();

        // 絶対値算出用の-1を変数に代入
        int absoluteValue = -1;

        if(intValue < 0)
            // 入力値が0未満(マイナス)であればマイナスをかけて絶対値を算出
            intValue = intValue * absoluteValue;
        // 算出した絶対値を表示
        System.out.println("その絶対値は" + intValue + "です。" );
    }

}
