package e_03_17;
import java.util.Random;

public class E_03_17 {
	// ランダムで0～2までの値を生成しグーチョキパーで表示する
	public static void main(String[] args){
		// ランダムインスタンスを生成
		Random rand = new Random();

		// ランダムで0～2までの乱数を生成
		int randVal = rand.nextInt(3);

		switch(randVal) {
		case 0:
			// 値が0の時はグーと表示
			System.out.println("グー");
			break;
		case 1:
			// 値が1の時はチョキと表示
			System.out.println("チョキ");
			break;
		case 2:
			// 値が2の時はパーと表示
			System.out.println("パー");
			break;
 		}
	}
}
