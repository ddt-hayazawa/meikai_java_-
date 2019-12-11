package e_03_04;
import java.util.Scanner;

public class E_03_04 {
    //二つの変数の大小関係を判断し表示する
    public static void main(String[] args){
        // Scannerクラスのインスタンスを生成
        Scanner stdIn = new Scanner(System.in);

        // 整数値Aの入力を促す
        System.out.print("整数値A：");
        // 整数値Aの入力値を変数に代入
        int intValueA = stdIn.nextInt();

        //整数値Bの入力を促す
        System.out.print("整数値B：");
        // 整数値の入力値を変数に代入
        int intValueB = stdIn.nextInt();

        if(intValueA == intValueB)
        	// AとBがイコールだったパターンの表示
        	System.out.println("aとbは同じ値です。");
        else if(intValueA > intValueB)
        	// Aのほうが大きいパターンの表示
        	System.out.println("aのほうが大きいです。");
        else if(intValueA < intValueB)
        	// Bのほうが大きいパターンの表示
        	System.out.println("bのほうが大きいです。");
    }
}
