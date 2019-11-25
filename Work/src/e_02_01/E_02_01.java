package e_02_01;

public class E_02_01 {

	// 整数型の変数に小数部を持つ数字を代入し確認
	public static void main(String[] args){
		int x; // int型の変数xを宣言
		int y; // int型の変数yを宣言

		x = 1.5; // int型の変数xに小数を代入
		y = 2.5; // int型の変数yに小数を代入

		System.out.println("xの値は" + x + "です。"); // xの値を表示
		System.out.println("xの値は" + y + "です。"); // yの値を表示

		System.out.println("合計は" + (x + y) + "です。"); // 合計を表示
		System.out.println("合計は" + (x + y) / 2 + "です。"); // 平均を表示

	// 結果：「型の不一致：doubleからintには変換できません」と表示されエラー
	}

}
