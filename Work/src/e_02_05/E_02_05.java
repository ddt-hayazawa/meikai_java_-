package e_02_05;
import java.util.Scanner;

public class E_02_05 {
	public static void main(String[] args){
		// 二つの実数値を読み込みその和と平均を表示する
		Scanner stdIn = new Scanner(System.in);// scannerクラスのインスタンスを作成

		System.out.print("xの値："); 	// 入力を促す「xの値」と表示
		double x = stdIn.nextDouble(); 	// xに整数値を読み込む

		System.out.print("yの値："); 	// 入力を促す「yの値」と表示
		double y = stdIn.nextDouble(); 	// yに整数値を読み込む

		System.out.println("合計は" + (x + y) + "です。"); // xとyの合計を表示する
		System.out.println("平均は" + ((x + y)/ 2) + "です。"); // xとyの平均を表示する
		}
	}
