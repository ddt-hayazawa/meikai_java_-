package e_02_10;
import java.util.Scanner;

public class E_02_10 {
	public static void main(String[] args){
		// Scannerクラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		// 姓の入力を促す
		System.out.print("姓：");
		// 入力された姓を変数に代入
		String firstName = stdIn.nextLine();

		// 名前の入力を促す
		System.out.print("名：");
		// 入力された名前を変数に代入
		String lastName = stdIn.nextLine();

		// 入力された姓と名前を並列に表示
		System.out.println("こんにちは" + firstName + lastName + "さん。");
	}
}
