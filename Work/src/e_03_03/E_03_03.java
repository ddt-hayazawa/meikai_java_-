package e_03_03;
import java.util.Scanner;

public class E_03_03 {
    //List3-5の最後のelseをelse if(n == 0)に変更した際の挙動確認
    public static void main(String[] args){
        // Scannerクラスのインスタンスを生成
        Scanner stdIn = new Scanner(System.in);

        // 整数値の入力を促す
        System.out.print("整数値：");
        // 整数値の入力値を変数に代入
        int intValue = stdIn.nextInt();

        //
        if(intValue > 0)
        	System.out.println("その値は正です。");
        else if(intValue < 0)
        	System.out.println("その値は負です。");
        else if(intValue == 0)
        	System.out.println("その値は0です。");

        // 上二つの条件を通過してるパターンが「n==0」のみのため
        // n==0と条件を足してもコンパイル結果は変わらないことを確認
    }
}
